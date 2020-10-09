package com.Zrips.CMI.Modules.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;

public class DBMySQL extends DBDAO {
    private CMI plugin;

    public DBMySQL(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
	super(plugin, "com.mysql.jdbc.Driver", "jdbc:mysql://" + hostname + "/" + database + "?autoReconnect=" + autoReconnect + "&useSSL=" + ssl +
	    "&verifyServerCertificate=" + certificate +
	    "&useUnicode=true&characterEncoding=utf8mb4_unicode_ci", username,
	    password, prefix);
	this.plugin = plugin;
	this.setDbType(DataBaseType.MySQL);
    }

    public void initialize() {
    }

    public DBMySQL initialize(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
	return null;
    }

    @Override
    public Statement prepareStatement(String query) throws SQLException {
	return null;
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
    public boolean convertTableToUTF8(DBTables table) {
	return true;
    }
}
