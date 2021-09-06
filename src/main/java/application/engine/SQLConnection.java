package application.engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLConnection {

    public SQLConnection() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connection;

    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/vinylDB" +
                "?useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("SQL_USER"));
        properties.put("password", System.getenv("SQL_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }
}
