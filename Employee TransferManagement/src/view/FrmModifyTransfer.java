/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Department;
import entity.Employee;
import entity.Location;
import entity.Project;
import entity.Transfer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.DepartmentBO;
import model.EmployeeBO;
import model.LocationBO;
import model.ProjectBO;
import model.TransferBO;

/**
 *
 * @author Sun of Vn
 */
public class FrmModifyTransfer extends javax.swing.JFrame {

    /**
     * Creates new form FrmModifyTransfer
     */
    private int add=0;
    private int edit=1;
    private int tranferID=-1;
    FrmAdminForm parent;
    private int modifyMode;
    public FrmModifyTransfer(int modifyMode,int tranferID) {
        this.initComponents();
        this.setLocationRelativeTo( null );
        this.modifyMode=modifyMode;
        this.tranferID=tranferID;
        if(modifyMode==add){
        lbTransferID.setVisible(false);
        lbtransID.setVisible(false);
            EmployeeBO empBO=new EmployeeBO();
            ProjectBO prjBO=new ProjectBO();
        LocationBO locBO=new LocationBO();
        DepartmentBO depBO=new DepartmentBO();
        Vector<Project> prj=prjBO.getProjects();
        Vector<Department> dep=depBO.getDepartments();
        Vector<Location> loc=locBO.getLocations();
        btDelete.setVisible(false);
        
        cbxFromProject.setModel(new DefaultComboBoxModel(prj));
        cbxFromDepartment.setModel(new DefaultComboBoxModel(dep));
        cbxFromLocation.setModel(new DefaultComboBoxModel(loc));
        cbxToProject.setModel(new DefaultComboBoxModel(prj));
        cbxToDepartment.setModel(new DefaultComboBoxModel(dep));
        cbxToLocation.setModel(new DefaultComboBoxModel(loc));
                
        cbxEmployee.setModel(new DefaultComboBoxModel(empBO.getEmployees()));
        }
        if(modifyMode==edit){
            btAdd.setText("Edit");
            lbTransferID.setText(tranferID+"");
                        EmployeeBO empBO=new EmployeeBO();
            ProjectBO prjBO=new ProjectBO();
        LocationBO locBO=new LocationBO();
        DepartmentBO depBO=new DepartmentBO();
        Vector<Project> prj=prjBO.getProjects();
        Vector<Department> dep=depBO.getDepartments();
        Vector<Location> loc=locBO.getLocations();
        Vector<Employee> emp=empBO.getEmployees();
        
        
            int projectFromIndex = -1;
            int projectToIndex = -1;
            int departmentFromIndex = -1;
            int departmentToIndex = -1;
            int locationFromIndex = -1;
            int locationToIndex = -1;
            int employeeIndex = -1;
            Transfer trans =new TransferBO().getTransferbyID(tranferID);
            if(trans!=null){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date=formatter.parse(trans.getTransferJoiningDate());
                jDateChooser1.setDate(date);
                Date date2=formatter.parse(trans.getTransferRelievingDate());
                jDateChooser3.setDate(date2);
            } catch (Exception ex) {
                Logger.getLogger(FrmModifyEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(trans.isStatus()==true)rbApprove.setSelected(true);
            else rbPendding.setSelected(true);
        for(int i=0;i<prj.size();i++){
        if(prj.get(i).getProjectID()==trans.getTransferFromProjectID()){
            projectFromIndex=i;
            break;}
        }
        for(int i=0;i<prj.size();i++){
        if(prj.get(i).getProjectID()==trans.getTransferToProjectID()){
            projectToIndex=i;
            break;}
        }
        
        for(int i=0;i<dep.size();i++){
        if(dep.get(i).getDepartmentID()==trans.getTransferFromDepartmentID()){
            departmentFromIndex=i;
            break;}
        }
        for(int i=0;i<dep.size();i++){
        if(dep.get(i).getDepartmentID()==trans.getTransferToDepartmentID()){
            departmentToIndex=i;
            break;}
        }
        
        for(int i=0;i<loc.size();i++){
        if(loc.get(i).getLocationID()==trans.getTransferToLocationID()){
            locationFromIndex=i;
            break;}
        }
        for(int i=0;i<loc.size();i++){
        if(loc.get(i).getLocationID()==trans.getTransferToLocationID()){
            locationToIndex=i;
            break;}
        }
            }
        cbxFromProject.setModel(new DefaultComboBoxModel(prj));
        if(projectFromIndex>=0)
                cbxFromProject.setSelectedIndex(projectFromIndex);
        cbxFromDepartment.setModel(new DefaultComboBoxModel(dep));
        if(departmentFromIndex>=0)
                cbxFromDepartment.setSelectedIndex(departmentFromIndex);
        cbxToDepartment.setModel(new DefaultComboBoxModel(dep));
        cbxFromLocation.setModel(new DefaultComboBoxModel(loc));
         if(locationFromIndex>=0)
                cbxFromLocation.setSelectedIndex(locationFromIndex);
        cbxToDepartment.setModel(new DefaultComboBoxModel(dep));
        cbxToProject.setModel(new DefaultComboBoxModel(prj));
         if(projectToIndex>=0)
                cbxToProject.setSelectedIndex(projectToIndex);
        cbxToDepartment.setModel(new DefaultComboBoxModel(dep));
         if(departmentToIndex>=0)
                cbxToDepartment.setSelectedIndex(departmentToIndex);
        cbxToLocation.setModel(new DefaultComboBoxModel(loc));
          if(locationToIndex>=0)
                cbxToLocation.setSelectedIndex(locationToIndex);
        cbxEmployee.setModel(new DefaultComboBoxModel(empBO.getEmployees()));
         if(employeeIndex>=0)
        cbxEmployee.setSelectedIndex(employeeIndex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbxFromDepartment = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxFromLocation = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cbxFromProject = new javax.swing.JComboBox();
        cbxToDepartment = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbxToLocation = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cbxToProject = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        rbApprove = new javax.swing.JRadioButton();
        rbPendding = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        cbxEmployee = new javax.swing.JComboBox();
        lbtransID = new javax.swing.JLabel();
        lbTransferID = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modify transfer page");

        cbxFromDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFromDepartment.setAutoscrolls(true);
        cbxFromDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFromDepartmentActionPerformed(evt);
            }
        });

        jLabel9.setText("From Project");

        jLabel11.setText("From Department");

        cbxFromLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFromLocation.setAutoscrolls(true);

        jLabel10.setText("From Location");

        cbxFromProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFromProject.setAutoscrolls(true);

        cbxToDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxToDepartment.setAutoscrolls(true);
        cbxToDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxToDepartmentActionPerformed(evt);
            }
        });

        jLabel12.setText("To Location");

        jLabel13.setText("To Department");

        cbxToLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxToLocation.setAutoscrolls(true);

        jLabel14.setText("To Project");

        cbxToProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxToProject.setAutoscrolls(true);

        jLabel15.setText("Status");

        buttonGroup1.add(rbApprove);
        rbApprove.setSelected(true);
        rbApprove.setText("approve");

        buttonGroup1.add(rbPendding);
        rbPendding.setText("Pending");

        jLabel16.setText("TransferJoiningDate");

        jDateChooser1.setDate(new java.util.Date(1399462234000L));
        jDateChooser1.setDoubleBuffered(false);

        jLabel18.setText("TransferRelievingDate");

        jDateChooser3.setDate(new java.util.Date(1399462234000L));
        jDateChooser3.setDoubleBuffered(false);

        jLabel17.setText("Employee");

        cbxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEmployee.setAutoscrolls(true);

        lbtransID.setText("TransferID");

        lbTransferID.setText("Employee");

        btAdd.setText("Add");
        btAdd.setMaximumSize(new java.awt.Dimension(83, 25));
        btAdd.setMinimumSize(new java.awt.Dimension(83, 25));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gnome_edit_delete.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/s_cancel.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxFromProject, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxFromDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxFromLocation, 0, 134, Short.MAX_VALUE))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbApprove)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbPendding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel12))
                                            .addComponent(jLabel14))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbxToProject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbxToDepartment, 0, 131, Short.MAX_VALUE)
                                                .addComponent(cbxToLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel16)
                                                .addGap(16, 16, 16)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 2, Short.MAX_VALUE)))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbtransID)
                        .addGap(18, 18, 18)
                        .addComponent(lbTransferID)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtransID)
                    .addComponent(lbTransferID))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxToProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cbxToLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(cbxToDepartment)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel16))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxFromProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbxFromLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(cbxFromDepartment)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(rbApprove)
                            .addComponent(rbPendding))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFromDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFromDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFromDepartmentActionPerformed

    private void cbxToDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxToDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxToDepartmentActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        Transfer trans=new Transfer();
        trans.setTransferID(tranferID);
        if(cbxEmployee.getModel().getSize()>0)
        trans.setEmployeeNumber(((Employee)(cbxEmployee.getSelectedItem())).getEmployeeNumber());
        if(cbxToProject.getModel().getSize()>0)
        trans.setTransferToProjectID(((Project)(cbxToProject.getSelectedItem())).getProjectID());
        if(cbxToLocation.getModel().getSize()>0)
        trans.setTransferToLocationID(((Location)(cbxToLocation.getSelectedItem())).getLocationID());
        if(cbxToDepartment.getModel().getSize()>0)
        trans.setTransferToDepartmentID(((Department)(cbxToDepartment.getSelectedItem())).getDepartmentID());
        if(cbxFromProject.getModel().getSize()>0)
        trans.setTransferFromProjectID(((Project)(cbxFromProject.getSelectedItem())).getProjectID());
        if(cbxFromLocation.getModel().getSize()>0)
        trans.setTransferFromLocationID(((Location)(cbxFromLocation.getSelectedItem())).getLocationID());
        if(cbxFromDepartment.getModel().getSize()>0)
        trans.setTransferFromDepartmentID(((Department)(cbxFromDepartment.getSelectedItem())).getDepartmentID());
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        trans.setTransferJoiningDate(formatter.format(jDateChooser1.getDate()));
        if(rbApprove.isSelected())
        trans.setStatus(true);
        else trans.setStatus(false);
        trans.setTransferRelievingDate(formatter.format(jDateChooser3.getDate()));
        if(modifyMode==add){
            TransferBO bo=new TransferBO();
            if(bo.addTransfer(trans))
       {
           parent.refresh();
           JOptionPane.showMessageDialog(this,"Add transfer successful");
           this.dispose();
       }
        }
         if(modifyMode==edit){
            TransferBO bo=new TransferBO();
            if(bo.updateTransfer(trans))
       {
           parent.refresh();
           JOptionPane.showMessageDialog(this,"Update transfer successful");
           this.dispose();
       }
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
           int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete this transfer?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
        TransferBO bo=new TransferBO();
            if(bo.deleteTransfer(new int[]{tranferID}))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                parent.refresh();
                this.dispose();
            }else JOptionPane.showMessageDialog(rootPane, "Delete fail!");
        }  
    }//GEN-LAST:event_btDeleteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxEmployee;
    private javax.swing.JComboBox cbxFromDepartment;
    private javax.swing.JComboBox cbxFromLocation;
    private javax.swing.JComboBox cbxFromProject;
    private javax.swing.JComboBox cbxToDepartment;
    private javax.swing.JComboBox cbxToLocation;
    private javax.swing.JComboBox cbxToProject;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbTransferID;
    private javax.swing.JLabel lbtransID;
    private javax.swing.JRadioButton rbApprove;
    private javax.swing.JRadioButton rbPendding;
    // End of variables declaration//GEN-END:variables

    void setParent(FrmAdminForm aThis) {
        parent=aThis;
    }
}
