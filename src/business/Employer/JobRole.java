/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Employer;

import javax.swing.ImageIcon;

/**
 *
 * @author meetb007
 */
public class JobRole {
    private static int counter = 1341;
    private int id;
    private String name;
    private String domain;
    private String description;
    private String location;
    private double pay;
    private String intakePeriod;
    private ImageIcon image;
    private Employer employer;

    public JobRole() {
        this.id = counter++;
    }

    public JobRole(String name, String domain, String description, 
            String location, double pay, String intakePeriod, ImageIcon image,
            Employer employer) {
        this.id = counter++;
        this.name = name;
        this.domain = domain;
        this.description = description;
        this.location = location;
        this.pay = pay;
        this.intakePeriod = intakePeriod;
        this.image = image;
        this.employer = employer;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getIntakePeriod() {
        return intakePeriod;
    }

    public void setIntakePeriod(String intakePeriod) {
        this.intakePeriod = intakePeriod;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public int getId() {
        return id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return name;
    }
}
