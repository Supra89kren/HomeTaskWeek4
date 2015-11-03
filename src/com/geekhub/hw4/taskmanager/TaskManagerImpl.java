package com.geekhub.hw4.taskmanager;

import java.util.*;

/**
 * Created by JeT on 02.11.2015.
 */
public class TaskManagerImpl implements TaskManager {

    Map <Date, List<Task>> taskMap = new TreeMap<Date,List<Task>>();
    public Map<Date, List<Task>> getTaskMap() {
        return taskMap;
    }




    @Override
    public void addTask(Date date, Task task) {
      if (taskMap.containsKey(date)){
            taskMap.get(date).add(task);
        }else {
          List<Task> tempList= new ArrayList<Task>();
          tempList.add(task);
          taskMap.put(date,tempList);
        }
    }

    @Override
    public void removeTask(Date date) {
        taskMap.remove(date);
    }

    @Override
    public Collection<String> getCategories() {
        Set<String> categoriesSet = new HashSet<String>();
        for (Map.Entry<Date, List<Task>> entry : taskMap.entrySet()){
          for (Task task : entry.getValue()){
              categoriesSet.add(task.getCategory());
          }
        }
        return categoriesSet;
    }

    @Override
    public Map<String, List<Task>> getTasksByCategories() {
        Map<String, List<Task>> taskListCategory = new HashMap<String, List<Task>>();
        for (Map.Entry<Date, List<Task>> entryGlobalTaskMap: taskMap.entrySet()){
           List<Task> tasksList = entryGlobalTaskMap.getValue();
            for (Task task :tasksList){
                taskListCategory = addTaskToCategoryMap(taskListCategory,task);
            }
        }

        return taskListCategory;
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        List<Task> tasksList = new ArrayList<Task>();
        for (Map.Entry<Date, List<Task>> entry : taskMap.entrySet()){
            for (Task task : entry.getValue()){
                if (task.getCategory().equals(category)){
                    tasksList.add(task);
                }
            }
        }
        return tasksList;
    }

    @Override
    public List<Task> getTasksForToday() {
        return null;
    }

    public Map<String,List<Task>> addTaskToCategoryMap(Map<String,List<Task>> map, Task task) {
        if (map.containsKey(task.getCategory())){
            map.get(task.getCategory()).add(task);
        }else {
            List<Task> tempList= new ArrayList<Task>();
            tempList.add(task);
            map.put(task.getCategory(), tempList);
        }
        return map;
    }
}
