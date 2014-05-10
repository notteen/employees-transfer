/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sun of Vn
 */
public class DepartmentBO {
        public Vector<Department> getDepartments(){
            Vector<Department> listDepartments=new Vector<Department>();
        try {
            DataAccess da=new DataAccess();
            ResultSet rs=da.getDepartments();
            while(rs.next())
            {
                Department prj=new Department(rs.getInt("DepartmentID"),rs.getString("DepartmentName"),rs.getString("Description"));
                listDepartments.add(prj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDepartments;
    }
        public boolean insertDepartment(Department dep){
            DataAccess da=new DataAccess();
            return da.insertDepartment(dep);
        }
        public boolean deleteDepartment(int[] dep){
            DataAccess da=new DataAccess();
            return da.deleteDepartment(dep);
        }
        public boolean updateDepartment(Department dep){
            DataAccess da=new DataAccess();
            return da.updateDepartment(dep);
        }
           public Department getDepartment(int id){
            DataAccess da=new DataAccess();
         ResultSet rs=da.getDepartments(id);
         Department emp = null;
        try {
            while(rs.next()){
                emp=new Department();
                emp.setDepartmentID(rs.getInt(1));
              emp.setDepartmentName(rs.getString(2));
              emp.setDescription(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
}
