package org.example.dao.Class;

import org.example.model.ClassModel;

import java.util.List;

public interface ClassDao
{
  String createClass(String Name, String TeacherId, List<String> StudentsIds, int Id);
  String updateClass(String Name, String TeacherId, List<String> StudentsIds, int Id);
  String deleteClass(int Id);
  String getClass(String Name, String teacherId, List<String> StudentsIds, int Id);
  List<ClassModel> getAllClasses();
  List<ClassModel> filterClasses(String Name, String teacherId, List<String> StudentsIds, int Id);
  //List<ClassModel> filter(String Name, String...attr);
  List<ClassModel> filter(String Name, String TeacherId, List<String> StudentsIds, int Id ,String... attrs);
}
