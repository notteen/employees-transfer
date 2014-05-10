/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Project {
    private int ProjectID;
    private String ProjectName;
    private String Description;

    public Project(String ProjectName, String Description) {
        this.ProjectName = ProjectName;
        this.Description = Description;
    }

    public Project(int ProjectID, String ProjectName, String Description) {
        this.ProjectID = ProjectID;
        this.ProjectName = ProjectName;
        this.Description = Description;
    }

    public Project() {
    }

    public int getProjectID() {
        return ProjectID;
    }

    public void setProjectID(int ProjectID) {
        this.ProjectID = ProjectID;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return ProjectName; //To change body of generated methods, choose Tools | Templates.
    }
    
}
