package org.example.dao.Teacher;

import org.example.model.TeacherModel;

import java.util.List;

public interface TeacherDao
{
  TeacherModel createTeacher(TeacherModel teacherModel);
  String deleteTeacher(String id);
  String updateTeacher(TeacherModel teacherModel);
  TeacherModel getTeacherById(String id);
  List<TeacherModel> getAllTeachers();
  List<TeacherModel> filterTeachersByUsername(String username);
}
