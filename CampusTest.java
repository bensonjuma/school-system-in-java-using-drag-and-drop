package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import info5100.university.example.Campus.*;

public class CampusTest {
    
    private Campus campus;
    private Building building1;
    private Building building2;
    private Classroom classroom1;
    private Classroom classroom2;
    
    @Before
    public void setUp() {
        // create a new campus and some buildings and classrooms
        campus = new Campus("Test Campus");
        building1 = new Building("Building 1");
        building2 = new Building("Building 2");
        classroom1 = new Classroom("Classroom 1", 30);
        classroom2 = new Classroom("Classroom 2", 20);
    }
    
    @Test
    public void testAddBuilding() {
        // add building1 to campus
        campus.addBuilding(building1);
        // assert that the campus contains building1
        assertTrue(campus.getBuildings().contains(building1));
    }
    
    @Test
    public void testAddClassroom() {
        // add classroom1 to building1
        building1.addClassroom(classroom1, 10);
        // assert that building1 contains classroom1
        //assertTrue(building1.getClass().contains(classroom1, 1));
    }
    
    @Test
    public void testGetCapacity() {
        // add classroom1 and classroom2 to building1
        building1.addClassroom(classroom1, 1);
        building1.addClassroom(classroom2, 2);
        // assert that the capacity of building1 is the sum of classroom capacities
        assertEquals(50, building1.getCapacity());
    }
    
    @Test
    public void testGetAvailableClassrooms() {
        // add classroom1 and classroom2 to building1
        building1.addClassroom(classroom1, 3);
        building1.addClassroom(classroom2, 4);
        
    }
    
    @Test
    public void testGetAllClassrooms() {
        // add classroom1 and classroom2 to building1 and building2
        building1.addClassroom(classroom1, 5);
        building2.addClassroom(classroom2, 6);
        // assert that getAllClassrooms() returns a list of all classrooms on campus
        List<Classroom> allClassrooms = campus.getAllClassrooms();
        assertTrue(allClassrooms.contains(classroom1));
        assertTrue(allClassrooms.contains(classroom2));
    }
}

