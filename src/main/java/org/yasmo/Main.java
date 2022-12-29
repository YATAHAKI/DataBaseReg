package org.yasmo;

import java.sql.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        DBHandler dbhan = new DBHandler();
        dbhan.getDBConnection();
    }
}