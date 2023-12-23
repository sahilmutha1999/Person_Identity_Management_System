/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Employer.Employer;
import business.Organization.Organization.Type;
import business.Role.AdminRole;
import business.Role.EmployerRole;
import business.Role.HiringManagerRole;
import business.Role.RecruiterRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class EmployerOrganization extends Organization{
    private Employer employer;
    
    public EmployerOrganization() {
        super(Type.Employer.getValue());
        employer = new Employer();
    }
    
    public EmployerOrganization(String name, String industry, String country) {
        super(Type.Employer.getValue());
        employer = new Employer(name, industry, country);
    }

    public Employer getEmployer() {
        return employer;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmployerRole());
        roles.add(new AdminRole());
        roles.add(new HiringManagerRole());
        roles.add(new RecruiterRole());
        return roles;
    }
}
