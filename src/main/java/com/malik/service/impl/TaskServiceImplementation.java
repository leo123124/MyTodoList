package com.malik.service.impl;

import com.malik.dao.TaskDAO;
import com.malik.entity.Task;
import com.malik.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vasyl on 21/04/2016.
 */

@Service
@Transactional
public class TaskServiceImplementation implements TaskService {
    public TaskServiceImplementation() {
        System.out.println("in TaskServiceImplementation");
    }

    @Autowired
    private TaskDAO taskDao;

    @Override
    public int createTask(Task task) {
        return taskDao.createTask(task);
    }

    @Override
    public Task modifyTask(Task task) {
        return taskDao.modifyTask(task);
    }

    @Override
    public void deleteTask(int id) {
        taskDao.deleteTask(id);
    }

    @Override
    public void markDone(Task task) {
        taskDao.markDone(task, task.getDescription());
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }

    @Override
    public List<Task> getDoneTasks() {
        return taskDao.getDoneTasks();
    }

    @Override
    public List<Task> getNotDoneTasks() {
        return taskDao.getNotDoneTasks();
    }

    @Override
    public Task getTask(int id) {
        return taskDao.getTask(id);
    }

    @Override
    public List<Task> findTasks(String request) {
        return taskDao.findTasks(request);
    }
}
