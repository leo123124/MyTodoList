package com.malik.dao;

import com.malik.entity.Task;

import java.util.List;

/**
 * Created by Vasyl on 21/04/2016.
 */
public interface TaskDAO {
    int createTask(Task task);
    Task modifyTask(Task task);
    void deleteTask(int id);
    Task markDone(Task task, String description);
    List getAllTasks();
    List<Task> getDoneTasks();
    List<Task> getNotDoneTasks();
    Task getTask(int id);
    List<Task> findTasks(String request);
}
