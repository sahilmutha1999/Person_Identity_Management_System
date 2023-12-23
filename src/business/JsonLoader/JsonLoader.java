/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.JsonLoader;

import business.Applicant.Applicant;
import business.Business;
import business.Employer.Employer;
import business.Organization.ApplicantOrganization;
import business.Organization.CertificationOrganization;
import business.Organization.EmployerOrganization;
import business.Organization.PublicationOrganization;
import business.Person.Person;
import business.Role.AdminRole;
import business.Role.ApplicantRole;
import business.Role.CertificationAuthorityRole;
import business.Role.HiringManagerRole;
import business.Role.PublicationAuthorityRole;
import business.Role.RecruiterRole;
import business.University.University;
import business.UserAccount.UserAccount;
import com.fasterxml.jackson.databind.JsonNode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author adwaitrelekar
 */


public class JsonLoader {
    
    Business business;
    
//    public JsonLoader(Business business){
//            this.business = business;
//    }

    public JsonLoader(Business business) {
        this.business = business;
    }
    
    public void LoadCertification() {
        String filePath = "src/data/Certification.json";
        
        try{
            
            ObjectMapper objectMapper = new ObjectMapper();
            Path path = Paths.get(filePath);
            byte[] jsonData = Files.readAllBytes(path);
            JsonNode jsonNode = objectMapper.readTree(jsonData);
            
            for(JsonNode node: jsonNode){
            
                CertificationOrganization co = new CertificationOrganization(
                        node.get("name").asText(), node.get("country").asText());
                business.getOrganizationDirectory().getOrganizationList().add(co);

                Person person = new Person();
                person.setName(node.get("name").asText());

                UserAccount userAccount = new UserAccount(person, business);
                try{
                    userAccount.setUsername(node.get("username").asText());
                    userAccount.setPassword(node.get("password").asText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                userAccount.setRole(new CertificationAuthorityRole());
                userAccount.setPerson(person);

                co.getPersonDirectory().getPersonList().add(person);
                co.getUserAccountDirectory().getUserAccountList().add(userAccount);
            }
            
        }   
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void LoadPublication() {
        String filePath = "src/data/Publication.json";
        
        try{
            
            ObjectMapper objectMapper = new ObjectMapper();
            Path path = Paths.get(filePath);
            byte[] jsonData = Files.readAllBytes(path);
            JsonNode jsonNode = objectMapper.readTree(jsonData);
            
            for(JsonNode node: jsonNode){
            
                PublicationOrganization co = new PublicationOrganization(
                        node.get("name").asText(), node.get("country").asText());
                business.getOrganizationDirectory().getOrganizationList().add(co);

                Person person = new Person();
                person.setName(node.get("name").asText());

                UserAccount userAccount = new UserAccount(person, business);
                try{
                    userAccount.setUsername(node.get("username").asText());
                    userAccount.setPassword(node.get("password").asText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                userAccount.setRole(new PublicationAuthorityRole());
                userAccount.setPerson(person);

                co.getPersonDirectory().getPersonList().add(person);
                co.getUserAccountDirectory().getUserAccountList().add(userAccount);
            }
            
        }   
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    
    public void LoadEmployerData(){
        
        System.out.println("Reading Json");
        String filePath = "src/data/Employer.json";
        
        try{
               
            ObjectMapper objectMapper = new ObjectMapper();
            Path path = Paths.get(filePath);
            byte[] jsonData = Files.readAllBytes(path);
            JsonNode jsonNode = objectMapper.readTree(jsonData);
            
            for(JsonNode node: jsonNode){
                
                //Employer Organization Creation
                JsonNode employer = node.get("EmployerOrganization");
                
                String employerName = employer.get("name").asText();
                String industryName = employer.get("industry").asText();
                String country = employer.get("country").asText();
                
                EmployerOrganization eo = new EmployerOrganization(employerName, industryName, country);
                business.getOrganizationDirectory().getOrganizationList().add(eo);
                //Person Creation
                
                JsonNode employee = node.get("Employee");
//                System.out.println(employee);
                
                for (JsonNode user : employee) {
                    Person p = new Person();
                    JsonNode personNode = user.get("Person");
                    p.setName(personNode.get("name").asText());
                    p.setEmailAddress(personNode.get("emailAddress").asText());
                    p.setContactNumber(personNode.get("contactNumber").asText());
                    p.setGender(personNode.get("gender").asText());
                    p.setAge(personNode.get("age").asText());

                    UserAccount ua = new UserAccount(p, business);
                    
                    JsonNode userNode = user.get("UserAccount");
                    try{
                        ua.setUsername(userNode.get("username").asText());
                        ua.setPassword(userNode.get("password").asText());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                                JOptionPane.WARNING_MESSAGE);    
                    }
                    
                    String role = user.get("Role").asText();
                    if(role.equals("AdminRole"))
                    {
                        ua.setRole(new AdminRole());
                    }
                    else if(role.equals("HiringManagerRole")){
                        ua.setRole(new HiringManagerRole());
                    }
                    else if(role.equals("RecruiterRole")){
                        ua.setRole(new RecruiterRole());
                    }
                    
                    ua.setPerson(p);
                    eo.getPersonDirectory().getPersonList().add(p);
                    eo.getUserAccountDirectory().getUserAccountList().add(ua); 
                }     
                
                JsonNode job = node.get("JobRole");
                Employer e1 = eo.getEmployer();
                
                for(JsonNode jobNode : job){
                    String jobTitle = jobNode.get("name").asText();
                    String domain = jobNode.get("domain").asText();
                    String description = jobNode.get("description").asText();
                    String location = jobNode.get("location").asText();
                    String pay = jobNode.get("pay").asText();
                    String intakePeriod = jobNode.get("intakePeriod").asText();
                    
                    e1.createNewJobRole(jobTitle, domain, description, location, 
                            Double.parseDouble(pay), intakePeriod, null, e1);
                }
  
            }  
            
        }   
        catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    public void LoadApplicantData(){
        
        System.out.println("Reading Json");
        String filePath = "src/data/Applicant.json";
        
        
        try{
               
            ObjectMapper objectMapper = new ObjectMapper();
            Path path = Paths.get(filePath);
            byte[] jsonData = Files.readAllBytes(path);
            JsonNode jsonNode = objectMapper.readTree(jsonData);
            
            for(JsonNode node: jsonNode){
                
                //Applicant Creation
                ApplicantOrganization ao = new ApplicantOrganization();
                business.getOrganizationDirectory().getOrganizationList().add(ao);
        
                JsonNode person = node.get("Person");
                
                String applicantName = person.get("name").asText();
                String emailAddress = person.get("emailAddress").asText();
                String contactNumber = person.get("contactNumber").asText();
                String gender = person.get("gender").asText();
                String age = person.get("age").asText();
                Person p2 = new Person(applicantName, emailAddress,contactNumber, gender);
                
                UserAccount ua2 = new UserAccount(p2, business);
                JsonNode userNode = node.get("UserAccount");
                try{
                    ua2.setUsername(node.get("username").asText());
                    ua2.setPassword(node.get("password").asText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                            JOptionPane.WARNING_MESSAGE);
                }
                
                ua2.setRole(new ApplicantRole());
                ua2.setPerson(p2);
                
                ao.getPersonDirectory().getPersonList().add(p2);
                ao.getUserAccountDirectory().getUserAccountList().add(ua2);
                
                Applicant a1 = ao.getApplicantDirectory().createNewApplicant("Boston", p2);
                
                JsonNode eduNode = node.get("Education");
            
//                System.out.println(eduNode);
                
                for (JsonNode applicant : eduNode) {
                    
                    String degreeType = applicant.get("degreeType").asText();
                    String uni = applicant.get("university").asText();
                    String major = applicant.get("major").asText();
                    String startMonth = applicant.get("startMonth").asText();
                    String startYear = applicant.get("startYear").asText();
                    String endMonth = applicant.get("endMonth").asText();
                    String endYear = applicant.get("endYear").asText();
                    String grade = applicant.get("grade").asText();
                    boolean isVerified;
                    if(applicant.get("isVerified").asText().equalsIgnoreCase("true"))
                    {
                         isVerified = true;
                    }
                    else{
                         isVerified = false;
                    }
                   
//To be added later                   a1.createNewEducation(u1, degreeType, major, Integer.parseInt(startMonth), Integer.parseInt(startYear), Integer.parseInt(endMonth), Integer.parseInt(endYear), Double.parseDouble(grade), isVerified);
                }
                
                
                JsonNode employmentNode = node.get("Employment");
                    
                 System.out.println(employmentNode);
                 
                 for (JsonNode employment : employmentNode) {
                    
                    String employer = employment.get("employer").asText();
                    String position = employment.get("position").asText();
                    String startMonth = employment.get("startMonth").asText();
                    String startYear = employment.get("startYear").asText();
                    String endMonth = employment.get("endMonth").asText();
                    String endYear = employment.get("endYear").asText();
                    String description = employment.get("description").asText();
                    String grade = employment.get("grade").asText();
                    boolean isVerified;
                    if(employment.get("isVerified").asText().equalsIgnoreCase("true"))
                    {
                         isVerified = true;
                    }
                    else{
                         isVerified = false;
                    }
                    
//To be added later   a1.createNewEmployment(e1, position, Integer.parseInt(startMonth), Integer.parseInt(startYear), Integer.parseInt(endMonth), Integer.parseInt(endYear), description, Double.parseDouble(grade), isVerified);        
                 }
                 
                 JsonNode projectNode = node.get("Project");
            
                System.out.println(projectNode);
                
                for (JsonNode project : projectNode) {
                    
                    String name = project.get("name").asText();
                    String type = project.get("type").asText();
                    String description = project.get("description").asText();
                    String startMonth = project.get("startMonth").asText();
                    String startYear = project.get("startYear").asText();
                    String endMonth = project.get("endMonth").asText();
                    String endYear = project.get("endYear").asText();
                    boolean isVerified;
                    if(project.get("isVerified").asText().equalsIgnoreCase("true"))
                    {
                         isVerified = true;
                    }
                    else{
                         isVerified = false;
                    }
                   
                    a1.createNewProject(name, 8, 2021, 6, 2023, description, type, isVerified);
                }
                 
//                   
            }
               
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}