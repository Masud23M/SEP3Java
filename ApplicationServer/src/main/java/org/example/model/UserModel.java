package org.example.model;

import org.springframework.lang.NonNull;

public record UserModel(@NonNull String id,@NonNull String name , @NonNull String password)
{
}
