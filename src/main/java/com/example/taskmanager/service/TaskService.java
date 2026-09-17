package com.example.taskmanager.service;

import com.example.taskmanager.models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private static List<Task> TASKS = new ArrayList<>();

    public TaskService(){

    }


    public List<Task> getAllTask(){
        return TASKS;

    }

    public void addTask(Task task){
        TASKS.add(task);
    }
}
