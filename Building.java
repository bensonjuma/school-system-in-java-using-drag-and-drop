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
// Building.java
public class Building {
    private String name;
    private ArrayList<Floor> floors;
    private ArrayList<Classroom> classrooms;

    public Building(String name) {
        this.name = name;
        this.floors = new ArrayList<Floor>();
        this.classrooms = new ArrayList<Classroom>();
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public ArrayList<Floor> getFloors() {
        return this.floors;
    }

    public void addClassroom(Classroom classroom) {
        this.classrooms.add(classroom);
    }

    public ArrayList<Classroom> getClassrooms() {
        return this.classrooms;
    }
    @Override
    public String toString() {
        return this.name;
    }
}