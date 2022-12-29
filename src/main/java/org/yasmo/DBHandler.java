package org.yasmo;

import java.sql.*;
import java.util.Scanner;
public class DBHandler extends Config
{
    //DataBase SQL Connection
    Connection DBConnection;
    public Connection getDBConnection() throws SQLException {

        try(Connection ConnDb = DriverManager.getConnection(ConnUrl, DBLog, Pass);
              Statement statement = ConnDb.createStatement()) {
            String login_db = "null";
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите логин: ");
            String login = sc.nextLine();
            ResultSet rs = statement.executeQuery(String.format("SELECT * FROM users WHERE login = '%s'", login));

            while (rs.next()) {
                login_db = rs.getString(2);
            }
            if (!login_db.equals(login)) {
                System.out.print("Введите пароль: ");
                String pass = sc.nextLine();
                System.out.println("Введите ваш пол: 1 - Мужской, 2 - Женский");
                int gender = Integer.parseInt(sc.nextLine());
                statement.executeUpdate(String.format("INSERT INTO users(login, pass, gender) VALUES ('%s', '%s', '%d')", login, pass, gender));
            }
            else
            {
                System.out.println("Данный логин занят");
            }
        }

        return DBConnection;
    }
}
