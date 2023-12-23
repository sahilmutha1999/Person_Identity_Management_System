/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Business;
import business.Employer.EmployerDirectory;
import business.Person.PersonDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public abstract class Organization {
    private Business business;
    private static int counter;
    private int organizationID;
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    public enum Type{
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Applicant("Applicant Organization"){
//            public Organization createOrganization() {
//                return new ApplicantOrganization();
//            }
        }, University("University Organization"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        }, Employer("Employer Organization"){
//            public Organization createOrganization() {
//                return new EmployerOrganization();
//            }
        }, PublicationAuthority("Publication Authority Organization"){
//            public Organization createOrganization() {
//                return new EmployerOrganization();
//            }
        }, CeritificationAuthority("Ceritification Authority Organization"){
//            public Organization createOrganization() {
//                return new EmployerOrganization();
//            }
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory(business);
        personDirectory = new PersonDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public int getOrganizationID() {
        return organizationID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
