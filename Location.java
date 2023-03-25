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

// Location.java
public class Location {
    private String name;
    
    public Location(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
