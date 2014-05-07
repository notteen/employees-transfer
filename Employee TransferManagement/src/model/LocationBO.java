/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Location;
import entity.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sun of Vn
 */
public class LocationBO {
            public Vector<Location> getLocations(){
            Vector<Location> listLocations=new Vector<Location>();
        try {
            DataAccess da=new DataAccess();
            ResultSet rs=da.getLocations();
            while(rs.next())
            {
                Location prj=new Location(rs.getInt("LocationID"),rs.getString("LocationName"),rs.getString("Description"));
                listLocations.add(prj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLocations;
    }
            
             public boolean insertLocation(Location loc){
            DataAccess da=new DataAccess();
             return da.insertLocation(loc);
    }
            public boolean deleteLocation(int[] loc){
            DataAccess da=new DataAccess();
             return da.deleteLocations(loc);
    }
                          public boolean updateLocation(Location loc){
            DataAccess da=new DataAccess();
             return da.updateLocation(loc);
    }
             public Location getLocation(int id){
            DataAccess da=new DataAccess();
         ResultSet rs=da.getLocations(id);
         Location emp = null;
        try {
            while(rs.next()){
                emp=new Location();
                emp.setLocationID(rs.getInt(1));
              emp.setLocationName(rs.getString(2));
              emp.setLocationDescription(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
}
