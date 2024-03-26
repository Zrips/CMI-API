package com.Zrips.CMI.Modules.DataBase;

import java.io.File;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;

public class DBSQLite extends DBDAO {
//    private CMI plugin;

    public void initialize() {
	try {
	    this.setUp();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

//    public DBSQLite initialize(File dir) {
//	if (!dir.exists())
//	    dir.mkdirs();
//	try {
//	    this.setUp();
//	} catch (SQLException e) {
//	    e.printStackTrace();
//	}
//	return this;
//    }

    DBSQLite(CMI plugin, File file) {
	super(plugin, "org.sqlite.JDBC", "jdbc:sqlite:" + new File(file, "cmi.sqlite.db").getPath(), null, null, "");
	if (!file.exists())
	    file.mkdirs();
	this.setDbType(DataBaseType.SqLite);
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
	Statement statement = null;
	try {
	    if (query == null || query.equals("")) {
		plugin.consoleMessage("&cCould not create table: query is empty or null.");
		return false;
	    }

	    statement = getConnection().createStatement();
	    statement.execute(query);
	    statement.close();
	    return true;
	} catch (SQLException e) {
	    plugin.consoleMessage("&cCould not create table, SQLException: " + e.getMessage());
	    this.close(statement);
	    return false;
	}
    }

    @Override
    public boolean isTable(String table) {
	DatabaseMetaData md = null;
	try {
	    md = this.getConnection().getMetaData();
	    ResultSet tables = md.getTables(null, null, table, null);
	    if (tables.next()) {
		tables.close();
		return true;
	    }
	    tables.close();
	    return false;
	} catch (SQLException e) {
	    plugin.consoleMessage("&cCould not check if table \"" + table + "\" exists, SQLException: " + e.getMessage());
	    return false;
	}
    }

    @Override
    public boolean isCollumn(String table, String column) {
	DatabaseMetaData md = null;
	try {
	    md = this.getConnection().getMetaData();
	    ResultSet tables = md.getColumns(null, null, table, column);
	    if (tables.next()) {
		tables.close();
		return true;
	    }
	    tables.close();
	    return false;
	} catch (SQLException e) {
	    plugin.consoleMessage("&cCould not check if table \"" + table + "\" exists, SQLException: " + e.getMessage());
	    return false;
	}
    }

    @SuppressWarnings("resource")
    @Override
    public boolean addCollumn(String table, String collumn, String type) {
	Statement statement;
	try {
	    statement = getConnection().createStatement();
	} catch (SQLException e) {
	    plugin.consoleMessage("&cCould not add new collumn, SQLException: " + e.getMessage());
	    return false;
	}
	try {
	    statement.executeQuery("ALTER TABLE " + table + " ADD " + collumn + " " + type);
	    statement.close();
	    return true;
	} catch (SQLException e) {
	    this.close(statement);
	    return false;
	}
    }

    @SuppressWarnings("resource")
    @Override
    public boolean truncate(String table) {
	Statement statement = null;
	try {
	    if (!this.isTable(table)) {
		plugin.consoleMessage("&cTable \"" + table + "\" does not exist.");
		return false;
	    }
	    statement = getConnection().createStatement();
	    statement.executeQuery("DELETE FROM " + table + ";");
	    statement.close();
	    return true;
	} catch (SQLException e) {
	    if (!(e.getMessage().toLowerCase().contains("locking") || e.getMessage().toLowerCase().contains("locked")) &&
		!e.toString().contains("not return ResultSet"))
		plugin.consoleMessage("&cError in wipeTable() query: " + e);
	    this.close(statement);
	    return false;
	}
    }

    @Override
    public String getTableCharSet(DBTables table) {
	return null;
    }

    @Override
    public boolean convertTableToUTF8(DBTables table) {
	return true;
    }

    @Override
    public String getTableRowFormat(DBTables table) {
	return null;
    }

    @Override
    public boolean convertTableRowFormat(DBTables table) {
	return true;
    }
}
