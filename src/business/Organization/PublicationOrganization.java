/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.PublicationAuthorityRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class PublicationOrganization extends Organization{
    
    private business.PublicationAuthority.PublicationAuthority publicationAuthority;
    
    public PublicationOrganization() {
        super(Type.PublicationAuthority.getValue());
        publicationAuthority = new business.PublicationAuthority.PublicationAuthority();
    }
    
    public PublicationOrganization(String name, String country) {
        super(Type.PublicationAuthority.getValue());
        publicationAuthority = new business.PublicationAuthority.PublicationAuthority(name, country);
    }

    public business.PublicationAuthority.PublicationAuthority getPublicationAuthority() {
        return publicationAuthority;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublicationAuthorityRole());
        return roles;
    }

    @Override
    public String toString() {
        return getPublicationAuthority().toString();
    }
}
