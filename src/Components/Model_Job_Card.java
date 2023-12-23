package Components;

import javax.swing.ImageIcon;

public class Model_Job_Card {
    
    private ImageIcon EmployerImage;
    private String EmployerName;
    private String JobRole;
    private double pay;
    
    public Model_Job_Card(ImageIcon EmployerImage, String EmployerName, String JobRole, double pay) {
        this.EmployerImage = EmployerImage;
        this.EmployerName = EmployerName;
        this.JobRole = JobRole;
        this.pay = pay;
    }

    public ImageIcon getEmployerImage() {
        return EmployerImage;
    }

    public void setEmployerImage(ImageIcon EmployerImage) {
        this.EmployerImage = EmployerImage;
    }

    public String getEmployerName() {
        return EmployerName;
    }

    public void setEmployerName(String EmployerName) {
        this.EmployerName = EmployerName;
    }

    public String getJobRole() {
        return JobRole;
    }

    public void setJobRole(String JobRole) {
        this.JobRole = JobRole;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    
    
}
