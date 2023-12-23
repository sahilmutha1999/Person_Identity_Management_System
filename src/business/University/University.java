/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.University;

import business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author meetb007
 */
public class University {
    private String name;
    private String country;
    private ArrayList<Major> majorList;
    
    public University() {
        majorList = new ArrayList<>();
    }
    
    public University(String name, String location) {
        majorList = new ArrayList<>();
        this.name = name;
        this.country = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Major> getMajorList() {
        return majorList;
    }

    public Major createNewMajor() {
        Major major = new Major();
        majorList.add(major);
        return major;
    }
    
    public Major createNewMajor(String name, String domain, double fee, 
            int intake, int noOfCredits, String syllabus, ImageIcon image, 
            UserAccount professor, University university) {
        Major major = new Major(name, domain, fee, intake, noOfCredits, 
                syllabus, image, professor, university);
        majorList.add(major);
        return major;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
