package org.example.model;

import org.springframework.lang.NonNull;

public record GradeModel(@NonNull int Id, @NonNull String ExamId, @NonNull String StudentId, @NonNull int StudentGrade)
{
}
