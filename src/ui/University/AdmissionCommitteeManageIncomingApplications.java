/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.University;

import business.Applicant.Applicant;
import business.Business;
import business.Organization.UniversityOrganization;
import business.University.Major;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ui.ViewAppDetails.ApplicantViewProfile;
/**
 *
 * @author sahil
 */
public class AdmissionCommitteeManageIncomingApplications extends javax.swing.JPanel {

    private JTable table;
    /**
     * Creates new form ManageIncomingApplications
     */
    JPanel rightProcessingContainer;
    UniversityOrganization universityOrganization;
    UserAccount userAccount;
    Applicant applicant;
    Major major;
    Business business;
    public AdmissionCommitteeManageIncomingApplications(
            UserAccount userAccount, UniversityOrganization universityOrganization, 
            JPanel rightProcessingContainer, Business business) {
        initComponents();
        this.universityOrganization = universityOrganization;
        this.userAccount = userAccount;
        this.rightProcessingContainer = rightProcessingContainer;
        this.business = business;
        populateComboBox();
    }
    
    public void populateComboBox() {
        cbCourse.removeAllItems();
        
        for(Major m: universityOrganization.getUniversity().getMajorList()) {
            cbCourse.addItem(m);
        }
    }
    
    public void populateTable() {
        Major selectedMajor = (Major) cbCourse.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblApp.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest w : universityOrganization.getWorkQueue().getWorkRequestList()){
            major = (Major) w.getSubject();
            if (selectedMajor == major){
                Object[] row = new Object[3];
                row[0] = w;
                row[1] = w.getSender().getPerson().getEmailAddress();
                row[2] = w.getStatus();
                model.addRow(row);
            }
            
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
        jLabel1 = new javax.swing.JLabel();
        cbCourse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblApp = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1400, 1080));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Incoming Applicants");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Course Name");

        tblApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicant Name", "Applicant Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblApp);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(314, 314, 314)
                            .addComponent(jLabel2)
                            .addGap(37, 37, 37)
                            .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(btnSearch))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(537, Short.MAX_VALUE))
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

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApp.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblApp.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Accepted") ||
                request.getStatus().equalsIgnoreCase("Rejected") ||
                request.getStatus().equalsIgnoreCase("Offer Accepted")) {
                JOptionPane.showMessageDialog(this, "Profile already Reviewed.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Accepted");
                request.setResolveDate(new Date());
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a Profile to process.");
            return;
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApp.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblApp.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Accepted") ||
                request.getStatus().equalsIgnoreCase("Rejected") ||
                request.getStatus().equalsIgnoreCase("Offer Accepted")) {
                JOptionPane.showMessageDialog(this, "Profile already Reviewed.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Rejected");
                request.setResolveDate(new Date());
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a Profile to process.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApp.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblApp.getValueAt(selectedRow, 0);
            applicant = request.getSender();

        } else {
            JOptionPane.showMessageDialog(null, "Choose a Profile to process.");
            return;
        }
        
        
        ApplicantViewProfile avp = new ApplicantViewProfile(
                rightProcessingContainer, applicant, business);
        rightProcessingContainer.add("ApplicantViewProfile", avp);
        CardLayout rightlayout = (CardLayout) rightProcessingContainer.getLayout();
        rightlayout.next(rightProcessingContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Major> cbCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblApp;
    // End of variables declaration//GEN-END:variables
}
