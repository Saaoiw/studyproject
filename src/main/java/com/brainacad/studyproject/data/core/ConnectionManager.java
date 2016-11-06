package com.brainacad.studyproject.data.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Fujitsu on 05.11.2016.
 */
public class ConnectionManager {

    private static ConnectionManager instance;

    private ConnectionManager(){
        }

    public static ConnectionManager getInstance(){
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brain?useUnicode\\=true&characterEncoding\\=UTF-8", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
