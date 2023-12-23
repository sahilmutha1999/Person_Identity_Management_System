/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Applicant;

import business.Employer.Employer;
import business.Organization.CertificationOrganization;
import business.Organization.PublicationOrganization;
import business.Person.Person;
import business.University.University;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class Applicant {
    private static int count = 1;
    private int id;
    private String location;
    private ArrayList<Education> educationList;
    private ArrayList<Employment> employmentList;
    private ArrayList<Project> projectList;
    private ArrayList<Research> researchList;
    private ArrayList<Certification> certificationList;
    private Person person;
    
    public Applicant() {
        this.id = count++;
        educationList = new ArrayList<>();
        employmentList = new ArrayList<>();
        projectList = new ArrayList<>();
        researchList = new ArrayList<>();
        certificationList = new ArrayList<>();
    }
    
    public Applicant(String location, Person person) {
        this.id = count++;
        this.location = location;
        this.person = person;
        educationList = new ArrayList<>();
        employmentList = new ArrayList<>();
        projectList = new ArrayList<>();
        researchList = new ArrayList<>();
        certificationList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Education> getEducationList() {
        return educationList;
    }

    public Education createNewEducation(University university, String degreeType, 
            String major, int startMonth, int startYear, int endMonth, 
            int endYear, double grade, boolean isVerified) {
        Education education = new Education(university, degreeType, major, startMonth, startYear, endMonth, endYear, grade, isVerified);
        educationList.add(education);
        return education;
    }

    public ArrayList<Employment> getEmploymentList() {
        return employmentList;
    }

    public Employment createNewEmployment(Employer employer, String position, int startMonth, int startYear, int endMonth, int endYear, String description, boolean isVerified) {
        Employment employment = new Employment(employer, position, startMonth, startYear, endMonth, endYear, description, isVerified);
        employmentList.add(employment);
        return employment;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public Project createNewProject(String name, int startMonth, int startYear, int endMonth, int endYear, String description, String type, boolean isVerified) {
        Project project = new Project(name, startMonth, startYear, endMonth, endYear, description, type, isVerified);
        projectList.add(project);
        return project;
    }
    
    public ArrayList<Research> getResearchList() {
        return researchList;
    }

    public Research createNewResearch(String name, PublicationOrganization publication, 
            String description, boolean isVerified) {
        Research research = new Research(name, publication, description, isVerified);
        researchList.add(research);
        return research;
    }
    
    public ArrayList<Certification> getCertificationList() {
        return certificationList;
    }

    public Certification createNewCertification(String name, 
            CertificationOrganization certificationO, String number, boolean isVerified) {
        Certification certification = new Certification(name, certificationO, 
                number, isVerified);
        certificationList.add(certification);
        return certification;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
    
    @Override
    public String toString(){
        return person.getName();
    }
}
