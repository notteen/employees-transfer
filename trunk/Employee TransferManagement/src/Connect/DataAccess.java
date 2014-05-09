/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sun of Vn
 */
public class DataAccess {

    public int Add(entity.Employee em) {
        try {
            String query = "INSERT INTO Users VALUES('"
                    + em.getAccount() + "','" + em.getPassword() + "'," + em.getRole() + ")";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            st.close();
            conn.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public boolean insertProject(entity.Project em) {
        try {
            String query = "INSERT INTO Projects VALUES('"
                    + em.getProjectName() + "','" + em.getDescription() + "')";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertRequest(entity.Request em) {
        try {
            String query = "INSERT INTO Requests VALUES("
                    + em.getEmployeeID() + "," + em.getProjectID() + "," + em.getLocationID() + "," + em.getDepartmentID() + ",'" + em.getStatus() + "','" + em.getContent() + "')";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertTransfer(entity.Transfer em) {
        try {
            String query = "INSERT INTO Transfers VALUES("
                    + em.getEmployeeNumber() + "," + em.getTransferToProjectID() + ","
                    + em.getTransferToLocationID() + "," + em.getTransferToDepartmentID() + ","
                    + em.getTransferFromProjectID() + "," + em.getTransferFromLocationID() + ","
                    + em.getTransferFromDepartmentID() + ",'" + em.getTransferJoiningDate() + "','"
                    + em.isStatus() + "','" + em.getTransferRelievingDate()
                    + "')";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertLocation(entity.Location em) {
        try {
            String query = "INSERT INTO Locations VALUES('"
                    + em.getLocationName() + "','" + em.getLocationDescription() + "')";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteLocation(entity.Location em) {
        try {
            String query = "DELETE FROM Locations WHERE LocationID="
                    + em.getLocationID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteTransfer(int[] em) {
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            for (int i = 0; i < em.length; i++) {
                String query = "DELETE FROM Transfers WHERE TransferID="
                        + em[i];

                int stt = st.executeUpdate(query);
            }
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteLocations(int[] em) {
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            for (int i = 0; i < em.length; i++) {
                String query = "DELETE FROM Locations WHERE LocationID="
                        + em[i];

                int stt = st.executeUpdate(query);
            }
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteProject(entity.Project em) {
        try {
            String query = "DELETE FROM Projects WHERE ProjectID="
                    + em.getProjectID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteProjects(int[] em) {
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            for (int i = 0; i < em.length; i++) {
                String query = "DELETE FROM Projects WHERE ProjectID="
                        + em[i];
                int stt = st.executeUpdate(query);
            }
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteDepartment(int[] em) {
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            for (int i = 0; i < em.length; i++) {
                String query = "DELETE FROM Departments WHERE DepartmentID="
                        + em[i];
                int stt = st.executeUpdate(query);
            }
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteDepartments(int[] em) {
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            for (int i = 0; i < em.length; i++) {
                String query = "DELETE FROM Departments WHERE DepartmentID="
                        + em[i];
                int stt = st.executeUpdate(query);
            }
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertDepartment(entity.Department em) {
        try {
            String query = "INSERT INTO Departments VALUES('"
                    + em.getDepartmentName() + "','" + em.getDescription() + "')";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateEmployee(entity.Employee em) {
        try {
            String query = "UPDATE Employees SET EmployeeName='" + em.getEmployeeName() + "',Role='" + em.getEmrole() + "',WorkExperience='" + em.getWorkExperience() + "',CurrentProjectID=" + em.getCurrentProjectID() + ",CurrentLocationID=" + em.getCurrentLocationID() + ",CurrentDepartmentID=" + em.getCurrentDepartmentID() + ",EmployeeFirstName='" + em.getEmployeeFirstName() + "',DateOfBirth='" + em.getDateOfBirth() + "',Sex='" + em.getSex() + "',Address='" + em.getAddress() + "',PhoneNum='" + em.getPhoneNumber() + "' WHERE EmployeeNumber=" + em.getEmployeeNumber();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateProject(entity.Project em) {
        try {
            String query = "UPDATE Projects SET ProjectName='" + em.getProjectName() + "',Description='" + em.getDescription() + "' WHERE ProjectID=" + em.getProjectID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateUser(int emID, String newPassword) {
        try {
            String query = "UPDATE Users SET password='" + newPassword + "' WHERE ID=(SELECT userid from Employees WHERE EmployeeNumber=" + emID + ")";
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateRequest(entity.Request em) {
        try {
            String query = "UPDATE Requests SET status='" + em.getStatus() + "' WHERE RequestID=" + em.getRequestID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateTransfer(entity.Transfer em) {
        try {
            String query = "UPDATE Transfers SET EmployeeNumber=" + em.getEmployeeNumber() + ",TransferToProjectID=" + em.getTransferToProjectID()
                    + ",TransferToLocationID=" + em.getTransferToLocationID()
                    + ",TransferToDepartmentID=" + em.getTransferToDepartmentID()
                    + ",TransferFromProjectID=" + em.getTransferFromProjectID()
                    + ",TransferFromLocationID=" + em.getTransferFromLocationID()
                    + ",TransferFromDepartmentID=" + em.getTransferFromDepartmentID()
                    + ",TransferJoiningDate='" + em.getTransferJoiningDate()
                    + "',Status='" + em.isStatus()
                    + "',TransferRelievingDate='" + em.getTransferRelievingDate() + "' WHERE TransferID=" + em.getTransferID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateDepartment(entity.Department em) {
        try {
            String query = "UPDATE Departments SET DepartmentName='" + em.getDepartmentName() + "',Description='" + em.getDescription() + "' WHERE DepartmentID=" + em.getDepartmentID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateLocation(entity.Location em) {
        try {
            String query = "UPDATE Locations SET LocationName='" + em.getLocationName() + "',Description='" + em.getLocationDescription() + "' WHERE LocationID=" + em.getLocationID();
            Connection conn = ConnectSQL.getConnection();
            Statement st = conn.createStatement();
            int stt = st.executeUpdate(query);
            st.close();
            conn.close();
            if (stt == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteEmployee(Employee[] emIDs) {
        Connection conn = ConnectSQL.getConnection();
        try {
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();
            String query;
            for (int i = 0; i < emIDs.length; i++) {
                //delete employee
                query = "DELETE FROM Employees WHERE EmployeeNumber="
                        + emIDs[i].getEmployeeNumber();
                st.executeUpdate(query);

                //delete user
                query = "DELETE FROM Users WHERE ID="
                        + emIDs[i].getUserID();
                int affectedRows = st.executeUpdate(query);
            }
            st.close();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean insertEmployee(entity.Employee em) {
        Connection conn = ConnectSQL.getConnection();
        try {
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();
            String query;
            query = "INSERT INTO Users VALUES('"
                    + em.getAccount() + "','" + em.getPassword() + "'," + em.getRole() + ")";
            int affectedRows = st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = null;
            generatedKeys = st.getGeneratedKeys();
            if (generatedKeys.next()) {
                em.setUserID((int) generatedKeys.getLong(1));
            }

            query = "INSERT INTO Employees VALUES('"
                    + em.getEmployeeName() + "','" + em.getUserID() + "','" + em.getEmrole() + "','" + em.getWorkExperience() + "'," + em.getCurrentProjectID() + "," + em.getCurrentLocationID() + "," + em.getCurrentDepartmentID() + ",'" + em.getEmployeeFirstName() + "','" + em.getDateOfBirth() + "','" + em.getSex() + "','" + em.getAddress() + "','" + em.getPhoneNumber() + "')";
            st.executeUpdate(query);
            st.close();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public ResultSet getEmployee(int limit) {
        try {
            String query = null;
            if (limit == 0) {
                query = "SELECT EmployeeNumber,EmployeeName,EmployeeFirstName,UserID,DateOfBirth,Sex,Address,PhoneNum,[Role],WorkExperience,Projects.ProjectName CurrentProjectName,Locations.LocationName CurrentLocationName,Departments.DepartmentName CurrentDepartmentName \n"
                        + "FROM Employees LEFT OUTER JOIN Projects ON Employees.CurrentProjectID=Projects.ProjectID\n"
                        + "LEFT OUTER JOIN Departments ON Employees.CurrentDepartmentID=Departments.DepartmentID\n"
                        + "LEFT OUTER JOIN Locations ON Employees.CurrentLocationID=Locations.LocationID\n"
                        + "order by EmployeeNumber DESC";
            } else {
                query = "SELECT TOP " + limit + " EmployeeNumber,EmployeeName,EmployeeFirstName,UserID,DateOfBirth,Sex,Address,PhoneNum,[Role],WorkExperience,Projects.ProjectName CurrentProjectName,Locations.LocationName CurrentLocationName,Departments.DepartmentName CurrentDepartmentName \n"
                        + "FROM Employees LEFT OUTER JOIN Projects ON Employees.CurrentProjectID=Projects.ProjectID\n"
                        + "LEFT OUTER JOIN Departments ON Employees.CurrentDepartmentID=Departments.DepartmentID\n"
                        + "LEFT OUTER JOIN Locations ON Employees.CurrentLocationID=Locations.LocationID\n"
                        + "order by EmployeeNumber DESC";
            }
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getProjects(int id) {
        try {
            String query = null;
            query = "SELECT*FROM Projects WHERE ProjectID=" + id
                    + " order by ProjectID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getTransfer(int id) {
        try {
            String query = null;
            query = "SELECT*FROM Transfers WHERE TransferID=" + id;
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getTransfers() {
        try {
            String query = null;
            query = "SELECT t1.TransferID,t1.EmployeeName,t1.TransferFromProjectName,t1.TransferFromDepartmentName,t1.TransferFromLocationName,t2.TransferToProjectName,t2.TransferFromDepartmentName,t2.TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] FROM\n"
                    + "(SELECT TransferID,EmployeeName,ProjectName TransferFromProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                    + "                         LEFT OUTER JOIN PROJECTs ON TransferFromProjectID=ProjectID\n"
                    + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                    + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID                         \n"
                    + ")t1\n"
                    + "INNER JOIN\n"
                    + "(SELECT TransferID,EmployeeName,ProjectName TransferToProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] =CASE [Status] WHEN 1 THEN 'Approve'\n"
                    + "WHEN 0 THEN 'Pendding' END FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                    + "                         LEFT OUTER JOIN PROJECTs ON TransferToProjectID=ProjectID\n"
                    + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                    + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID\n"
                    + "                         )t2     ON t1.TransferID=t2.TransferID"
                    + " order by TransferID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getTransfers(String from, String to) {
        try {
            String query = null;
            query = "SELECT t1.TransferID,t1.EmployeeName,t1.TransferFromProjectName,t1.TransferFromDepartmentName,t1.TransferFromLocationName,t2.TransferToProjectName,t2.TransferFromDepartmentName,t2.TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] FROM\n"
                    + "(SELECT TransferID,EmployeeName,ProjectName TransferFromProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                    + "                         LEFT OUTER JOIN PROJECTs ON TransferFromProjectID=ProjectID\n"
                    + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                    + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID                         \n"
                    + ")t1\n"
                    + "INNER JOIN\n"
                    + "(SELECT TransferID,EmployeeName,ProjectName TransferToProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] =CASE [Status] WHEN 1 THEN 'Approve'\n"
                    + "WHEN 0 THEN 'Pendding' END FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                    + "                         LEFT OUTER JOIN PROJECTs ON TransferToProjectID=ProjectID\n"
                    + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                    + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID\n"
                    + "                         )t2     ON t1.TransferID=t2.TransferID"
                    + " WHERE TransferRelievingDate>='" + from + "' AND TransferRelievingDate<='" + to + "' order by TransferID DESC ";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getDepartments(int id) {
        try {
            String query = null;
            query = "SELECT*FROM Departments WHERE DepartmentID=" + id
                    + " order by DepartmentID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getLocations(int id) {
        try {
            String query = null;
            query = "SELECT*FROM Locations WHERE LocationID=" + id
                    + " order by LocationID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getEmployeeByID(int emid) {
        try {
            String query = null;
            query = "SELECT * \n"
                    + "FROM Employees \n"
                    + "WHERE EmployeeNumber=" + emid;
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet search(String type, String value) {
        try {
            String nameSearch = "t1.EmployeeName";
            String locationSearch = "t1.TransferFromLocationName";
            String projectSearch = "t1.TransferFromProjectName";
            String departmentSearch = "t1.TransferFromDepartmentName";
            String query = null;
            if (type.equals("")) {
                query = "SELECT t1.TransferID,t1.EmployeeName,t1.TransferFromProjectName,t1.TransferFromDepartmentName,t1.TransferFromLocationName,t2.TransferToProjectName,t2.TransferToDepartmentName,t2.TransferToLocationName,TransferRelievingDate,TransferJoiningDate,[Status] FROM\n"
                        + "(SELECT TransferID,EmployeeName,ProjectName TransferFromProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                        + "                         LEFT OUTER JOIN PROJECTs ON TransferFromProjectID=ProjectID\n"
                        + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                        + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID                         \n"
                        + ")t1\n"
                        + "INNER JOIN\n"
                        + "(SELECT TransferID,EmployeeName,ProjectName TransferToProjectName,DepartmentName TransferToDepartmentName,LocationName TransferToLocationName,TransferRelievingDate,TransferJoiningDate,[Status] =CASE [Status] WHEN 1 THEN 'Approve'\n"
                        + "WHEN 0 THEN 'Pendding' END FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                        + "                         LEFT OUTER JOIN PROJECTs ON TransferToProjectID=ProjectID\n"
                        + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                        + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID\n"
                        + "                         )t2     ON t1.TransferID=t2.TransferID"
                        + " WHERE " + nameSearch + " like'%" + value + "%'" + " OR " + locationSearch + " like'%" + value + "%'" + " OR " + projectSearch + " like'%" + value + "%'" + " OR " + departmentSearch + " like'%" + value + "%'"
                        + " order by TransferID DESC";

            } else {
                query = "SELECT t1.TransferID,t1.EmployeeName,t1.TransferFromProjectName,t1.TransferFromDepartmentName,t1.TransferFromLocationName,t2.TransferToProjectName,t2.TransferFromDepartmentName,t2.TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] FROM\n"
                        + "(SELECT TransferID,EmployeeName,ProjectName TransferFromProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                        + "                         LEFT OUTER JOIN PROJECTs ON TransferFromProjectID=ProjectID\n"
                        + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                        + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID                         \n"
                        + ")t1\n"
                        + "INNER JOIN\n"
                        + "(SELECT TransferID,EmployeeName,ProjectName TransferToProjectName,DepartmentName TransferFromDepartmentName,LocationName TransferFromLocationName,TransferRelievingDate,TransferJoiningDate,[Status] =CASE [Status] WHEN 1 THEN 'Approve'\n"
                        + "WHEN 0 THEN 'Pendding' END FROM Transfers LEFT OUTER JOIN Employees ON Transfers.EmployeeNumber=Employees.EmployeeNumber\n"
                        + "                         LEFT OUTER JOIN PROJECTs ON TransferToProjectID=ProjectID\n"
                        + "                         LEFT OUTER JOIN Locations on TransferFromLocationID=LocationID \n"
                        + "                         LEFT OUTER JOIN Departments on TransferFromDepartmentID=DepartmentID\n"
                        + "                         )t2     ON t1.TransferID=t2.TransferID"
                        + " WHERE " + type + " like'%" + value + "%'"
                        + " order by TransferID DESC";
            }
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getProjects() {
        try {
            String query = null;
            query = "SELECT * FROM Projects order by ProjectID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getRequest() {
        try {
            String query = null;
            query = "SELECT RequestID,EmployeeName,ProjectName,LocationName,DepartmentName,Content,[Status] =CASE [status] WHEN 1 THEN 'Approved' WHEN 0 THEN'Pendding' END FROM Requests LEFT OUTER JOIN Employees ON EmployeeID=EmployeeNumber\n"
                    + "LEFT OUTER JOIN Projects ON Requests.ProjectID=Projects.ProjectID\n"
                    + "LEFT OUTER JOIN Departments ON Requests.DepartmentID=Departments.DepartmentID\n"
                    + "LEFT OUTER JOIN Locations ON Requests.LocationID=Locations.LocationID\n";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getRequest(int ID) {
        try {
            String query = null;
            query = "SELECT RequestID,EmployeeName,ProjectName,LocationName,DepartmentName,Content,[Status] =CASE [status] WHEN 1 THEN 'Approved' WHEN 0 THEN'Pendding' END FROM Requests LEFT OUTER JOIN Employees ON EmployeeID=EmployeeNumber\n"
                    + "LEFT OUTER JOIN Projects ON Requests.ProjectID=Projects.ProjectID\n"
                    + "LEFT OUTER JOIN Departments ON Requests.DepartmentID=Departments.DepartmentID\n"
                    + "LEFT OUTER JOIN Locations ON Requests.LocationID=Locations.LocationID\n"
                    + "WHERE EmployeeID=" + ID;
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    public ResultSet getLocations() {
        try {
            String query = null;
            query = "SELECT * FROM Locations order by LocationID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getEmployees() {
        try {
            String query = null;
            query = "SELECT * FROM Employees order by EmployeeNumber DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getDepartments() {
        try {
            String query = null;
            query = "SELECT * FROM Departments order by DepartmentID DESC";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkExistAccount(String uname) {
        try {
            String query = null;
            query = "SELECT * FROM Users WHERE Uname='" + uname + "'";
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int[] getRole(String account, String password) {
        int[] returnValue = new int[2];
        try {
            String query = null;
            query = "SELECT Users.Role,EmployeeNumber FROM Users LEFT OUTER JOIN Employees ON Users.ID=Employees.UserID WHERE uname='" + account + "' AND password='" + password + "'";

            Connection conn = ConnectSQL.getConnection();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                returnValue[0] = res.getInt("role");
                returnValue[1] = res.getInt("EmployeeNumber");
                return returnValue;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        returnValue[0] = -1;
        returnValue[1] = -1;
        return returnValue;
    }
}
