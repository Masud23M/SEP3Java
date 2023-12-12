package org.example.dao.Exam;

import org.example.model.ExamModel;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExamDaoImpl implements ExamDao
{
  public ExamDaoImpl()
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
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=GradingSystem",
        "postgres", "password");
  }

  @Override
  public String createExam(int IdOfExam, String NameOfExam, String dt, String SchoolClass)
  {
    try (Connection connection = getConnection()) {
      // Implement the logic to add a class to the database
      // You may use PreparedStatement for SQL operations
      // Example: PreparedStatement statement = connection.prepareStatement("INSERT INTO ...");
    } catch (SQLException e) {
      // Handle SQL exceptions
      return "Error creating exam: " + e.getMessage();
    }
    return "Exam created successfully";
  }

  @Override
  public String deleteExam(int IdOfExam, String NameOfExam, String dt, String SchoolClass)
  {
    try (Connection connection = getConnection()) {

    } catch (SQLException e) {
      // Handle SQL exceptions
      return "Error deleting exam: " + e.getMessage();
    }
    return "Exam deleted successfully";
  }

  @Override
  public String updateExam(int IdOfExam, String NameOfExam, String dt, String SchoolClass)
  {
    try (Connection connection = getConnection()) {

    } catch (SQLException e) {
      // Handle SQL exceptions
      return "Error updating exam: " + e.getMessage();
    }
    return "Exam updated successfully";
  }

  @Override
  public List<ExamModel> getAllExams() {
    List<ExamModel> exams = new ArrayList<>();

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM exam_table")) {

      while (resultSet.next()) {
        int IdOfExam = resultSet.getInt("id_of_exam_column");
        String NameOfExam = resultSet.getString("name_of_exam_column");
        String dt = resultSet.getString("dt_column");
        String SchoolClass = resultSet.getString("school_class_column");

        ExamModel examModel = new ExamModel(IdOfExam, NameOfExam, dt, SchoolClass);
        exams.add(examModel);
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return exams;
  }

  @Override
  public List<ExamModel> filterExams(int IdOfExam, String NameOfExam, String dt, String SchoolClass)
  {
    List<ExamModel> filteredExams = new ArrayList<>();

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM exam_table WHERE name_of_exam_column = ? AND grade_column = ? AND dt_column = ? AND school_class_column = ?")) {
      statement.setInt(1, IdOfExam);
      statement.setString(2, NameOfExam);
      statement.setString(3, dt);
      statement.setString(4, SchoolClass);

      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          int resultIdOfExam = resultSet.getInt("id_of_exam_column");
          String resultNameOfExam = resultSet.getString("name_of_exam_column");
          String resultdt = resultSet.getString("dt_column");
          String resultSchoolClass = resultSet.getString("school_class_column");

          ExamModel examModel = new ExamModel(resultIdOfExam, resultNameOfExam, resultdt, resultSchoolClass);
          filteredExams.add(examModel);
        }
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return filteredExams;
  }

  @Override
  public List<ExamModel> filter(int IdOfExam, String NameOfExam, String dt, String SchoolClass, String... attrs)
  {
    List<ExamModel> filteredExams = new ArrayList<>();

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM exam_table WHERE name_of_exam_column = ? AND grade_column = ? AND dt_column = ? AND school_class_column = ?")) {
      statement.setInt(1, IdOfExam);
      statement.setString(1, NameOfExam);
      statement.setString(3, dt);
      statement.setString(4, SchoolClass);

      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          int resultIdOfExam = resultSet.getInt("id_of_exam_column");
          String resultNameOfExam = resultSet.getString("name_of_exam_column");
          String resultdt = resultSet.getString("dt_column");
          String resultSchoolClass = resultSet.getString("school_class_column");

          ExamModel examModel = new ExamModel(resultIdOfExam, resultNameOfExam, resultdt, resultSchoolClass);
          filteredExams.add(examModel);
        }
      }

    } catch (SQLException e) {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return filteredExams;
  }
}
