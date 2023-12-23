/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Employer;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author meetb007
 */
public class Employer {
    private String name;
    private String industry;
    private String country;
    private String EmailId;
    private ArrayList<JobRole> jobRoleList;

    public String getEmailId() {
        return EmailId;
    }
    
    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }
    
    
    public Employer() {
        jobRoleList = new ArrayList<>();
    }

    public Employer(String name, String industry, String country) {
        jobRoleList = new ArrayList<>();
        this.name = name;
        this.industry = industry;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public ArrayList<JobRole> getJobRoleList() {
        return jobRoleList;
    }
    
    public JobRole createNewJobRole() {
        JobRole jobRole = new JobRole();
        jobRoleList.add(jobRole);
        return jobRole;
    }
    
    public JobRole createNewJobRole(String name, String domain, 
            String description, String location, double pay, 
            String intakePeriod, ImageIcon image, Employer employer) {
        JobRole jobRole = new JobRole(name, domain, description, location, pay, 
                intakePeriod, image, employer);
        jobRoleList.add(jobRole);
        return jobRole;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
