/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sun of Vn
 */
public class Location {
        private int LocationID;
    private String LocationName;
    private String LocationDescription;

    public Location(int LocationID, String LocationName, String LocationDescription) {
        this.LocationID = LocationID;
        this.LocationName = LocationName;
        this.LocationDescription = LocationDescription;
    }

    public Location() {
    }

    public Location(String LocationName, String LocationDescription) {
        this.LocationName = LocationName;
        this.LocationDescription = LocationDescription;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    public String getLocationDescription() {
        return LocationDescription;
    }

    public void setLocationDescription(String LocationDescription) {
        this.LocationDescription = LocationDescription;
    }

    @Override
    public String toString() {
        return LocationName; //To change body of generated methods, choose Tools | Templates.
    }
    
}
