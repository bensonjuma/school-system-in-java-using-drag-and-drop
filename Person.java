/*
   * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    Address address;
    
    public Person(String id, Address address) {
        this.id = id;
        this.address = address;
    }
    public String getPersonId(){
        return id;
    }
    public Address getAddress() {
        return address;
    }

    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    @Override
    public String toString() {
        return "Person[id=" + id + ", address=" + address.line1 + " " + address.line2 + "]";
    }
}
