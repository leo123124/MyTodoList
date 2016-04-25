package com.malik.service;

import com.malik.entity.Task;

import java.util.List;

/**
 * Created by Vasyl on 21/04/2016.
 */
public interface TaskService {
    int createTask(Task task);
    Task modifyTask(Task task);
    void deleteTask(int id);
    void markDone(Task task);
    List<Task> getAllTasks();
    List<Task> getDoneTasks();
    List<Task> getNotDoneTasks();
    Task getTask(int id);
    List<Task> findTasks(String request);
}
