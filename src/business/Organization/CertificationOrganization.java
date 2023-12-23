/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.CertificationAuthorityRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class CertificationOrganization extends Organization{
    
    private business.CertificationAuthority.CertificationAuthority certificationAuthority;

    public CertificationOrganization() {
        super(Type.CeritificationAuthority.getValue());
        certificationAuthority = new business.CertificationAuthority.CertificationAuthority();
    }
    
    public CertificationOrganization(String name, String country) {
        super(Type.CeritificationAuthority.getValue());
        certificationAuthority = new business.CertificationAuthority.CertificationAuthority(name, country);
    }

    public business.CertificationAuthority.CertificationAuthority getCertificationAuthority() {
        return certificationAuthority;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CertificationAuthorityRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return getCertificationAuthority().toString();
    }
}
