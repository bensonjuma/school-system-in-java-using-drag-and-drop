/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
// Floor.java
public class Floor {
    private int number;
    private ArrayList<Location> locations;
    
    public Floor(int number) {
        this.number = number;
        this.locations = new ArrayList<Location>();
    }
    
    public void addLocation(Location location) {
        this.locations.add(location);
    }
    
    public ArrayList<Location> getLocations() {
        return this.locations;
    }
}
