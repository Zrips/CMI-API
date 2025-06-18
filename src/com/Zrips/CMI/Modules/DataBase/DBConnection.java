package com.Zrips.CMI.Modules.DataBase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private Connection conn;

    public DBConnection(Connection conn) {
    }

    public synchronized boolean isClosed() {
        return false;
    }

    public synchronized boolean isValid(int timeout) throws SQLException {
        return false;
    }

    public synchronized void closeConnection() throws SQLException {
    }

    public synchronized Statement createStatement() throws SQLException {
        return null;
    }

    public synchronized PreparedStatement prepareStatement(String sql) throws SQLException {
        return null;
    }

    public synchronized PreparedStatement prepareStatement(String sql, int returnGeneratedKeys) throws SQLException {
        return null;
    }

    public synchronized void setAutoCommit(Boolean mode) throws SQLException {
    }

    public synchronized void commit() throws SQLException {
    }

    public synchronized DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }
}
