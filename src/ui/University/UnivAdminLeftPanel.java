/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.University;

import business.Business;
import business.Organization.UniversityOrganization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPanel;
import ui.Dashboards.UniversityAdminDashboard;

/**
 *
 * @author sahil
 */
public class UnivAdminLeftPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLeftPanel
     */
    JPanel rightProcessingContainer;
    JPanel leftProcessingContainer;
    UniversityOrganization universityOrganization;
    Business business;
    UserAccount userAccount;
    
    public UnivAdminLeftPanel(JPanel rightProcessingContainer,
            JPanel leftProcessingContainer, Business business, 
            UniversityOrganization universityOrganization, UserAccount userAccount) {
        initComponents();
        this.rightProcessingContainer = rightProcessingContainer;
        this.leftProcessingContainer = leftProcessingContainer;
        this.universityOrganization = universityOrganization;
        this.business = business;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        btnManageProfile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblStudentName3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnStudentDashboard = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnManageUnivApplication = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnViewUnivCourses = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        kGradientPanel3.setkStartColor(new java.awt.Color(102, 204, 255));

        jPanel3.setOpaque(false);

        btnManageProfile.setBackground(new java.awt.Color(15, 162, 223));
        btnManageProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProfile.setText("Manage University Profile");
        btnManageProfile.setBorder(null);
        btnManageProfile.setContentAreaFilled(false);
        btnManageProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnManageProfile.setFocusTraversalPolicyProvider(true);
        btnManageProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManageProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageProfileMouseExited(evt);
            }
        });
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile-icon-png-resized.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        kGradientPanel6.setkGradientFocus(1000);
        kGradientPanel6.setkStartColor(new java.awt.Color(102, 204, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Hello");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Welcome to Coursemy");

        lblStudentName3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblStudentName3.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentName3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStudentName3.setText("Univ. Admin");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStudentName3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblStudentName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        jPanel5.setOpaque(false);

        btnStudentDashboard.setBackground(new java.awt.Color(15, 162, 223));
        btnStudentDashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStudentDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentDashboard.setText("My Dashboard");
        btnStudentDashboard.setBorder(null);
        btnStudentDashboard.setContentAreaFilled(false);
        btnStudentDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStudentDashboard.setFocusTraversalPolicyProvider(true);
        btnStudentDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudentDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentDashboardMouseExited(evt);
            }
        });
        btnStudentDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentDashboardActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dahboard.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudentDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStudentDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel6.setOpaque(false);

        btnLogout.setBackground(new java.awt.Color(15, 162, 223));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogout.setFocusTraversalPolicyProvider(true);
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel7.setOpaque(false);

        btnManageUnivApplication.setBackground(new java.awt.Color(15, 162, 223));
        btnManageUnivApplication.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageUnivApplication.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUnivApplication.setText("Manage User Profiles");
        btnManageUnivApplication.setBorder(null);
        btnManageUnivApplication.setContentAreaFilled(false);
        btnManageUnivApplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnManageUnivApplication.setFocusTraversalPolicyProvider(true);
        btnManageUnivApplication.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManageUnivApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageUnivApplicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageUnivApplicationMouseExited(evt);
            }
        });
        btnManageUnivApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUnivApplicationActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teachermystudent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageUnivApplication, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageUnivApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel4.setOpaque(false);

        btnViewUnivCourses.setBackground(new java.awt.Color(15, 162, 223));
        btnViewUnivCourses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewUnivCourses.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUnivCourses.setText("View University Courses");
        btnViewUnivCourses.setBorder(null);
        btnViewUnivCourses.setContentAreaFilled(false);
        btnViewUnivCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnViewUnivCourses.setFocusTraversalPolicyProvider(true);
        btnViewUnivCourses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnViewUnivCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewUnivCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewUnivCoursesMouseExited(evt);
            }
        });
        btnViewUnivCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUnivCoursesActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewcourses.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewUnivCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewUnivCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(705, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageProfileMouseEntered
        // TODO add your handling code here:
        btnManageProfile.setForeground(Color.BLACK);
        btnManageProfile.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnManageProfileMouseEntered

    private void btnManageProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageProfileMouseExited
        // TODO add your handling code here:
        btnManageProfile.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnManageProfileMouseExited

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
        UniversityProfile up = new UniversityProfile(universityOrganization, 
                userAccount);
        rightProcessingContainer.add("UniversityProfile",up);
        CardLayout layout = (CardLayout) rightProcessingContainer.getLayout();
        layout.next(rightProcessingContainer);
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnStudentDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentDashboardMouseEntered
        // TODO add your handling code here:
        btnStudentDashboard.setForeground(Color.BLACK);
        btnStudentDashboard.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnStudentDashboardMouseEntered

    private void btnStudentDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentDashboardMouseExited
        // TODO add your handling code here:
        btnStudentDashboard.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnStudentDashboardMouseExited

    private void btnStudentDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentDashboardActionPerformed
        // TODO add your handling code here:
        UniversityAdminDashboard teacherdashboard = 
                new UniversityAdminDashboard(universityOrganization);
        rightProcessingContainer.add("TeacherOverviewPanel1",teacherdashboard);
        CardLayout layout = (CardLayout) rightProcessingContainer.getLayout();
        layout.next(rightProcessingContainer);
    }//GEN-LAST:event_btnStudentDashboardActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        btnLogout.setForeground(Color.BLACK);
        btnLogout.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        btnLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        leftProcessingContainer.remove(this);
        CardLayout leftlayout = (CardLayout) leftProcessingContainer.getLayout();
        leftlayout.previous(leftProcessingContainer);

        UniversityLogin ul = new UniversityLogin(rightProcessingContainer, 
                leftProcessingContainer, business);
        rightProcessingContainer.add("UniversityLogin",ul);
        CardLayout rightlayout = (CardLayout) rightProcessingContainer.getLayout();
        rightlayout.next(rightProcessingContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageUnivApplicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageUnivApplicationMouseEntered
        // TODO add your handling code here:
        btnManageUnivApplication.setForeground(Color.BLACK);
        btnManageUnivApplication.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnManageUnivApplicationMouseEntered

    private void btnManageUnivApplicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageUnivApplicationMouseExited
        // TODO add your handling code here:
        btnManageUnivApplication.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnManageUnivApplicationMouseExited

    private void btnManageUnivApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUnivApplicationActionPerformed
        // TODO add your handling code here:
        UniversityUserProfileManagement uupm = new UniversityUserProfileManagement(
                rightProcessingContainer, business, universityOrganization);
        rightProcessingContainer.add("UniversityUserProfileManagement", uupm);
        CardLayout rightlayout = (CardLayout) rightProcessingContainer.getLayout();
        rightlayout.next(rightProcessingContainer);
    }//GEN-LAST:event_btnManageUnivApplicationActionPerformed

    private void btnViewUnivCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewUnivCoursesMouseEntered
        // TODO add your handling code here:
        btnViewUnivCourses.setForeground(Color.BLACK);
        btnViewUnivCourses.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnViewUnivCoursesMouseEntered

    private void btnViewUnivCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewUnivCoursesMouseExited
        // TODO add your handling code here:
        btnViewUnivCourses.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnViewUnivCoursesMouseExited

    private void btnViewUnivCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUnivCoursesActionPerformed
        // TODO add your handling code here:
        AdminViewCourses avc = new AdminViewCourses(universityOrganization);
        rightProcessingContainer.add("AdminViewCourses", avc);
        CardLayout layout2 = (CardLayout) rightProcessingContainer.getLayout();
        layout2.next(rightProcessingContainer);
    }//GEN-LAST:event_btnViewUnivCoursesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnManageUnivApplication;
    private javax.swing.JButton btnStudentDashboard;
    private javax.swing.JButton btnViewUnivCourses;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JLabel lblStudentName3;
    // End of variables declaration//GEN-END:variables
}
