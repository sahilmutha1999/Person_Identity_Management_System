package business.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author meetb007
 */
public class Person {
    private static int count = 1;
    private int id;
    private String name;
    private String emailAddress;
    private String contactNumber;
    private String gender;
    private String age;

    
    
    public Person() {
        this.id = count++;
    }

    public Person(String name, String emailAddress, String contactNumber, String gender) {
        this.id = count++;
        this.name = name;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
