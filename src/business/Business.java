package business;

import business.Organization.OrganizationDirectory;
import business.Role.ApplicantRole;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author meetb007
 */
public class Business {
    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private ApplicantRole applicantRole;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
        applicantRole = new ApplicantRole();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public ApplicantRole getApplicantRole() {
        return applicantRole;
    }
}
