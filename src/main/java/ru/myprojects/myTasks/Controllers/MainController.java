package ru.myprojects.myTasks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myprojects.myTasks.DB.Task;
import ru.myprojects.myTasks.Repository.RepoDB;

@Controller
public class MainController {
    private RepoDB repoDB;

    @GetMapping
    public String main(){
        return "mainPage";
    }
    @GetMapping("/createTask")
    public String createTask(){
        return "createTask";
    }
    public String postCreateTask(@RequestParam(name = "taskName") String taskName, @RequestParam(name = "taskDescription") String taskDescription, Model model){
        if(StringUtils.hasText(taskName) && StringUtils.hasText(taskDescription)){
            Task t = new Task();
            t.setTaskName(taskName);
            t.setTaskDescription(taskDescription);
            repoDB.save(t);
            model.addAttribute("message", "Задача успешно сохранена");
            return "createTask";
        }
        if(StringUtils.hasText(taskName)){
            Task t = new Task();
            t.setTaskName(taskName);
            repoDB.save(t);
            model.addAttribute("message", "Задача успешно сохранена");
            return "createTask";
        }
        model.addAttribute("message", "Не были указаны обязательные данные");
        return "createTask";
    }
}
