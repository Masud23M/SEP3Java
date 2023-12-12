package org.example.model;

import org.springframework.lang.NonNull;

public record StudentModel(@NonNull String id,@NonNull String userId, @NonNull String name, @NonNull String password)
{
}
