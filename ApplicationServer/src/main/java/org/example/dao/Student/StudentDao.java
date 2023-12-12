package org.example.dao.Student;

import org.example.model.StudentModel;

import java.util.List;

public interface StudentDao
{
  StudentModel createStudent(StudentModel studentModel);
  String deleteStudent(String id);
  String updateStudent(StudentModel studentModel);
  StudentModel getStudentById(String id);
  List<StudentModel> getAllStudents();
  List<StudentModel> filterStudentsByUsername(String username);
}
