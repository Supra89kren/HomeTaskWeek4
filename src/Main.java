import com.geekhub.hw4.set.SetOperationsImpl;
import com.geekhub.hw4.taskmanager.Task;
import com.geekhub.hw4.taskmanager.TaskManagerImpl;

import java.util.*;

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

        System.out.println("SetOperations test_________________");
        SetOperationsImpl resultOperations = new SetOperationsImpl();
        Set<String> firstSet = new HashSet<String>();
        firstSet.add("one");
        firstSet.add("two");
        firstSet.add("four");
        firstSet.add("three");
        Set<String> secondSet = new HashSet<String>();
        secondSet.add("one");
        secondSet.add("five");
        secondSet.add("seven");
        secondSet.add("two");
        for (Object obj : resultOperations.symmetricSubtract(firstSet,secondSet)) {
            System.out.println(obj);
        }

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
