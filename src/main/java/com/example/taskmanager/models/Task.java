package com.example.taskmanager.models;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private int id;

    @NotBlank(message = "Obrigatorio")
    @Size(message = "entre 3 a 10", min = 3, max = 10)
    private String title;

    @NotBlank(message = "Obrigatorio")
    @Size(message = "entre 10 a 50", min = 3, max = 50)
    private String description;

    private boolean completed;

}
