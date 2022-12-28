package org.yasmo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String ConnUrl = "jdbc:mysql://localhost:3306/DataBaseReg";
        String Login = "root";
        String Pass = "ToAAYoJKR2";

        try(Connection ConnDb = DriverManager.getConnection(ConnUrl, Login, Pass)) {
            System.out.println("DB connected");
    }


    }
}