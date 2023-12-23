package Components;

import javax.swing.ImageIcon;

public class Model_Course_Card {
    
    private ImageIcon CourseImage;
    private String CourseSubject;
    private String CourseName;
    private double CoursePrice;
    
    public Model_Course_Card(ImageIcon CourseImage, String CourseSubject, String CourseName, double CoursePrice) {
        this.CourseImage = CourseImage;
        this.CourseSubject = CourseSubject;
        this.CourseName = CourseName;
        this.CoursePrice = CoursePrice;
    }

    public ImageIcon getCourseImage() {
        return CourseImage;
    }

    public void setCourseImage(ImageIcon CourseImage) {
        this.CourseImage = CourseImage;
    }

    public String getCourseSubject() {
        return CourseSubject;
    }

    public void setCourseSubject(String CourseSubject) {
        this.CourseSubject = CourseSubject;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public double getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(double CoursePrice) {
        this.CoursePrice = CoursePrice;
    }
    
    
    
}
