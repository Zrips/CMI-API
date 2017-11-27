package com.Zrips.CMI.Modules.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;

public class DBMySQL extends DBDAO {
    private String database;
    private CMI plugin;

    DBMySQL(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
	super(plugin, "com.mysql.jdbc.Driver", "jdbc:mysql://" + hostname + "/" + database + "?autoReconnect=" + autoReconnect + "&useSSL=" + ssl + "&verifyServerCertificate=" + certificate, username,
	    password, prefix);
    }

    public void initialize() {
	try {
	    setUp();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

    public DBMySQL initialize(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
	return null;
    }

    @Override
    protected synchronized void setupConfig() throws SQLException {

    }

    @Override
    protected synchronized void checkUpdate() throws SQLException {

    }

    private boolean createDefaultUsersBase() {
	return true;
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
}
