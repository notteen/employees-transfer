/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.LoginBO;
import view.FrmAddAdmin;
import view.FrmAdminForm;
import view.FrmEmployeeForm;
import view.FrmLogin;
import view.FrmMain;

/**
 *
 * @author Sun of Vn
 */
public class ControllerMain {
    int admin=1,employee=0,loginfail=-1;
    int accountType=0;
    FrmMain frmMain;
        FrmLogin frmLogin;
        FrmAdminForm frmAdmin;
        FrmEmployeeForm frmEmployee;
    public ControllerMain(){
        frmMain=new FrmMain();
        frmLogin=new FrmLogin(frmMain,true);
        frmLogin.setResizable(false);
        frmLogin.setLocationRelativeTo(frmMain);
        frmMain.getjMenuItem1().addActionListener(new menuitemListener());
        frmLogin.getBtLogin().addActionListener(new ButtonLoginListener1());
        frmMain.setVisible(true);
        frmLogin.setVisible(true);
    }
    class menuitemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // frmLogin=new FrmLogin(frmMain,true);
        frmLogin.setVisible(true);
        }
    }
    class ButtonLoginListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        model.LoginBO login=new LoginBO(frmLogin.getTxtAccount().getText(),frmLogin.getTxtPassword().getText());
        accountType=login.login();
        if(accountType==loginfail){
            JOptionPane.showMessageDialog(frmLogin,"UserName or password is incorrect");
        }
        if(accountType==admin){
            frmLogin.setVisible(false);
            frmAdmin=new FrmAdminForm(login.getEmployeeID(),frmMain,frmLogin);
            frmMain.setVisible(false);
            frmAdmin.setVisible(true);
        }
        if(accountType==employee){
            frmLogin.setVisible(false);
            frmEmployee=new FrmEmployeeForm(login.getEmployeeID(),frmMain,frmLogin);
            frmEmployee.setVisible(true);
            frmMain.setVisible(false);
        }
        accountType=-1;
        frmLogin.getTxtAccount().setText("");
        frmLogin.getTxtPassword().setText("");
        }
    }
}
