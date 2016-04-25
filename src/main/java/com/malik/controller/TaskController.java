package com.malik.controller;

import com.malik.entity.Task;
import com.malik.service.TaskService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Vasyl on 22/04/2016.
 */
@Controller
public class TaskController {
    private final static Logger logger = Logger.getLogger(TaskController.class);

    public TaskController() {
        System.out.println("in TaskController");
    }

    @Autowired
    private TaskService taskService;

    @RequestMapping("createTask")
    public ModelAndView createTask(@ModelAttribute Task task) {
        logger.info("Creating Task. Data = " + task);
        return new ModelAndView("taskForm");
    }

    @RequestMapping("modifyTask")
    public ModelAndView modifyTask(@RequestParam int id, @ModelAttribute Task task) {
        logger.info("Modifying Task. Id = " + task);
        task = taskService.getTask(id);
        return new ModelAndView("taskForm", "taskObject", task);
    }

    @RequestMapping("saveTask")
    public ModelAndView saveTask(@ModelAttribute Task task) {
        logger.info("Saving Task. Data = " + task);
        if (task.getId() == 0) {
            taskService.createTask(task);
        } else {
            taskService.modifyTask(task);
        }
        return new ModelAndView("redirect:getAllTask");
    }

    @RequestMapping("deleteTask")
    public ModelAndView deleteTask(@RequestParam int id) {
        logger.info("Deleting Task. Id = " + id);
        taskService.deleteTask(id);
        return new ModelAndView("redirect:getAllTask");
    }

    @RequestMapping("markDone")
    public ModelAndView markDone(@ModelAttribute Task task) {
        logger.info("Marking as done Task. Data = " + task);
        List<Task> tempList = taskService.getAllTasks();
        int index = 0;
        for (int i = 0; i < tempList.size(); i++) {
            if (task.getId() == tempList.get(i).getId()) {
                index = i;
                break;
            }
        }
        task.setDescription(tempList.get(index).getDescription());
        taskService.markDone(task);
        return new ModelAndView("redirect:getAllTask");
    }

    @RequestMapping(value = {"getAllTask", "/"})
    public ModelAndView getAllTasks() {
        logger.info("Getting all tasks");
        List<Task> taskList = taskService.getAllTasks();
        return new ModelAndView("taskList", "taskList", taskList);
    }

    @RequestMapping(value = {"findDoneTask", "/findDoneTask"})
    public ModelAndView getAllDoneTasks() {
        logger.info("Getting all done tasks");
        List<Task> taskList = taskService.getDoneTasks();
        return new ModelAndView("taskList", "taskList", taskList);
    }

    @RequestMapping(value = {"findNotDoneTask", "/findNotDoneTask"})
    public ModelAndView getAllNotDoneTasks() {
        logger.info("Getting all not done tasks");
        List<Task> taskList = taskService.getNotDoneTasks();
        return new ModelAndView("taskList", "taskList", taskList);
    }

    @RequestMapping("findTask")
    public ModelAndView findTask(@RequestParam("findRequest") String findRequest) {
        logger.info("Finding task by description using Data = " + findRequest);
        List<Task> taskList = taskService.findTasks(findRequest);
        return new ModelAndView("taskList", "taskList", taskList);
    }
}