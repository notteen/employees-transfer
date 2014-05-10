/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Department;
import entity.Employee;
import entity.Location;
import entity.Project;
import entity.Transfer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultity.EncryptMD5;

/**
 *
 * @author Sun of Vn
 */
public class TransferBO {

    public boolean deleteTransfer(int[] ids) {
        DataAccess da=new DataAccess();
        return da.deleteTransfer(ids);
    }
     public boolean addTransfer(Transfer e){
        DataAccess da=new DataAccess();
        boolean stt=da.insertTransfer(e);
        return stt;
    }
    public boolean updateTransfer(Transfer e){
        DataAccess da=new DataAccess();
        boolean stt=da.updateTransfer(e);
        return stt;
    }
    
     public Transfer getTransferbyID(int transID){
          Transfer trans=null;
        try {
            DataAccess da=new DataAccess();
             ResultSet rs=da.getTransfer(transID);
             while(rs.next()){
            trans = new Transfer();
           trans.setTransferID(transID);
            trans.setEmployeeNumber(rs.getInt(2));
            trans.setTransferFromProjectID(rs.getInt(3));
            trans.setTransferFromDepartmentID(rs.getInt(4));
            trans.setTransferFromLocationID(rs.getInt(5));
            trans.setTransferToProjectID(rs.getInt(6));
            trans.setTransferToLocationID(rs.getInt(7));
            trans.setTransferToDepartmentID(rs.getInt(8));
            trans.setTransferRelievingDate(rs.getString(9));
            if(rs.getBoolean(10)==true)
            trans.setStatus(true);
            else trans.setStatus(false);
            trans.setTransferJoiningDate(rs.getString(11));
             }
        } catch (SQLException ex) {
            Logger.getLogger(TransferBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trans;
    }
}
