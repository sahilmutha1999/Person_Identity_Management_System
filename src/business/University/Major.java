/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.University;

import business.UserAccount.UserAccount;
import javax.swing.ImageIcon;

/**
 *
 * @author meetb007
 */
public class Major {
    private String name;
    private String domain;
    private UserAccount professor;
    private double fee;
    private int intake;
    private int noOfCredits;
    private String syllabus;
    private ImageIcon image;
    private University university;

    public Major() {
        
    }
    
    public Major(String name, String domain, double fee, int intake, 
            int noOfCredits, String syllabus, ImageIcon image, 
            UserAccount professor, University university) {
        this.name = name;
        this.domain = domain;
        this.fee = fee;
        this.intake = intake;
        this.noOfCredits = noOfCredits;
        this.syllabus = syllabus;
        this.image = image;
        this.professor = professor;
        this.university = university;
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

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getIntake() {
        return intake;
    }

    public void setIntake(int intake) {
        this.intake = intake;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }
    
    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public UserAccount getProfessor() {
        return professor;
    }

    public void setProfessor(UserAccount professor) {
        this.professor = professor;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
