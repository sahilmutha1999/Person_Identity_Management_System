/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Applicant;

import business.Organization.CertificationOrganization;


/**
 *
 * @author meetb007
 */
public class Certification {
    private String name;
    private CertificationOrganization certification;
    private String number;
    private boolean isVerified;

    public Certification() {
    }

    public Certification(String name, 
            CertificationOrganization certification, String number, 
            boolean isVerified) {
        this.name = name;
        this.certification = certification;
        this.number = number;
        this.isVerified = isVerified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CertificationOrganization getCertification() {
        return certification;
    }

    public void setCertification(CertificationOrganization certification) {
        this.certification = certification;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
