package com.tinder.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String path = "jdbc:postgresql://aizffrzhrbusqj:ec895b98cf773ca62ae900e1a49510de5b1b62d3e38ea58d5082c08c576bf92f@ec2-18-204-74-74.compute-1.amazonaws.com:5432/d65gpbfgs75bhf";
    private String username = "aizffrzhrbusqj";
    private String password = "ec895b98cf773ca62ae900e1a49510de5b1b62d3e38ea58d5082c08c576bf92f";

    private Connection connection = null;

    private Connection connect() throws SQLException {

        return DriverManager.getConnection(path, username, password);

    }

    public Connection connection() {

        if (connection == null) {
            try {
                connection = connect();
            } catch (SQLException e) {
                throw new IllegalStateException("Something went wrong.");
            }
        }

        return this.connection;

    }

}
