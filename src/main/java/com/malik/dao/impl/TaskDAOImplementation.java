package com.malik.dao.impl;

import com.malik.dao.TaskDAO;
import com.malik.entity.Task;
import com.malik.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vasyl on 21/04/2016.
 */
@Repository
public class TaskDAOImplementation implements TaskDAO {
    public TaskDAOImplementation() {
        System.out.println("in taskDAOImplementation");
    }

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public int createTask(Task task) {
        return (int) hibernateUtil.create(task);
    }

    @Override
    public Task modifyTask(Task task) {
        return hibernateUtil.modify(task);
    }

    @Override
    public void deleteTask(int id) {
        Task task = new Task();
        task.setId(id);
        task.setDescription("toDelete");
        hibernateUtil.delete(task);
    }

    @Override
    public Task markDone(Task task, String description) {
        task.setIsDone((byte) 1);
        task.setDescription(description);
        task.setAddDate(task.getAddDate());
        return hibernateUtil.markDone(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return hibernateUtil.fetchAll(Task.class);
    }

    @Override
    public List<Task> getDoneTasks() {
        List<Task> tempList = getAllTasks();
        List<Task> result = new ArrayList<>();
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).getIsDone() == 1) {
                result.add(tempList.get(i));
            }
        }
        System.out.println("Result size = " + result.size());
        return result;
    }

    @Override
    public List<Task> getNotDoneTasks() {
        List<Task> tempList = getAllTasks();
        List<Task> result = new ArrayList<>();
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).getIsDone() == 0) {
                result.add(tempList.get(i));
            }
        }
        return result;
    }

    @Override
    public Task getTask(int id) {
        return hibernateUtil.fetchById(id, Task.class);
    }

    @Override
    public List<Task> findTasks(String request) {
        String query = "SELECT id, description, createDate, isDone FROM task WHERE description LIKE '%" + request + "%'";
        List<Object[]> listTasks = hibernateUtil.fetchAll(query);
        List<Task> tasks = new ArrayList<>();
        for (Object[] taskObject : listTasks) {
            Task task = new Task();
            int id = (int) taskObject[0];
            String description = (String) taskObject[1];
            Date addDate = (Date) taskObject[2];
            byte isDone = (byte) taskObject[3];
            task.setId(id);
            task.setDescription(description);
            task.setAddDate(addDate);
            task.setIsDone(isDone);
            tasks.add(task);
        }
        return tasks;
    }
}
