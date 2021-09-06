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
	return prest;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean createTable(String query) {

	return false;
    }

    @Override
    public boolean isTable(String table) {

	return false;
    }

    @Override
    public boolean isCollumn(String table, String collumn) {

	return true;
    }

    @SuppressWarnings("resource")
    @Override
    public boolean addCollumn(String table, String collumn, String type) {
	return true;
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
