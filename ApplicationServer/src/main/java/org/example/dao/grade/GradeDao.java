package org.example.dao.grade;

import org.example.model.GradeModel;

import java.util.List;

public interface GradeDao
{
  String createGrade(int Id,String ExamId, String StudentId, int StudentGrade);
  List<GradeModel> getAllGrades();

  String getGradeByStudentId(String StudentId);
}
