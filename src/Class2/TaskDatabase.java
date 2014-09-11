/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class2;

import java.util.LinkedList;

/**
 *
 * @author ivan
 */
public class TaskDatabase {

    LinkedList<Task> item = new LinkedList<Task>();

    void addTask(String title) {
        //Incompleted task
        Task task = new IncompletedTask(title);
        task.title = title;
        item.add(task);
    }

    void addCompletedTask(String title) {
        Task task = new CompletedTask(title);
        task.title = title;
        item.add(task);
    }

    void addOnHoldTask(String title) {
        Task task = new OnHoldTask(title);
        task.title = title;
        item.add(task);
    }

    void displayAll() {
        for (Task task : item) {
            task.display();
        }

    }

}
