/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Applicant.ApplicantDirectory;
import business.Role.ApplicantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class ApplicantOrganization extends Organization{
    private ApplicantDirectory applicantDirectory;
    
    public ApplicantOrganization() {
        super(Organization.Type.Applicant.getValue());
        applicantDirectory = new ApplicantDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ApplicantRole());
        return roles;
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }
}
