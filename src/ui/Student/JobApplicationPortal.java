/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Student;

import Components.JobCard;
import Components.Model_Job_Card;
import business.Applicant.Applicant;
import business.Business;
import business.Employer.Employer;
import business.Employer.JobRole;
import business.Organization.EmployerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sahil
 */
public class JobApplicationPortal extends javax.swing.JPanel {

    /**
     * Creates new form UnivCourseListing
     */
    JPanel mainWorkArea;
    UserAccount userAccount;
    Organization organization;
    Business business;
    String domain;
    EmployerOrganization employerOrganization;
    Applicant applicant;
    JobRole jobRole;
    ArrayList<JobRole> jobRoleList;
    ArrayList<EmployerOrganization> employerList;
        
    public JobApplicationPortal(JPanel mainWorkArea, UserAccount userAccount, 
            Organization organization, Business business, Applicant applicant) {
        initComponents();
        SplitPaneT1_1.setDividerSize(0);
        this.mainWorkArea = mainWorkArea;
        this.userAccount = userAccount;
        this.organization = organization;
        this.business = business;
        this.applicant = applicant;
        populateDomainComboBox();
    }
    
    JobApplicationPortal() {
        
    }
    
    public void populateDomainComboBox() {
        cbDomain.removeAllItems();
        Set<String> domainSet = new HashSet<>();
        
        for (Organization o: business.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof EmployerOrganization) {
                employerOrganization = (EmployerOrganization)o;
                Employer e = employerOrganization.getEmployer();
                for (JobRole jr: e.getJobRoleList())    
                    domainSet.add(jr.getDomain());
            }
        }
        
        for (String d: domainSet) {
            cbDomain.addItem(d);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SplitPaneT1_1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        lblTeacherPic1 = new javax.swing.JLabel();
        lblTeacherPic4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbDomain = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1400, 1080));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        SplitPaneT1_1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitPaneT1_1.setOpaque(false);
        SplitPaneT1_1.setPreferredSize(new java.awt.Dimension(1400, 1080));

        kGradientPanel2.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel2.setkTransparentControls(false);

        lblTeacherPic1.setBackground(new java.awt.Color(255, 255, 255));
        lblTeacherPic1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTeacherPic1.setForeground(new java.awt.Color(255, 255, 255));
        lblTeacherPic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherPic1.setText("Companies & Openings");
        lblTeacherPic1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblTeacherPic4.setBackground(new java.awt.Color(255, 255, 255));
        lblTeacherPic4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTeacherPic4.setForeground(new java.awt.Color(255, 255, 255));
        lblTeacherPic4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherPic4.setText("_____________________________");
        lblTeacherPic4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Area of Interest");

        cbDomain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cbDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDomainActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherPic4)
                    .addComponent(lblTeacherPic1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(cbDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnSearch)
                .addGap(0, 408, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addComponent(lblTeacherPic1)
                .addGap(12, 12, 12)
                .addComponent(lblTeacherPic4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SplitPaneT1_1.setTopComponent(jPanel1);

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 255, 255));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(kGradientPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );

        SplitPaneT1_1.setRightComponent(jPanel2);

        jScrollPane1.setViewportView(SplitPaneT1_1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
//        jPanel3.removeAll();
//        System.out.println("Removed from JPanel3");
//        jPanel4.removeAll();
//        jPanel5.removeAll();
//        for(StudentCourses studentcourses: studentcoursesarray.getStudentCoursesArray()){
//            for(TeacherMyCourses teachermycourses: teachermycoursesarray.getTeacherMyCoursesArray()){
//                if(txtsearch.getText().equals(teachermycourses.getTeacherName())
//                    && teachermycourses.getTeacherUsername().equals(studentcourses.getTeacherUsername())){
//                    //                    int numberofcourses = teachermycoursesarray.getTeacherMyCoursesArray().size();
//                    System.out.println("Inside loop");
//                    ImageIcon CourseImage = teachermycourses.getImageOfCourse();
//                    String CourseSubject = teachermycourses.getCourseSubject();
//                    String CourseName = teachermycourses.getCourseName();
//                    int CoursePrice = teachermycourses.getCoursePrice();
//                    String teacherusername = teachermycourses.getTeacherUsername();
//                    int coinbalance = Integer.parseInt(lblCoinBalance.getText());
//
//                    Card card = new Card();
//                    card.setColor1(new java.awt.Color(186, 123, 247));
//                    card.setColor2(new java.awt.Color(167, 94, 236));
//                    Model_Card modelcard = new Model_Card(CourseImage, CourseSubject, CourseName, CoursePrice);
//                    card.setData(modelcard);
//                    System.out.println("Card created");
//                    jPanel3.add(card);
//                    card.addBtnViewCourseActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            // Add your functionality here
//                            InsideViewCourse insideviewcourse = new InsideViewCourse(teachermycoursesarray, teacherprofilearray, teacherusername, CourseName, studentcoursesarray, studentprofilearray, studentusername, coinbalance);
//                            SplitPaneT1_1.setRightComponent(insideviewcourse);
//
//                        }
//                    });
//
//                }
//            }
//        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void cbDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDomainActionPerformed
        // TODO add your handling code here:
        populateCards();
    }//GEN-LAST:event_cbDomainActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        domain = (String)cbDomain.getSelectedItem();
        populateCards();
    }//GEN-LAST:event_btnSearchActionPerformed

    public void populateCards() {
        
        jobRoleList = new ArrayList();
        employerList = new ArrayList();
        jPanel3.removeAll();
        jPanel4.removeAll();
        jPanel5.removeAll();
        
        for (Organization o: business.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof EmployerOrganization) {
                employerOrganization = (EmployerOrganization)o;
                for (JobRole j: employerOrganization.getEmployer().getJobRoleList()) {
                    if (j.getDomain().equals(domain)) {
                        jobRoleList.add(j);
                        employerList.add(employerOrganization);
                    }
                }
            }
        }
        
        int numberOfRoles = jobRoleList.size();
        
        for (int i=0; i < numberOfRoles; i++) {
            employerOrganization = employerList.get(i);
            jobRole = jobRoleList.get(i);
            
            ImageIcon employerImage = jobRole.getImage();
            String employerName = employerList.get(i).getEmployer().getName();
            String jRole = jobRole.getName();
            double pay = jobRole.getPay();
            
            JobCard card = new JobCard();
            card.setColor1(new java.awt.Color(153, 102, 255));
            card.setColor2(new java.awt.Color(153, 204, 255));
            
            Model_Job_Card modelcard = new Model_Job_Card(
                    employerImage, employerName, jRole, pay);
            card.setData(modelcard);
            
            if(i<4){
                jPanel3.add(card);
            }
            
            if(i>=4 && i<8){
                jPanel4.add(card);
            }
            
            if(i>=8 && i<12){
                jPanel5.add(card);
            }
            
            card.addBtnViewCourseActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your functionality here
                
                InsideJobApplication ija = new InsideJobApplication(
                        userAccount, employerOrganization, jobRole, applicant);
                SplitPaneT1_1.setRightComponent(ija);
                }
            });
            
            jPanel3.revalidate();
            jPanel4.revalidate();
            jPanel5.revalidate();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneT1_1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbDomain;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblTeacherPic1;
    private javax.swing.JLabel lblTeacherPic4;
    // End of variables declaration//GEN-END:variables
}
