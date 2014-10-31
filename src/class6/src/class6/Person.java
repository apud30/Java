/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author ivan
 */
public class Person {

    int age;
    String name;
    boolean hardSex;

    Person(String name, int age, boolean hardSex) {
        this.age = age;
        this.name = name;
        this.hardSex = hardSex;
    }

    @Override
    public boolean equals(Object obj) {  
        if (obj instanceof Person) {
            if (obj == null) {
                return false;
            }
            Person other = (Person) obj;
            if (name.equals(other.name) && age == other.age) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

}
