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

// Campus.java
public class Campus {
    private String name;
    private ArrayList<Building> buildings;

    public Campus(String name) {
        this.name = name;
        this.buildings = new ArrayList<Building>();
    }

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public ArrayList<Building> getBuildings() {
        return this.buildings;
    }
    @Override
    public String toString() {
        return this.name;
    }
}