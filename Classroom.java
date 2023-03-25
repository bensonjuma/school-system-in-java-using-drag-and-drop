/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import java.io.Serializable;

/**
 *
 * @author kal bugrara
 */
// Classroom.java
public class Classroom {
    private String name;
    private int capacity;
    
    public Classroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    @Override
    public String toString() {
        return this.name;
    }
}