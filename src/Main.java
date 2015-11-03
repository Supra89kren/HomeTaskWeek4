import com.geekhub.hw4.taskmanager.Task;
import com.geekhub.hw4.taskmanager.TaskManagerImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TaskManagerImpl taskManager = new TaskManagerImpl();
        taskManager.addTask(new Date(55555),new Task("work","buy hosting "));
        taskManager.addTask(new Date(567865),new Task("work","call to Jimmy "));
        taskManager.addTask(new Date(586786),new Task("work","call to boss "));

        List<Task> list=taskManager.getTasksByCategory("work");
        for (Task task :list){
            System.out.println("getTasksByCategory @Work@");
            System.out.println(task.getDescription());
            System.out.println("test successful");
        }

        printTasksMap(taskManager.getTaskMap());


    }

    public static void printTasksMap(Map<Date,List<Task>> tasksMap){
        for (Map.Entry entry :tasksMap.entrySet()){
            System.out.println(entry.getKey());



        }
    }

}
