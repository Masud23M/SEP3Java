package org.example.dao.Supervisor;

import org.example.model.SupervisorModel;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class SupervisorDaoImpl implements SupervisorDao
{
  private Connection getConnection() throws SQLException
  {

    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=GradingSystem",
        "postgres", "password");
  }

  @Override
  public String createSupervisor(String Id, String password)
  {
    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(
            "INSERT INTO supervisor_table (Id, password) VALUES (?, ?, ?, ?)")) {

      statement.setString(1, Id);
      statement.setString(2, password);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return Id;
  }

  @Override
  public String deleteSupervisor(String Id, String password)
  {
    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(
            "DELETE FROM supervisor_table WHERE id = ?")) {

      statement.setString(1, Id);
      statement.setString(2, password);

      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return Id;
  }

  @Override
  public String updateSupervisor(String Id, String password)
  {
    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(
            "UPDATE supervisor_table SET Id = ?, password = ? WHERE id = ?")) {

      statement.setString(1, Id);
      statement.setString(2, password);


      statement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }
    return Id;
  }

  @Override
  public SupervisorModel getSupervisorById(String Id)
  {
    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(
            "SELECT * FROM supervisor_table WHERE id = ?")) {

      statement.setString(1, Id);

      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          Id = resultSet.getString("Id");
          String password = resultSet.getString("password");

          return new SupervisorModel(Id, password);
        }
      }

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }

    return null;
  }

  @Override
  public List<SupervisorModel> getAllSupervisors()
  {
    List<SupervisorModel> supervisors = new ArrayList<>();

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM supervisor_table")) {

      while (resultSet.next()) {
        String Id = resultSet.getString("Id");
        String password = resultSet.getString("password");

        SupervisorModel supervisor = new SupervisorModel(Id, password);
        supervisors.add(supervisor);
      }

    } catch (SQLException e) {
      e.printStackTrace(); // Handle or log the exception
    }

    return supervisors;
  }
}
