/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author sahil
 */

public class DashboardModel_card {
    private ImageIcon labelImage;
    private String subject;
    private int value;
    
    public DashboardModel_card(ImageIcon labelImage, String subject, int value){
        this.labelImage = labelImage;
        this.subject = subject;
        this.value = value;
    }
    
    public ImageIcon getLabelImage() {
        return labelImage;
    }

    public void setLabelImage(ImageIcon labelImage) {
        this.labelImage = labelImage;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    
    
}
