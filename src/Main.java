import com.geekhub.hw4.taskmanager.Task;
import com.geekhub.hw4.taskmanager.TaskManagerImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        TaskManagerImpl taskManager = new TaskManagerImpl();
        taskManager.addTask(new Date(System.currentTimeMillis()),new Task("work","buy hosting "));
        taskManager.addTask(new Date(System.currentTimeMillis()),new Task("work","buy hosting1 "));
        taskManager.addTask(new Date(System.currentTimeMillis()),new Task("work","buy hosting 1"));
        taskManager.addTask(new Date(System.currentTimeMillis()),new Task("work","buy hosting1 "));
        taskManager.addTask(new Date(System.currentTimeMillis()),new Task("work","buy hosting 1"));
        taskManager.addTask(new Date(567865),new Task("work","call to Jimmy "));
        taskManager.addTask(new Date(586786),new Task("work","call to boss "));

        List<Task> list=taskManager.getTasksForToday();
        for (Task task :list){
            System.out.println("______________________");
            System.out.println(task.getDescription());
            System.out.println("----------------------");
        }

        printTasksMap(taskManager.getTaskMap());


    }

    public static void printTasksMap(Map<Date,List<Task>> tasksMap){
        for (Map.Entry entry :tasksMap.entrySet()){
            System.out.println(entry.getKey());
            List<Task> taskList = (List<Task>) entry.getValue();
            for (Task task:taskList){
                System.out.println(task.getCategory());
                System.out.println(task.getDescription());
            }



        }
    }

}
