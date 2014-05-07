/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Transfer {
    private int TransferID;
    private int EmployeeNumber;
    private int TransferToProjectID;
    private int TransferToLocationID;
    private int TransferToDepartmentID;
    private int TransferFromProjectID;
    private int TransferFromLocationID;
    private int TransferFromDepartmentID;
    private String  TransferJoiningDate;
    private boolean Status;
    private String TransferRelievingDate;

    public int getTransferID() {
        return TransferID;
    }

    public Transfer() {
        this.TransferID = -1;
        this.EmployeeNumber = -1;
        this.TransferToProjectID = -1;
        this.TransferToLocationID = -1;
        this.TransferToDepartmentID = -1;
        this.TransferFromProjectID = -1;
        this.TransferFromLocationID = -1;
        this.TransferFromDepartmentID = -1;
        this.TransferJoiningDate = "";
        this.Status = false;
        this.TransferRelievingDate = "";
    }

    public Transfer(int TransferID, int EmployeeNumber, int TransferToProjectID, int TransferToLocationID, int TransferToDepartmentID, int TransferFromProjectID, int TransferFromLocationID, int TransferFromDepartmentID, String TransferJoiningDate, boolean Status, String TransferRelievingDate) {
        this.TransferID = TransferID;
        this.EmployeeNumber = EmployeeNumber;
        this.TransferToProjectID = TransferToProjectID;
        this.TransferToLocationID = TransferToLocationID;
        this.TransferToDepartmentID = TransferToDepartmentID;
        this.TransferFromProjectID = TransferFromProjectID;
        this.TransferFromLocationID = TransferFromLocationID;
        this.TransferFromDepartmentID = TransferFromDepartmentID;
        this.TransferJoiningDate = TransferJoiningDate;
        this.Status = Status;
        this.TransferRelievingDate = TransferRelievingDate;
    }

    public Transfer(int EmployeeNumber, int TransferToProjectID, int TransferToLocationID, int TransferToDepartmentID, int TransferFromProjectID, int TransferFromLocationID, int TransferFromDepartmentID, String TransferJoiningDate, boolean Status, String TransferRelievingDate) {
        this.EmployeeNumber = EmployeeNumber;
        this.TransferToProjectID = TransferToProjectID;
        this.TransferToLocationID = TransferToLocationID;
        this.TransferToDepartmentID = TransferToDepartmentID;
        this.TransferFromProjectID = TransferFromProjectID;
        this.TransferFromLocationID = TransferFromLocationID;
        this.TransferFromDepartmentID = TransferFromDepartmentID;
        this.TransferJoiningDate = TransferJoiningDate;
        this.Status = Status;
        this.TransferRelievingDate = TransferRelievingDate;
    }
    
    public void setTransferID(int TransferID) {
        this.TransferID = TransferID;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(int EmployeeNumber) {
        this.EmployeeNumber = EmployeeNumber;
    }

    public int getTransferToProjectID() {
        return TransferToProjectID;
    }

    public void setTransferToProjectID(int TransferToProjectID) {
        this.TransferToProjectID = TransferToProjectID;
    }

    public int getTransferToLocationID() {
        return TransferToLocationID;
    }

    public void setTransferToLocationID(int TransferToLocationID) {
        this.TransferToLocationID = TransferToLocationID;
    }

    public int getTransferToDepartmentID() {
        return TransferToDepartmentID;
    }

    public void setTransferToDepartmentID(int TransferToDepartmentID) {
        this.TransferToDepartmentID = TransferToDepartmentID;
    }

    public int getTransferFromProjectID() {
        return TransferFromProjectID;
    }

    public void setTransferFromProjectID(int TransferFromProjectID) {
        this.TransferFromProjectID = TransferFromProjectID;
    }

    public int getTransferFromLocationID() {
        return TransferFromLocationID;
    }

    public void setTransferFromLocationID(int TransferFromLocationID) {
        this.TransferFromLocationID = TransferFromLocationID;
    }

    public int getTransferFromDepartmentID() {
        return TransferFromDepartmentID;
    }

    public void setTransferFromDepartmentID(int TransferFromDepartmentID) {
        this.TransferFromDepartmentID = TransferFromDepartmentID;
    }

    public String getTransferJoiningDate() {
        return TransferJoiningDate;
    }

    public void setTransferJoiningDate(String TransferJoiningDate) {
        this.TransferJoiningDate = TransferJoiningDate;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getTransferRelievingDate() {
        return TransferRelievingDate;
    }

    public void setTransferRelievingDate(String TransferRelievingDate) {
        this.TransferRelievingDate = TransferRelievingDate;
    }
    
}
