package org.example.model;

import org.springframework.lang.NonNull;

import java.util.List;

public record ClassModel(@NonNull String Name,@NonNull String TeacherId,@NonNull List<String> StudentsIds,@NonNull int Id)
{
}
