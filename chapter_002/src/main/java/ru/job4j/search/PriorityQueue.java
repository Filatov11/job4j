package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>() ;
public  void put (Task task) {
    int index = 0;
    for (Task element : tasks) {
        if (tasks.isEmpty()) { this.tasks.add(0, task);  break;} else {
 if  (element.getPriority() > task.getPriority()) {  break;} else {index++;}
    } }
    this.tasks.add(index, task);
}
public  Task take() {
    return  tasks.remove(0);
}

}
