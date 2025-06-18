package com.Zrips.CMI.Modules.DataBase;

import java.sql.SQLException;
import java.sql.Statement;

import com.Zrips.CMI.CMI;

public class DBMySQL extends DBDAO {
    private CMI plugin;
    private String database;
    private static String path;

    public DBMySQL(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl) {
        super(plugin, path, "jdbc:mysql://" + hostname + "/" + database + "?autoReconnect=" + autoReconnect + "&useSSL=" + ssl + "&verifyServerCertificate=" + certificate + "&allowPublicKeyRetrieval=true"
            + "&useUnicode=true&characterEncoding=utf8mb4_unicode_ci", username, password, prefix);
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
        return false;
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
        return false;
    }

    @Override
    public boolean convertTableRowFormat(DBTables table) {
        return false;
    }
}
