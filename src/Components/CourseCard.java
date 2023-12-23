package Components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;

public class CourseCard extends javax.swing.JPanel {
    
    private Color color1;
    private Color color2;
    
    public CourseCard() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Course_Card data) {
        lblCourseImg.setIcon(data.getCourseImage());
        lblSubject.setText(data.getCourseSubject());
        lblCourseName.setText(data.getCourseName());
        lblCoursePrice.setText(Double.toString(data.getCoursePrice()));
    }
    
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    public void addBtnViewCourseActionListener(ActionListener listener) {
        btnView.addActionListener(listener);
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCourseImg = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblCoursePrice = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setOpaque(false);

        lblCourseImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCourseImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCourseImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        lblSubject.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(255, 255, 255));
        lblSubject.setText("Values");
        lblSubject.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblSub.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblSub.setForeground(new java.awt.Color(255, 255, 255));
        lblSub.setText("University Name");
        lblSub.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblcourse.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblcourse.setForeground(new java.awt.Color(255, 255, 255));
        lblcourse.setText("Course Name");
        lblcourse.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblCourseName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblCourseName.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseName.setText("Values");
        lblCourseName.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblCoursePrice.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblCoursePrice.setForeground(new java.awt.Color(255, 255, 255));
        lblCoursePrice.setText("Values");
        lblCoursePrice.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("Price");
        lbl3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnView.setBackground(new java.awt.Color(0, 153, 255));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setText("View Course Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCoursePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcourse, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(lblCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubject)
                .addGap(18, 18, 18)
                .addComponent(lblcourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCourseName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoursePrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblCourseImg;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCoursePrice;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblcourse;
    // End of variables declaration//GEN-END:variables
}
