/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Employee {
    private String account;
    private String password;
    private int role;
    private int employeeNumber;
    private String employeeName;
    private String employeeFirstName;
    private int userID;
    private String emrole;
    private String workExperience;
    private int currentProjectID;
    private int currentLocationID;
    private int currentDepartmentID;
    private String dateOfBirth;
    private boolean sex;
    private String address;
    private String phoneNumber;

    public Employee(int employeeNumber, String employeeName, String employeeFirstName, int userID, String emrole, String workExperience, int currentProjectID, int currentLocationID, int currentDepartmentID, String dateOfBirth, boolean sex, String address, String phoneNumber) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeFirstName = employeeFirstName;
        this.userID = userID;
        this.emrole = emrole;
        this.workExperience = workExperience;
        this.currentProjectID = currentProjectID;
        this.currentLocationID = currentLocationID;
        this.currentDepartmentID = currentDepartmentID;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String account, String password, int role, int employeeNumber, String employeeName, String employeeFirstName, int userID, String emrole, String workExperience, int currentProjectID, int currentLocationID, int currentDepartmentID, String dateOfBirth, boolean sex, String address, String phoneNumber) {
        this.account = account;
        this.password = password;
        this.role = role;
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeFirstName = employeeFirstName;
        this.userID = userID;
        this.emrole = emrole;
        this.workExperience = workExperience;
        this.currentProjectID = currentProjectID;
        this.currentLocationID = currentLocationID;
        this.currentDepartmentID = currentDepartmentID;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmrole() {
        return emrole;
    }

    public void setEmrole(String emrole) {
        this.emrole = emrole;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public int getCurrentProjectID() {
        return currentProjectID;
    }

    public void setCurrentProjectID(int currentProjectID) {
        this.currentProjectID = currentProjectID;
    }

    public int getCurrentLocationID() {
        return currentLocationID;
    }

    public void setCurrentLocationID(int currentLocationID) {
        this.currentLocationID = currentLocationID;
    }

    public int getCurrentDepartmentID() {
        return currentDepartmentID;
    }

    public void setCurrentDepartmentID(int currentDepartmentID) {
        this.currentDepartmentID = currentDepartmentID;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
        this.account = "";
        this.password = "";
        this.employeeName = employeeName;
        this.employeeFirstName = "";
        this.emrole = "";
        this.workExperience = "";
        this.dateOfBirth = "";
        this.sex = true;
        this.address = "";
        this.phoneNumber = "";
    }

    @Override
    public String toString() {
        return employeeName; //To change body of generated methods, choose Tools | Templates.
    }
    
}
