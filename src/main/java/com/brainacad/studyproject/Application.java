package com.brainacad.studyproject;

import java.sql.*;

public class Application {

    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/brain?useUnicode\\=true&characterEncoding\\=UTF-8", "root", "root");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()){
                    System.out.println(resultSet.getInt("user_id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

