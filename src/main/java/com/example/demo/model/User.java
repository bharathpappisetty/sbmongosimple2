package com.example.demo.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private String id;
    @NotNull private String name;
    private int age;
}
