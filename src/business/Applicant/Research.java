/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Applicant;

import business.Organization.PublicationOrganization;



/**
 *
 * @author meetb007
 */
public class Research {
    private String name;
    private PublicationOrganization publication;
    private String description;
    private boolean isVerified;

    public Research() {
    }

    public Research(String name, PublicationOrganization publication, 
            String description, boolean isVerified) {
        this.name = name;
        this.publication = publication;
        this.description = description;
        this.isVerified = isVerified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicationOrganization getPublication() {
        return publication;
    }

    public void setPublication(PublicationOrganization publication) {
        this.publication = publication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
