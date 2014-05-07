/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Connect.DataAccess;
import entity.Employee;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.DepartmentBO;
import model.EmployeeBO;
import model.LocationBO;
import model.ProjectBO;
import model.TableModel;
import model.TransferBO;

/**
 *
 * @author Sun of Vn
 */
public class FrmAdminForm extends javax.swing.JFrame {

    int empID=-1;
    FrmModifyEmployee modifyEmp;
    FrmModifyDepartment modifyDep;
    FrmModifyProject modifyProj;
    FrmModifyLocation modifyLoc;
    FrmModifyTransfer modifyTrans;
    
    FrmModifyEmployee modifyEmpEdit;
    FrmModifyDepartment modifyDepEdit;
    FrmModifyProject modifyProjEdit;
    FrmModifyLocation modifyLocEdit;
    FrmModifyTransfer modifyTransEdit;
    int add=0;
    int edit=1;
    /**
     * Creates new form FrmAdminForm
     */
    public FrmAdminForm(int id) {
        initComponents();
        this.setLocationRelativeTo( null );
        empID=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPaneAdmin = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployees = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTrans = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProject = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDepartment = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableLocation = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        cbxSearchType = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin page");

        jToolBar1.setRollover(true);

        btAdd.setText("Add");
        btAdd.setFocusable(false);
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btAdd);

        btEdit.setText("Edit");
        btEdit.setFocusable(false);
        btEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btEdit);

        btDelete.setText("Delete");
        btDelete.setFocusable(false);
        btDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btDelete);

        jButton4.setText("Refresh");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jTabbedPaneAdmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneAdminStateChanged(evt);
            }
        });

        jTableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableEmployees.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTableEmployees);
        jTableEmployees.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("List Employees", jPanel1);

        jTableTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableTrans.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(jTableTrans);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("List Transfer", jPanel2);

        jTableProject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProject.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(jTableProject);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("List Project", jPanel3);

        jTableDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDepartment.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane4.setViewportView(jTableDepartment);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("List Department", jPanel4);

        jTableLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableLocation.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane5.setViewportView(jTableLocation);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("List Location", jPanel5);

        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.setText("Search");
        txtSearch.setToolTipText("Enter to complete search");
        txtSearch.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        txtSearch.setMinimumSize(new java.awt.Dimension(55, 20));
        txtSearch.setPreferredSize(new java.awt.Dimension(85, 20));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btSearch.setText("jButton5");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        cbxSearchType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Name", "Location", "Project", "Department" }));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAdmin)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSearch)
                        .addComponent(cbxSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.getAccessibleContext().setAccessibleName("frmAdmin_tab1");
        cbxSearchType.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneAdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneAdminStateChanged
       if(jTabbedPaneAdmin.getSelectedIndex()==0){
        try {
                    jTableEmployees.setModel(new TableModel(new DataAccess().getEmployee(0)));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         if(jTabbedPaneAdmin.getSelectedIndex()==1){
        try {
                    jTableTrans.setModel(new TableModel(new DataAccess().getTransfers()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         if(jTabbedPaneAdmin.getSelectedIndex()==2){
        try {
                    jTableProject.setModel(new TableModel(new DataAccess().getProjects()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         
          if(jTabbedPaneAdmin.getSelectedIndex()==3){
        try {
                    jTableDepartment.setModel(new TableModel(new DataAccess().getDepartments()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
          
           if(jTabbedPaneAdmin.getSelectedIndex()==4){
        try {
                    jTableLocation.setModel(new TableModel(new DataAccess().getLocations()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
    }//GEN-LAST:event_jTabbedPaneAdminStateChanged

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained

    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost

    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String searchType="";
        String nameSearch="EmployeeName";
        String locationSearch="LocationName";
        String projectSearch="ProjectName";
        String departmentSearch="DepartmentName";
        if(cbxSearchType.getSelectedIndex()==1){searchType=nameSearch;}
        if(cbxSearchType.getSelectedIndex()==2){searchType=locationSearch;}
        if(cbxSearchType.getSelectedIndex()==3){searchType=projectSearch;}
        if(cbxSearchType.getSelectedIndex()==4){searchType=departmentSearch;}
        DataAccess da=new DataAccess();
        try {
            this.jTableEmployees.setModel(new model.TableModel(da.search(searchType, txtSearch.getText().trim())));
        } catch (SQLException ex) {
            Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(jTabbedPaneAdmin.getSelectedIndex()==0){
            modifyEmp=new FrmModifyEmployee(add,-1);
            modifyEmp.setParent(this);
            modifyEmp.setVisible(true);
            modifyEmp.setTitle("Add employee");
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==1){
            modifyTrans=new FrmModifyTransfer(add, -1);
            modifyTrans.setParent(this);
            modifyTrans.setVisible(true);
            modifyTrans.setTitle("Add Transfer");
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==2){
            modifyProj=new FrmModifyProject(add, -1);
            modifyProj.setParent(this);
            modifyProj.setVisible(true);
            modifyProj.setTitle("Add project");
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==3){
            modifyDep=new FrmModifyDepartment(add, -1);
            modifyDep.setParent(this);
            modifyDep.setVisible(true);
            modifyDep.setTitle("Add department");
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==4){
            modifyLoc=new FrmModifyLocation(add, -1);
            modifyLoc.setParent(this);
            modifyLoc.setVisible(true);
            modifyLoc.setTitle("Add location");
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(jTabbedPaneAdmin.getSelectedIndex()==0){
               int[] arr=jTableEmployees.getSelectedRows();
        Employee[] emps=new Employee[arr.length];
        for(int i=0;i<emps.length;i++){
                Employee emp=new Employee();
                emp.setUserID((int) jTableEmployees.getValueAt(i, 3));
                emp.setEmployeeNumber((int) jTableEmployees.getValueAt(i, 0));
                emps[i]=(emp);
            }
       int dialogButton = JOptionPane.YES_NO_OPTION;
       if(arr.length>0){
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete selected rows?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            EmployeeBO empBO=new EmployeeBO();
            if(empBO.deleteEmployees(emps))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                refresh();
            }
        }
       }
        }
        
         if(jTabbedPaneAdmin.getSelectedIndex()==1){
        int[] arr=jTableTrans.getSelectedRows();
        if(arr.length>0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete selected rows?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            int[] ids=new int[arr.length];
            for(int i=0;i<ids.length;i++){
                ids[i]=(int) jTableTrans.getValueAt(i, 0);
            }
        TransferBO bo=new TransferBO();
            if(bo.deleteTransfer(ids))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                refresh();
            }
        }
        }
        }
         
         
        if(jTabbedPaneAdmin.getSelectedIndex()==2){
        int[] arr=jTableProject.getSelectedRows();
        if(arr.length>0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete selected rows?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            int[] ids=new int[arr.length];
            for(int i=0;i<ids.length;i++){
                ids[i]=(int) jTableProject.getValueAt(i, 0);
            }
        ProjectBO bo=new ProjectBO();
            if(bo.deleteProject(ids))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                refresh();
            }
        }
        }
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==3){
                int[] arr=jTableDepartment.getSelectedRows();
        if(arr.length>0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete selected rows?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            int[] ids=new int[arr.length];
            for(int i=0;i<ids.length;i++){
                ids[i]=(int) jTableDepartment.getValueAt(i, 0);
            }
        DepartmentBO bo=new DepartmentBO();
            if(bo.deleteDepartment(ids))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                refresh();
            }
        }
        }
        }
            if(jTabbedPaneAdmin.getSelectedIndex()==4){
                        int[] arr=jTableLocation.getSelectedRows();
        if(arr.length>0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete selected rows?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            int[] ids=new int[arr.length];
            for(int i=0;i<ids.length;i++){
                ids[i]=(int) jTableLocation.getValueAt(i, 0);
            }
        LocationBO bo=new LocationBO();
            if(bo.deleteLocation(ids))
            {
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
                refresh();
            }
        }
        }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        refresh();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if(jTabbedPaneAdmin.getSelectedIndex()==0){
        if(jTableEmployees.getSelectedRow()>=0){
            int rowIndex=jTableEmployees.getSelectedRow();
            int empID=(int) jTableEmployees.getValueAt(rowIndex, 0);
            modifyEmpEdit=new FrmModifyEmployee(edit,empID);
            modifyEmpEdit.setParent(this);
            modifyEmpEdit.setVisible(true);
        }
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==1){
        if(jTableTrans.getSelectedRow()>=0){
            int rowIndex=jTableTrans.getSelectedRow();
            int transID=(int) jTableTrans.getValueAt(rowIndex, 0);
            
             modifyTransEdit=new FrmModifyTransfer(edit,transID);
            modifyTransEdit.setParent(this);
            modifyTransEdit.setVisible(true);
        }
        }
        
        if(jTabbedPaneAdmin.getSelectedIndex()==2){
        if(jTableProject.getSelectedRow()>=0){
            int rowIndex=jTableProject.getSelectedRow();
            int empID=(int) jTableProject.getValueAt(rowIndex, 0);
            
             modifyProjEdit=new FrmModifyProject(edit,empID);
            modifyProjEdit.setParent(this);
            modifyProjEdit.setVisible(true);
        }
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==3){
        if(jTableDepartment.getSelectedRow()>=0){
            int rowIndex=jTableDepartment.getSelectedRow();
            int empID=(int) jTableDepartment.getValueAt(rowIndex, 0);
            
             modifyDepEdit=new FrmModifyDepartment(edit,empID);
            modifyDepEdit.setParent(this);
            modifyDepEdit.setVisible(true);
        }
        }
        if(jTabbedPaneAdmin.getSelectedIndex()==4){
        if(jTableLocation.getSelectedRow()>=0){
            int rowIndex=jTableLocation.getSelectedRow();
            int empID=(int) jTableLocation.getValueAt(rowIndex, 0);
             modifyLocEdit=new FrmModifyLocation(edit,empID);
            modifyLocEdit.setParent(this);
            modifyLocEdit.setVisible(true);
        }
        }
        
    }//GEN-LAST:event_btEditActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmAdminForm().setVisible(true);
//            }
//        });
//    }

    public JTable getFrmAdminTableEmployees() {
        return jTableEmployees;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox cbxSearchType;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneAdmin;
    private javax.swing.JTable jTableDepartment;
    private javax.swing.JTable jTableEmployees;
    private javax.swing.JTable jTableLocation;
    private javax.swing.JTable jTableProject;
    private javax.swing.JTable jTableTrans;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void refresh() {
        if(jTabbedPaneAdmin.getSelectedIndex()==0){
        try {
                    jTableEmployees.setModel(new TableModel(new DataAccess().getEmployee(0)));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         if(jTabbedPaneAdmin.getSelectedIndex()==1){
        try {
                    jTableTrans.setModel(new TableModel(new DataAccess().getTransfers()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         if(jTabbedPaneAdmin.getSelectedIndex()==2){
        try {
                    jTableProject.setModel(new TableModel(new DataAccess().getProjects()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
         
          if(jTabbedPaneAdmin.getSelectedIndex()==3){
        try {
                    jTableDepartment.setModel(new TableModel(new DataAccess().getDepartments()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
          
           if(jTabbedPaneAdmin.getSelectedIndex()==4){
        try {
                    jTableLocation.setModel(new TableModel(new DataAccess().getLocations()));
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAdminForm.class.getName()).log(Level.SEVERE, null, ex);
                }}
    }
}
