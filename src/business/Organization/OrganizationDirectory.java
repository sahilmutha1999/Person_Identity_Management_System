/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.University.getValue())){
            organization = new UniversityOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Employer.getValue())){
            organization = new EmployerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
