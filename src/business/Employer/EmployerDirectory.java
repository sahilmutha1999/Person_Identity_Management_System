/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Employer;

import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class EmployerDirectory {
    private ArrayList<Employer> employerList;
    
    public EmployerDirectory() {
        employerList = new ArrayList<>();
    }

    public ArrayList<Employer> getEmployerList() {
        return employerList;
    }
    
    public Employer createNewEmployer() {
        Employer employer = new Employer();
        employerList.add(employer);
        return employer;
    }
    
    public Employer createNewEmployer(String name, String industry, String country) {
        Employer employer = new Employer(name, industry, country);
        employerList.add(employer);
        return employer;
    }
}
