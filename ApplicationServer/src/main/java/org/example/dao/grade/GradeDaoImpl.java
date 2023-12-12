package org.example.dao.grade;

import org.example.model.ClassModel;
import org.example.model.GradeModel;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.sql.DriverManager.getConnection;

@Service
public class GradeDaoImpl implements GradeDao
{

  public GradeDaoImpl()
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

  @Override public String createGrade(int Id, String ExamId, String StudentId,
      int StudentGrade)
  {
    try (Connection connection = getConnection())
    {
      // Implement the logic to add a class to the database
      // You may use PreparedStatement for SQL operations
      // Example: PreparedStatement statement = connection.prepareStatement("INSERT INTO ...");
    }
    catch (SQLException e)
    {
      // Handle SQL exceptions
      return "Error creating exam: " + e.getMessage();
    }
    return "Exam created successfully";
  }

  @Override public List<GradeModel> getAllGrades()
  {
    List<GradeModel> grades = new ArrayList<>();

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
            "SELECT * FROM grade_table"))
    {

      while (resultSet.next())
      {
        int Id = resultSet.getInt("id_column");
        String ExamId = resultSet.getString("exam_id_column");
        String StudentId = resultSet.getString("student_id_column");
        int StudentGrade = resultSet.getInt("student_grade_column");

        GradeModel gradeModel = new GradeModel(Id, ExamId, StudentId,
            StudentGrade);
        grades.add(gradeModel);
      }

    }
    catch (SQLException e)
    {
      // Handle SQL exceptions
      e.printStackTrace(); // Log the exception or throw a runtime exception
    }

    return grades;
  }

  @Override
  public String getGradeByStudentId(String StudentId)
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
      return "Error getting grade: " + e.getMessage();
    }
    return "Grade retrieved successfully";
  }

}
