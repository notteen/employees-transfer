/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;

/**
 *
 * @author Sun of Vn
 */
public class LoginBO {
    String account;
    String password;
    int empID;
    public LoginBO() {
    }

    public LoginBO(String account, String password) {
        this.account = account;
        this.password = password;
    }
    public int login(){
        password=ultity.EncryptMD5.MD5Convert(password);
        Connect.DataAccess da=new DataAccess();
        int[] empInfo=da.getRole(account, password);
        empID=empInfo[1];
        return empInfo[0];
    }
    public int getEmployeeID(){
        return empID;
    }
}
