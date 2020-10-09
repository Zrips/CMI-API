package com.Zrips.CMI.Modules.DataBase;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Zrips.CMI.CMI;

public class DBConnectionPool {
    private DBConnection connection;
    private String url;
    private String username;
    private String password;
    public DBConnectionPool(String driverName, String url, String username, String password) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

    }
    
    public synchronized DBConnection getConnection() throws SQLException {
	return null;
    }
    
    public synchronized void closeConnection() {

    }
}
