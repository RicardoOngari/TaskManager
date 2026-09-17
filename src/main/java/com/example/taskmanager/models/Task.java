package com.example.taskmanager.models;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private int id;

    @NotBlank(message = "Obrigatorio")
    private String title;

    @NotBlank(message = "Obrigatorio")
    private String description;

    private boolean completed;

}
