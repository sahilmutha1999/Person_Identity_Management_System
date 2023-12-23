/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Organization.Organization.Type;
import business.Role.AdminRole;
import business.Role.AdmissionCommitteeRole;
import business.Role.ProfessorRole;
import business.Role.RegistrarRole;
import business.Role.Role;
import business.Role.UniversityRole;
import business.University.University;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class UniversityOrganization extends Organization{
    private University university;
    
    public UniversityOrganization() {
        super(Type.University.getValue());
        university = new University();
    }
    
    public UniversityOrganization(String name, String location) {
        super(Type.University.getValue());
        university = new University(name, location);
    }

    public University getUniversity() {
        return university;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UniversityRole());
        roles.add(new AdminRole());
        roles.add(new RegistrarRole());
        roles.add(new AdmissionCommitteeRole());
        roles.add(new ProfessorRole());
        return roles;
    }

    @Override
    public String toString() {
        return university.getName();
    }
}
