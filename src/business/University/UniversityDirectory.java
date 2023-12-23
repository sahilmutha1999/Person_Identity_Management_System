/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.University;

import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class UniversityDirectory {
    private ArrayList<University> universityList;
    
    public UniversityDirectory() {
        universityList = new ArrayList<>();
    }

    public ArrayList<University> getUniversityList() {
        return universityList;
    }
    
    public University createNewUniversity() {
        University university = new University();
        universityList.add(university);
        return university;
    }
    
    public University createNewUniversity(String name, String location) {
        University university = new University(name, location);
        universityList.add(university);
        return university;
    }
}
