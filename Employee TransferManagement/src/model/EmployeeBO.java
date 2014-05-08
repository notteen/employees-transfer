/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Employee;
import entity.Location;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultity.EncryptMD5;

/**
 *
 * @author Sun of Vn
 */
public class EmployeeBO {
    public boolean addEmployee(Employee e){
        DataAccess da=new DataAccess();
        e.setPassword(EncryptMD5.MD5Convert(e.getPassword()));
        boolean stt=da.insertEmployee(e);
        return stt;
    }
    public boolean changePassword(int uid,String newPassword){
        DataAccess da=new DataAccess();
        newPassword=(EncryptMD5.MD5Convert(newPassword));
        boolean stt=da.updateUser(uid,newPassword);
        return stt;
    }
    public boolean updateEmployee(Employee e){
        DataAccess da=new DataAccess();
        boolean stt=da.updateEmployee(e);
        return stt;
    }
    public boolean deleteEmployees(Employee[] e){
        DataAccess da=new DataAccess();
         boolean stt=da.deleteEmployee(e);
        return stt;
    }
    public Employee getEmployeebyID(int empID){
        DataAccess da=new DataAccess();
         ResultSet rs=da.getEmployeeByID(empID);
         Employee emp = null;
        try {
            while(rs.next()){
                emp=new Employee();
              emp.setEmployeeNumber(rs.getInt(1));
              emp.setEmployeeName(rs.getString(2));
              emp.setUserID(rs.getInt(3));
              emp.setEmrole(rs.getString(4));
              emp.setWorkExperience(rs.getString(5));
              emp.setCurrentProjectID(rs.getInt(6));
              emp.setCurrentLocationID(rs.getInt(7));
              emp.setCurrentDepartmentID(rs.getInt(8));
              emp.setEmployeeFirstName(rs.getString(9));
              emp.setDateOfBirth(rs.getString(10));
              emp.setSex(rs.getBoolean(11));
              emp.setAddress(rs.getString(12));
              emp.setPhoneNumber(rs.getString(13));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
    
                public Vector<Employee> getEmployees(){
            Vector<Employee> listEmployees=new Vector<Employee>();
        try {
            DataAccess da=new DataAccess();
            ResultSet rs=da.getEmployees();
            while(rs.next())
            {
                Employee prj=new Employee();
                prj.setEmployeeNumber(rs.getInt(1));
                prj.setEmployeeName(rs.getString(2));
                listEmployees.add(prj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEmployees;
    }
}
