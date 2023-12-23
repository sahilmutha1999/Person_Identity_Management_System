/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.Applicant.Applicant;
import business.Employer.Employer;
import business.JsonLoader.JsonLoader;
import business.Organization.AdminOrganization;
import business.Organization.ApplicantOrganization;
import business.Organization.EmployerOrganization;
import business.Organization.UniversityOrganization;
import business.Person.Person;
import business.Role.AdminRole;
import business.Role.AdmissionCommitteeRole;
import business.Role.ApplicantRole;
import business.Role.EmployerRole;
import business.Role.HiringManagerRole;
import business.Role.ProfessorRole;
import business.Role.RegistrarRole;
import business.Role.UniversityRole;
import business.University.University;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author meetb007
 */
public class ConfigureABusiness {
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        JsonLoader j = new JsonLoader(business);
        j.LoadEmployerData();
        j.LoadCertification();
        j.LoadPublication();
//        // Admin creation
//        AdminOrganization adminOrganization = new AdminOrganization();
//        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
//        
//        Person p1 = new Person();
//        p1.setName("Admin");
//        
//        UserAccount ua1 = new UserAccount(p1, business);
//        try{
//            ua1.setUsername("admin");
//            ua1.setPassword("admin");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
//                    JOptionPane.WARNING_MESSAGE);
//            return null;
//        }
//        ua1.setRole(new AdminRole());
//        ua1.setPerson(p1);
//        
//        adminOrganization.getPersonDirectory().getPersonList().add(p1);
//        adminOrganization.getUserAccountDirectory().getUserAccountList().add(ua1);
        
        // University creation
        UniversityOrganization uo = new UniversityOrganization("Northeastern University", "USA");
        business.getOrganizationDirectory().getOrganizationList().add(uo);
        
        Person p3 = new Person();
        p3.setName("Kal Bugrara");
        
        UserAccount ua3 = new UserAccount(p3, business);
        try{
            ua3.setUsername("k");
            ua3.setPassword("k");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ua3.setRole(new AdminRole());
        ua3.setPerson(p3);
        
        uo.getPersonDirectory().getPersonList().add(p3);
        uo.getUserAccountDirectory().getUserAccountList().add(ua3);
        
        University u1 = uo.getUniversity();
        
        Person p6 = new Person();
        p6.setName("Admission Commite");
        
        UserAccount ua6 = new UserAccount(p6, business);
        try{
            ua6.setUsername("d");
            ua6.setPassword("d");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ua6.setRole(new AdmissionCommitteeRole());
        ua6.setPerson(p3);
        
        uo.getPersonDirectory().getPersonList().add(p6);
        uo.getUserAccountDirectory().getUserAccountList().add(ua6);
        
        Person p7 = new Person();
        p7.setName("Registrar");
        
        UserAccount ua7 = new UserAccount(p7, business);
        try{
            ua7.setUsername("b");
            ua7.setPassword("b");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ua7.setRole(new RegistrarRole());
        ua7.setPerson(p3);
        
        uo.getPersonDirectory().getPersonList().add(p7);
        uo.getUserAccountDirectory().getUserAccountList().add(ua7);
        
        Person p8 = new Person();
        p8.setName("Professor");
        
        UserAccount ua8 = new UserAccount(p8, business);
        try{
            ua8.setUsername("c");
            ua8.setPassword("c");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ua8.setRole(new ProfessorRole());
        ua8.setPerson(p3);
        
        uo.getPersonDirectory().getPersonList().add(p8);
        uo.getUserAccountDirectory().getUserAccountList().add(ua8);
        
        u1.createNewMajor("IS", "COE", 56001, 800, 32, "AED", null, ua8, u1);
        
//        // Employer creation
//        EmployerOrganization eo = new EmployerOrganization("Fidility", "Fintech", "USA");
//        business.getOrganizationDirectory().getOrganizationList().add(eo);
//        
//        Person p4 = new Person();
//        p4.setName("Andreqw NG");
//        
//        UserAccount ua4 = new UserAccount(p4, business);
//        try{
//            ua4.setUsername("a");
//            ua4.setPassword("a");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
//                    JOptionPane.WARNING_MESSAGE);
//            return null;
//        }
//        ua4.setRole(new AdminRole());
//        ua4.setPerson(p4);
//        
//        eo.getPersonDirectory().getPersonList().add(p4);
//        eo.getUserAccountDirectory().getUserAccountList().add(ua4);
//        
//        Employer e1 = eo.getEmployer();
//        
//        e1.createNewJobRole("SDE-1", "Technology", "Spring Boot", "Boston", 
//                50.5, "Fall 2024", null, e1);
//        
//        Person p5 = new Person();
//        p5.setName("Hiring Manager");
//        
//        UserAccount ua5 = new UserAccount(p5, business);
//        try{
//            ua5.setUsername("h");
//            ua5.setPassword("h");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
//                    JOptionPane.WARNING_MESSAGE);
//            return null;
//        }
//        ua5.setRole(new HiringManagerRole());
//        ua5.setPerson(p5);
//        
//        eo.getPersonDirectory().getPersonList().add(p5);
//        eo.getUserAccountDirectory().getUserAccountList().add(ua5);
//        
        // Applicant creation
        ApplicantOrganization ao = new ApplicantOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(ao);
        
        Person p2 = new Person("Meet Bhanushali", "meet@g.c", "12312321312", "Male");
        
        UserAccount ua2 = new UserAccount(p2, business);
        try{
            ua2.setUsername("m");
            ua2.setPassword("m");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ua2.setRole(new ApplicantRole());
        ua2.setPerson(p2);
        
        ao.getPersonDirectory().getPersonList().add(p2);
        ao.getUserAccountDirectory().getUserAccountList().add(ua2);
        
        Applicant a1 = ao.getApplicantDirectory().createNewApplicant("Boston", p2);
//        a1.createNewEducation(u1, "Master", "CS", 8, 2023, 6, 2025, 99.8, true);
        a1.createNewEducation(u1, "Bechlor", "CE", 8, 2017, 6, 2021, 99.8, false);
//        a1.createNewEmployment(e1, "Software Developer", 8, 2021, 6, 2023, "Developed Backend of softwares.", true);        
        a1.createNewProject("Online Compiler", 8, 2021, 6, 2023, "Virtualized environment to tun the code.", "Academic", true);        
        
        return business;
    }
}
