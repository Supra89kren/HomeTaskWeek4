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
        taskManager.addTask(new Date(55555),new Task("work","rabotay "));


    }

    public void printMap(Map map){
        List entry = new ArrayList<>(map.entrySet());
        for (Map.Entry entry1:entry)
        {

        }
    }
}
