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
public class PersonDB {

    LinkedList<Person> people = new LinkedList<Person>();

    public void addUnique(Person p) {
       if (!people.contains(p))
        people.add(p);
    }

    public void displayAll() {
        for (Person p : people) {
            System.out.println(p);
        }
    }
    
    public LinkedList jailBait() {
        LinkedList<Person> jail = new LinkedList<Person>();
        for (Person p: people){
            if (p.age < 15 && p.hardSex == false)
                jail.add(p);
        }
        return jail;
    }

}
