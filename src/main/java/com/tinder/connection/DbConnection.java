package com.tinder.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String path = "postgres://dldplmkdamdbnf:4d5090f9d6bd25656771cf8af9d5cb1dbf33d69934e58f3bda85a5e7a32b4cbc@ec2-52-7-168-69.compute-1.amazonaws.com:5432/d113dena0hmoph";
    private String username = "dldplmkdamdbnf";
    private String password = "4d5090f9d6bd25656771cf8af9d5cb1dbf33d69934e58f3bda85a5e7a32b4cbc";

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
