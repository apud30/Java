/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author ivan
 */
public class TaskMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskDatabase db = new TaskDatabase();
        db.addTask("Do the dishes");
        db.addCompletedTask("Learn Java");
        db.addCompletedTask("Do the exercise");
        db.addTask("Learn Dutch");
        db.addOnHoldTask("Learn Italian");

        db.displayAll();
    }

}
