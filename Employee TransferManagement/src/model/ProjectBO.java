/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sun of Vn
 */
public class ProjectBO {
    public Vector<Project> getProjects(){
            Vector<Project> listProjects=new Vector<Project>();
        try {
            DataAccess da=new DataAccess();
            ResultSet rs=da.getProjects();
            while(rs.next())
            {
                Project prj=new Project(rs.getInt("ProjectID"),rs.getString("ProjectName"),rs.getString("Description"));
                listProjects.add(prj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProjects;
    }
    public boolean insertProject(Project prj){
        DataAccess da=new DataAccess();
        return da.insertProject(prj);
    }
     public boolean deleteProject(int[] id){
        DataAccess da=new DataAccess();
        return da.deleteProjects(id);
    }
    public boolean updateProject(Project prj){
        DataAccess da=new DataAccess();
        return da.updateProject(prj);
    }
    
    
    public Project getProject(int id){
            DataAccess da=new DataAccess();
         ResultSet rs=da.getProjects(id);
         Project emp = null;
        try {
            while(rs.next()){
                emp=new Project();
                emp.setProjectID(rs.getInt(1));
              emp.setProjectName(rs.getString(2));
              emp.setDescription(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
}
