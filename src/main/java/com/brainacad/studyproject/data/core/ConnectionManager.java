package com.brainacad.studyproject.data.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Fujitsu on 05.11.2016.
 */
public class ConnectionManager {

    private static ConnectionManager instance;

    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return JdbcConnectionPool.getInstance().getConnection();
    }

    public void closeConnection(Connection connection) {
        JdbcConnectionPool.getInstance().releaseConnection(connection);
    }

}

