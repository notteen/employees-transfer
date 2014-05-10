/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Request {
    private int requestID;
    private int employeeID;
    private int projectID;
    private int locationID;
    private int departmentID;
    private boolean status;
    private String content;

    public Request(int requestID, int employeeID, int projectID, int locationID, int departmentID, boolean status, String content) {
        this.requestID = requestID;
        this.employeeID = employeeID;
        this.projectID = projectID;
        this.locationID = locationID;
        this.departmentID = departmentID;
        this.status = status;
        this.content = content;
    }

    public Request(int employeeID, int projectID, int locationID, int departmentID, boolean status, String content) {
        this.employeeID = employeeID;
        this.projectID = projectID;
        this.locationID = locationID;
        this.departmentID = departmentID;
        this.status = status;
        this.content = content;
    }

    public Request() {
    }
    
    
    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

   
}
