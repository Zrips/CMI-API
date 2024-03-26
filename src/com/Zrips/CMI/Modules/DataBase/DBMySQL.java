package com.Zrips.CMI.Modules.DataBase;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;

public class DBMySQL extends DBDAO {
    private CMI plugin;
    private String database;

    private static String path = "";

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            path = "com.mysql.cj.jdbc.Driver";
        } catch (Throwable e) {
            path = "com.mysql.jdbc.Driver";
        }

        String major = "";

        String[] javaVersionElements = System.getProperty("java.runtime.version").split("\\.|_|-b");
        try {
            major = javaVersionElements[0];
        } catch (Throwable e) {
            String d = System.getProperty("java.version");
            String[] s = d.split("_")[0].split(".");
            major = s[1];
        }
        CMI.getInstance().consoleMessage("Detected Java" + major);
    }

    public DBMySQL(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
        super(plugin, path, "jdbc:mysql://" + hostname + "/" + database + "?autoReconnect=" + autoReconnect + "&useSSL=" + ssl +
            "&verifyServerCertificate=" + certificate +
            "&allowPublicKeyRetrieval=true" +
            "&useUnicode=true&characterEncoding=utf8mb4_unicode_ci", username,
            password, prefix);
        this.plugin = plugin;
        this.database = database;
        this.setDbType(DataBaseType.MySQL);
    }

    public void initialize() {
        try {
            setUp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DBMySQL initialize(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
        this.plugin = plugin;
        DBMySQL dao = new DBMySQL(plugin, hostname, database, username, password, prefix, autoReconnect, certificate, ssl);
        try {
            dao.setUp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }

    @Override
    public Statement prepareStatement(String query) throws SQLException {
        DBConnection conn = getConnection();
        if (conn == null)
            return null;
        PreparedStatement prest = null;
        try {
            prest = conn.prepareStatement(query);
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
        return prest;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean createTable(String query) {
        plugin.consoleMessage(query);
        Statement statement = null;
        if (query == null || query.equals("")) {
            plugin.consoleMessage("&cCould not create table: query is empty or null.");
            return false;
        }
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            statement = conn.createStatement();
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not create table, SQLException: " + e.getMessage());
            this.close(statement);
            return false;
        } finally {
            this.close(statement);
        }
        return true;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isTable(String table) {
        Statement statement = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not check if its table, SQLException: " + e.getMessage());
            return false;
        } finally {
            close(statement);
        }
        try {
            ResultSet tables = conn.getMetaData().getTables(database, null, table, new String[] { "TABLE" });
            return tables.next();
        } catch (SQLException e) {
            plugin.consoleMessage("Not a table |" + "SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME ='" + table + "';" + "|");
        }
        PreparedStatement insert = null;
        ResultSet res = null;
        try {

            insert = conn.prepareStatement("SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME ='" + table + "';");
            res = insert.executeQuery();
            if (res.next()) {
                res.close();
                insert.close();
                return true;
            }
            return false;
        } catch (SQLException e) {
            plugin.consoleMessage("Not a table |" + "SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME ='" + table + "';" + "|");
            return false;
        } finally {
            close(statement);
            close(insert);
            close(res);
        }
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isCollumn(String table, String collumn) {
        Statement statement = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not check if its collumn, SQLException: " + e.getMessage());
            return false;
        } finally {
            this.close(statement);
        }

        ResultSet res = null;
        try {
            DatabaseMetaData md = conn.getMetaData();
            res = md.getColumns(database, null, table, collumn);
            if (res.next()) {
                res.close();
                return true;
            }
            return false;
        } catch (SQLException e1) {
//	    e1.printStackTrace();
        } finally {
            this.close(res);
        }

        return false;
//	PreparedStatement insert = null;
//
//	try {
//	    insert = conn.prepareStatement("SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='" + database + "' AND TABLE_NAME ='" + table + "' AND COLUMN_NAME='" + collumn + "';");
//	    res = insert.executeQuery();
//	    if (res.next()) {
//		res.close();
//		insert.close();
//		return true;
//	    }
//	    return false;
//	} catch (SQLException e) {
//	    plugin.consoleMessage("Not a culumn |" + "SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='" + database + "' AND TABLE_NAME ='" + table + "' AND COLUMN_NAME='" + collumn + "';"
//		+ "|");
//	    return false;
//	} finally {
//	    this.close(insert);
//	    this.close(res);
//	}
    }

    @SuppressWarnings("resource")
    @Override
    public boolean addCollumn(String table, String collumn, String type) {
        Statement statement;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not add new collumn, SQLException: " + e.getMessage());
            return false;
        }
        try {
            plugin.consoleMessage("Creating culumn |" + table + " " + collumn + " " + type + "|");
            statement.executeUpdate("ALTER TABLE `" + table + "` ADD COLUMN `" + collumn + "` " + type + ";");
            statement.close();
            return true;
        } catch (SQLException e) {
            this.close(statement);
            e.printStackTrace();
            return false;
        }
    }

    @SuppressWarnings("resource")
    @Override
    public boolean truncate(String table) {
        Statement statement = null;
        String query = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            if (!this.isTable(table)) {
                plugin.consoleMessage("&cTable \"" + table + "\" does not exist.");
                return false;
            }
            statement = conn.createStatement();
            query = "DELETE FROM " + table + ";";
            statement.executeUpdate(query);
            statement.close();

            return true;
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not wipe table, SQLException: " + e.getMessage());
            this.close(statement);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String getTableCharSet(DBTables table) {
        Statement statement = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return null;

        try {
            if (!this.isTable(table.getTableName())) {
                plugin.consoleMessage("&cTable \"" + table.getTableName() + "\" does not exist.");
                return null;
            }

            PreparedStatement insert = conn.prepareStatement("SELECT TABLE_SCHEMA, TABLE_NAME, TABLE_COLLATION, ROW_FORMAT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='" + table.getTableName()
                + "';");

            ResultSet res = insert.executeQuery();

            String value = null;
            if (res.next()) {
                value = res.getString(3);
            }
            res.close();
            insert.close();

            return value;
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not check table chatser, SQLException: " + e.getMessage());
            this.close(statement);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getTableRowFormat(DBTables table) {
        Statement statement = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return null;

        try {
            if (!this.isTable(table.getTableName())) {
                plugin.consoleMessage("&cTable \"" + table.getTableName() + "\" does not exist.");
                return null;
            }

            PreparedStatement insert = conn.prepareStatement("SELECT ROW_FORMAT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='" + table.getTableName() + "';");

            ResultSet res = insert.executeQuery();

            String value = null;
            if (res.next()) {
                value = res.getString(1);
            }
            res.close();
            insert.close();
            return value;
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not check table chatser, SQLException: " + e.getMessage());
            this.close(statement);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean convertTableToUTF8(DBTables table) {
        Statement statement = null;
        String query = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;

        try {
            if (!this.isTable(table.getTableName())) {
                plugin.consoleMessage("&cTable \"" + table.getTableName() + "\" does not exist.");
                return false;
            }
            statement = conn.createStatement();
            query = "ALTER TABLE `" + table.getTableName() + "` CONVERT TO CHARSET utf8;";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            plugin.consoleMessage("&cCould not convert table, SQLException: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close(statement);
        }
        return true;
    }

    @Override
    public boolean convertTableRowFormat(DBTables table) {
        Statement statement = null;
        String query = null;
        DBConnection conn = getConnection();
        if (conn == null)
            return false;
        try {
            if (!this.isTable(table.getTableName())) {
                plugin.consoleMessage("&cTable \"" + table.getTableName() + "\" does not exist.");
                return false;
            }
            statement = conn.createStatement();
            query = "ALTER TABLE " + table.getTableName() + " ROW_FORMAT=DYNAMIC;";
            statement.executeUpdate(query);
        } catch (SQLException e) {
        } finally {
            close(statement);
        }
        return true;
    }
}
