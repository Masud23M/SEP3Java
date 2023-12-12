package org.example.model;

import org.springframework.lang.NonNull;

public record ExamModel(@NonNull int IdOfExam, @NonNull String NameOfExam, @NonNull String dt, @NonNull String SchoolClass)
{
}
