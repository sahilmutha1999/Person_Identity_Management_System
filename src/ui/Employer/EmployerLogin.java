/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Employer;

import business.Business;
import business.Employer.Employer;
import business.Organization.EmployerOrganization;
import business.Organization.Organization;
import static business.Organization.Organization.Type.Employer;
import static business.Role.Role.RoleType.Admin;
import static business.Role.Role.RoleType.HiringManager;
import static business.Role.Role.RoleType.Recruiter;
import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Dashboards.EmployerAdminDashboard;
import ui.Student.*;

/**
 *
 * @author sahil
 */
public class EmployerLogin extends javax.swing.JPanel {

    /**
     * Creates new form StudentSignUp
     */
    JPanel rightProcessingContainer;
    JPanel leftProcessingContainer;
    Business business;
    EmployerOrganization employerOrganization;
    UserAccount userAccount;
    
    public EmployerLogin(JPanel rightProcessingContainer,
            JPanel leftProcessingContainer, Business business) {
        initComponents();
        jLabel4.setVisible(false);
        btnSignup.setVisible(false);
        this.rightProcessingContainer = rightProcessingContainer;
        this.leftProcessingContainer = leftProcessingContainer;
        this.business = business;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        cbRoles = new javax.swing.JComboBox<>();

        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employer Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don't have an account?");

        btnLogin.setBackground(new java.awt.Color(153, 255, 102));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(51, 51, 255));
        btnSignup.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setBorder(null);
        btnSignup.setOpaque(true);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        cbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Admin", "Hiring Manager", "Recruiter" }));
        cbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(165, 165, 165)))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbRoles, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(511, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentLoginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnStudentLoginActionPerformed

    private void btnTeacherSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherSignUpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTeacherSignUpActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        EmployerSignUp employersignup = new EmployerSignUp(rightProcessingContainer, leftProcessingContainer, business);
        rightProcessingContainer.add("EmployerSignUp",employersignup);
        CardLayout layout = (CardLayout) rightProcessingContainer.getLayout();
        layout.next(rightProcessingContainer);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        boolean flag = false;
        EmployerOrganization e = new EmployerOrganization();
        
        for(Organization organization : business.getOrganizationDirectory()
                .getOrganizationList()){
            String selectedRole = cbRoles.getSelectedItem().toString();
            
            userAccount = organization.getUserAccountDirectory()
                    .authenticateUser(userName, password);
            
//            System.out.println(e.getSupportedRole() + " | " + userAccount.getRole());

            
            if (userAccount != null 
                    && e.getSupportedRole().contains(userAccount.getRole())
                    && organization instanceof EmployerOrganization){
                
                employerOrganization = (EmployerOrganization)organization;
                
//                System.out.println(selectedRole + "|" + userAccount.getRole().type);
                
                if(selectedRole.equals("Admin") && 
                        userAccount.getRole().type.equals(Admin)){
                    
                    AdminLeftPanel adminleftpanel = new AdminLeftPanel(
                            rightProcessingContainer, leftProcessingContainer, 
                            business, employerOrganization, userAccount);
                    leftProcessingContainer.add("AdminLeftPanel", adminleftpanel);
                    CardLayout layout = (CardLayout) leftProcessingContainer.getLayout();
                    layout.next(leftProcessingContainer);

                    EmployerAdminDashboard employerviewjobs = new EmployerAdminDashboard(employerOrganization);
                    rightProcessingContainer.add("EmployerViewJobs", employerviewjobs);
                    CardLayout layout2 = (CardLayout) rightProcessingContainer.getLayout();
                    layout2.next(rightProcessingContainer);
                    flag = true;
                    break;
                }
                else if(selectedRole.equals("Recruiter") && 
                        userAccount.getRole().type.equals(Recruiter)){
                    RecruiterLeftPanel recruiterLeftPanel = 
                            new RecruiterLeftPanel(rightProcessingContainer, 
                                    leftProcessingContainer, business, 
                                    employerOrganization, userAccount);
                    
                    leftProcessingContainer.add("RecruiterLeftPanel", recruiterLeftPanel);
                    CardLayout layout = (CardLayout) leftProcessingContainer.getLayout();
                    layout.next(leftProcessingContainer);

                    ManageIncomingApplications manageincomingapp = 
                            new ManageIncomingApplications(employerOrganization,
                                userAccount, business, rightProcessingContainer);
                    rightProcessingContainer.add("ManageIncomingApplications", 
                            manageincomingapp);
                    CardLayout layout2 = (CardLayout) rightProcessingContainer.getLayout();
                    layout2.next(rightProcessingContainer);
                    flag = true;
                    break;
                }
                else if(selectedRole.equals("Hiring Manager") && 
                        userAccount.getRole().type.equals(HiringManager)){
                    HRLeftPanel hrleftpanel = new HRLeftPanel(
                            rightProcessingContainer, leftProcessingContainer, 
                            business, employerOrganization, userAccount);
                    leftProcessingContainer.add("HRLeftPanel", hrleftpanel);
                    CardLayout layout = (CardLayout) leftProcessingContainer.getLayout();
                    layout.next(leftProcessingContainer);

                    JobManagement jobmanagement = new JobManagement(
                            rightProcessingContainer, employerOrganization);
                    rightProcessingContainer.add("JobManagement", jobmanagement);
                    CardLayout layout2 = (CardLayout) rightProcessingContainer.getLayout();
                    layout2.next(rightProcessingContainer);
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
                JOptionPane.showMessageDialog(this, "Invalid User Name/ Password.");
                return;
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolesActionPerformed
        // TODO add your handling code here:
        checkthis();
    }//GEN-LAST:event_cbRolesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cbRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void checkthis() {
        if(cbRoles.getSelectedItem().equals("Admin")){
            jLabel4.setVisible(true);
            btnSignup.setVisible(true);
        }
        else{
            jLabel4.setVisible(false);
            btnSignup.setVisible(false);
        }
    }
}
