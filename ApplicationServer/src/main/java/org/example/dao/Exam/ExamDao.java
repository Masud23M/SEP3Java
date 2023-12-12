package org.example.dao.Exam;

import org.example.model.ExamModel;

import java.util.List;

public interface ExamDao
{
    String createExam(int IdOfExam,String NameOfExam, String dt, String SchoolClass);
    String deleteExam(int IdOfExam, String NameOfExam, String dt, String SchoolClass);
    String updateExam(int IdOfExam, String NameOfExam, String dt, String SchoolClass);
    List<ExamModel> getAllExams();
    List<ExamModel> filterExams(int IdOfExam, String NameOfExam, String dt, String SchoolClass);
    List<ExamModel> filter(int IdOfExam, String NameOfExam, String dt, String SchoolClass, String...attr);
}
