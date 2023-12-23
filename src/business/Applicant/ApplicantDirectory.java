/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Applicant;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class ApplicantDirectory {
    private ArrayList<Applicant> applicantList;
    
    public ApplicantDirectory() {
        applicantList = new ArrayList<>();
    }

    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }
    
    public Applicant createNewApplicant() {
        Applicant applicant = new Applicant();
        applicantList.add(applicant);
        return applicant;
    }
    
    public Applicant createNewApplicant(String location, Person person) {
        Applicant applicant = new Applicant(location, person);
        applicantList.add(applicant);
        return applicant;
    }
}
