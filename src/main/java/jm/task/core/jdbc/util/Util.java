package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.ResourceBundle;

public class Util {

    public static Connection getConnection() throws SQLException {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        String dbUrl = resourceBundle.getString("dbUrl");
        String dbName = resourceBundle.getString("dbName");
        String dbPassword = resourceBundle.getString("dbPassword");

        return DriverManager.getConnection(dbUrl, dbName, dbPassword);

    }

}
