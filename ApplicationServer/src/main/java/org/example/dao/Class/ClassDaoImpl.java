package org.example.dao.Class;

import org.example.model.ClassModel;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ClassDaoImpl implements ClassDao
{

  public ClassDaoImpl()
  {
    try
    {
      Class.forName("org.postgresql.Driver");
    }
    catch (ClassNotFoundException e)
    {
      throw new RuntimeException("PostgreSQL driver not found", e);
    }
  }

  private Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=GradingSystem", //jdbc:postgresql://localhost:5432/postgres?currentSchema=GradingSystem
        "postgres", "password");
  }

  @Override
  public String createClass(String Name, String TeacherId, List<String> StudentsIds, int Id)
  {

    System.out.println("Name: " + Name);
    try (Connection connection = getConnection())
    {

      System.out.println("Name2: " + Name);
      // Implement the logic to add a class to the database
      // You may use PreparedStatement for SQL operations
      // Example: PreparedStatement statement = connection.prepareStatement("INSERT INTO ...");
    }
    catch (SQLException e)
    {
      System.out.println("Error creating class: " + e.getMessage());
      // Handle SQL exceptions
      return "Error creating class: " + e.getMessage();
    }
    return "Class created successfully";
  }

  @Override
  public String deleteClass(int Id)
  {
    try (Connection connection = getConnection())
    {

    }
    catch (SQLException e)
    {
      // Handle SQL exceptions
      return "Error deleting class: " + e.getMessage();
    }
    return "Class deleted successfully";
  }

  @Override
  public String updateClass(String Name, String TeacherId, List<String> StudentsIds, int Id)
  {
    try (Connection connection = getConnection())
    {
      // Implement the logic to edit a class in the database
      // You may use PreparedStatement for SQL operations
      // Example: PreparedStatement statement = connection.prepareStatement("UPDATE ...");
    }
    catch (SQLException e)
    {
      // Handle SQL exceptions
      return "Error updating class: " + e.getMessage();
    }
    return "Class updated successfully";
  }

  @Override
  public String getClass(String Name, String teacherId, List<String> StudentsIds, int Id)
  {
    try (Connection connection = getConnection())
    {
      // Implement the logic to get a class from the database
      // You may use PreparedStatement for SQL operations
      // Example: PreparedStatement statement = connection.prepareStatement("SELECT ...");
    }
    catch (SQLException e)
    {
      // Handle SQL exceptions
      return "Error getting class: " + e.getMessage();
    }
    return "Class retrieved successfully";
  }


  @Override
  public List<ClassModel> getAllClasses() {
    List<ClassModel> classes = new ArrayList<>();

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM class_table")) {

      while (resultSet.next()) {
        String Name = resultSet.getString("class_name_column");
        int Id = resultSet.getInt("class_id_column");
        String TeacherId = resultSet.getString("teacher_id_column");
        List<String> StudentsIds = Collections.singletonList(resultSet.getString("student_id_column"));


        ClassModel classModel = new ClassModel(Name, TeacherId, StudentsIds, Id);
        classes.add(classModel);
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return classes;
  }

  @Override
  public List<ClassModel> filterClasses(String Name, String teacherId, List<String> StudentsIds, int Id)
  {
    List<ClassModel> filteredClasses = new ArrayList<>();

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM class_table WHERE name_column = ?")) {

      statement.setString(1, Name);
      statement.setString(2, teacherId);
      statement.setString(3, StudentsIds.toString());
      statement.setInt(4, Id);

      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          String resultName = resultSet.getString("name_column");
          String resultTeacherId = resultSet.getString("teacher_id_column");
          List<String> resultStudentsIds = Collections.singletonList(resultSet.getString("student_id_column"));
          int resultId = resultSet.getInt("id_column");

          ClassModel classModel = new ClassModel(resultName, resultTeacherId, resultStudentsIds, resultId);
          filteredClasses.add(classModel);
        }
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return filteredClasses;
  }

  @Override
  public List<ClassModel> filter(String Name, String teacherId, List<String> StudentsIds, int Id, String... attrs) {
    List<ClassModel> filteredClasses = new ArrayList<>();

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM class_table WHERE attribute_column = ?")) {

      for (String attr : attrs) {
        statement.setString(1, attr);
        statement.setString(2, Name);
        statement.setString(3, teacherId);
        statement.setString(4, StudentsIds.toString());
        statement.setInt(5, Id);


        try (ResultSet resultSet = statement.executeQuery()) {
          while (resultSet.next()) {
            String resultName = resultSet.getString("class_name_column");
            String resultTeacherId = resultSet.getString("teacher_id_column");
            List<String> resultStudentsIds = Collections.singletonList(resultSet.getString("student_id_column"));
            int resultId = resultSet.getInt("class_id_column");

            ClassModel classModel = new ClassModel(resultName, resultTeacherId, resultStudentsIds, resultId);
            filteredClasses.add(classModel);
          }
        }
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return filteredClasses;
  }
}