package org.example.dao.User;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class UserDaoImpl implements UserDao
{
  private Connection getConnection() throws
      SQLException      // This method is used to connect to the database
  {
    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=GradingSystem",
        "postgres", "password"
    );
  }

  @Override
  public String createUser(String id,String name ,String password)
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "INSERT INTO user_table (Id, password) VALUES (?, ?)")) {

      statement.setString(1, id);
      statement.setString(2, password);
      statement.setString(3, name);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return id;
  }

  @Override
  public String deleteUser(String id)
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "DELETE FROM user_table WHERE id = ?")) {

      statement.setString(1, id);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return id;
  }

  @Override
  public String updateUser(String id,String name,String password)
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "UPDATE user_table SET password = ? WHERE id = ?")) {

      statement.setString(1, password);
      statement.setString(2, id);
      statement.setString(3, name);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return id;
  }

  @Override
  public String getUserById(String id)
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "SELECT * FROM user_table WHERE id = ?")) {

      statement.setString(1, id);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return id;
  }

  @Override
  public String getAllUsers()
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "SELECT * FROM user_table")) {

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return "All users";
  }

  @Override
  public String filterUsersByUsername(String password)
  {
    try (Connection connection = getConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(
            "SELECT * FROM user_table WHERE password = ?")) {

      statement.setString(1, password);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return password;
  }
}
