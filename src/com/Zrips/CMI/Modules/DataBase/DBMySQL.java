package com.Zrips.CMI.Modules.DataBase;

import java.sql.PreparedStatement;
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

        return true;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isTable(String table) {

        return false;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean isCollumn(String table, String collumn) {
        return false;

    }

    @SuppressWarnings("resource")
    @Override
    public boolean addCollumn(String table, String collumn, String type) {

        return false;

    }

    @SuppressWarnings("resource")
    @Override
    public boolean truncate(String table) {

        return false;

    }

    @Override
    public String getTableCharSet(DBTables table) {

        return null;

    }

    @Override
    public String getTableRowFormat(DBTables table) {

        return null;

    }

    @Override
    public boolean convertTableToUTF8(DBTables table) {

        return true;
    }

    @Override
    public boolean convertTableRowFormat(DBTables table) {

        return true;
    }
}
