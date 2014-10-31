/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.LinkedList;

/**
 *
 * @author ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonDB db = new PersonDB();
        db.addUnique(new Person("Matias", 35, true));
        db.addUnique(new Person("Matias", 35, true));
        db.addUnique(new Person("Ivan", 12, false));
        db.addUnique(new Person("Arjen", 38, true));
        db.addUnique(new Person("Arjen", 38, false));
        db.addUnique(new Person("Manon", 9, false));
        db.addUnique(new Person("Ronald", 9, true));

        System.out.println("-- All --");
        db.displayAll();

        System.out.println("\n-- Jail baits --");
        LinkedList<Person> jailBaits = db.jailBait();
        for (Person p : jailBaits) {
            System.out.println(p);
        }

    }

}
