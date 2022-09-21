package service;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    private String link;
    private String username;
    private String password;

    public DataBase() {
        this.link = "jdbc:postgresql://127.0.0.1:5432/users";
        this.username = "postgres";
        this.password = "meepo";
    }
    public boolean checkCorrectLogin(String login,String password) {
        String SQL_SELECT = String.format("select * from entry where login='%s' and password='%s'",login,password);
        try (Connection conn = DriverManager.getConnection(link,username,password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
