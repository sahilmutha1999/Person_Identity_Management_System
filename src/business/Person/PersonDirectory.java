/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson() {
        Person person = new Person();
        personList.add(person);
        
        return person;
    }
}
