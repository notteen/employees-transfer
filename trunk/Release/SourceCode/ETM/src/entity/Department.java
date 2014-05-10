/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Department {
    private int DepartmentID;
    private String DepartmentName;
    private String Description;

    public Department() {
    }

    public Department(String DepartmentName, String Description) {
        this.DepartmentName = DepartmentName;
        this.Description = Description;
    }

    public Department(int DepartmentID, String DepartmentName, String Description) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
        this.Description = Description;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return DepartmentName;
    }
    
}
