/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import java.util.ArrayList;
import java.util.Scanner;

import info5100.university.example.Campus.*;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Address;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // campus module
        // Create first campus
        Campus campus1 = new Campus("Main Campus");
        Building building1 = new Building("Building 1");
        Floor floor1 = new Floor(1);
        Classroom classroom1 = new Classroom("Classroom 1", 12);
        building1.addFloor(floor1);
        building1.addClassroom(classroom1);
        campus1.addBuilding(building1);

        // Create second campus
        Campus campus2 = new Campus("North Campus");
        Building building2 = new Building("Building 2");
        Floor floor2 = new Floor(2);
        Classroom classroom2 = new Classroom("Classroom 2", 8);
        building2.addFloor(floor2);
        building2.addClassroom(classroom2);
        campus2.addBuilding(building2);
        // print campus info
        System.out.println("Campus 1:");
        System.out.println(campus1.toString());
        System.out.println("Campus 2:");
        System.out.println(campus2.toString());
        // get buildings
        System.out.println("Campus 1 buildings:");
        for (Building b : campus1.getBuildings()) {
            System.out.println(b.toString());
            // get classrooms in each building
            for (Classroom c : b.getClassrooms()) {
                System.out.println(c.toString());
                // get capacity of each classroom
                for (int i = 0; i < c.getCapacity(); i++) {
                    System.out.println("Seat " + i + " is available");
                }
            }
        }
        System.out.println("Campus 2 buildings:");
        for (Building b : campus2.getBuildings()) {
            System.out.println(b.toString());
            // get classrooms in each building
            for (Classroom c : b.getClassrooms()) {
                System.out.println(c.toString());
            }
        }

        // add new person
        PersonDirectory pd = new PersonDirectory();
        Address address = new Address("123 Main St", "Apt 2");
        Person person = pd.newPerson("0112303", address);
        // 2nd person
        Address address2 = new Address("456 Main St", "Apt 3");
        Person person2 = pd.newPerson("0112304", address2);

        // create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");
        // create course catalog
        CourseCatalog coursecatalog1 = new CourseCatalog(department2);
        Course course1 = coursecatalog1.newCourse("INFO 5100", "Object Oriented Design and Programming", 4);
        Course course2 = coursecatalog1.newCourse("INFO 6100", "Advanced Object Oriented Design and Programming", 4);
        Course course3 = coursecatalog1.newCourse("INFO 6200", "Data Structures and Algorithms", 4);
        Course course4 = coursecatalog1.newCourse("INFO 6300", "Enterprise Application Development", 4);
        Course course5 = coursecatalog1.newCourse("INFO 6400", "Database Management Systems", 4);

        // create course schedule
        CourseSchedule courseschedule1 = new CourseSchedule("monday", coursecatalog1);
        CourseOffer courseoffer1 = courseschedule1.newCourseOffer("Fall 2017");
        CourseOffer courseoffer2 = courseschedule1.newCourseOffer("Fall 2017");
        CourseOffer courseoffer3 = courseschedule1.newCourseOffer("Fall 2017");

        // create CourseOffer
        CourseOffer courseoffer4 = courseschedule1.newCourseOffer("Spring 2018");
        CourseOffer courseoffer5 = courseschedule1.newCourseOffer("Spring 2018");

        // menu
        System.out.println("========================================");
        System.out.println("Welcome to the University of New York!");
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Professor Service Menu");
            System.out.println("1. Sign up as a professor");
            System.out.println("2. Manage course catalog");
            System.out.println("3. Browse available courses");
            System.out.println("4. Register for courses");
            System.out.println("5. Declare graduation");
            System.out.println("6. View dashboard");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Sign up as a professor
                    System.out.print("Enter your first name: ");
                    String firstName = input.next();
                    System.out.print("Enter your last name: ");
                    String lastName = input.next();
                    System.out.print("Enter your address line 1: ");
                    String street1 = input.next();
                    System.out.print("Enter your address line 2: ");
                    String street2 = input.next();
                    String name = firstName + " " + lastName;
                    Address address3 = new Address(street1, street2);

                    Person professor = pd.newPerson(name, address3);

                    System.out.println("Thank you for signing up as a professor!");
                    break;
                            case 2:
                // Manage course catalog
                System.out.println("Course Catalog Management Menu");
                System.out.println("1. Create a new course");
                System.out.println("2. Edit an existing course");
                System.out.println("3. Delete a course");
                System.out.println("0. Back");
                System.out.print("Enter your choice: ");

                int catalogChoice = input.nextInt();

                switch (catalogChoice) {
                    case 1:
                        // Create a new course
                        System.out.print("Enter the department name: ");
                        String departmentName = input.next();
                        Department department = new Department(departmentName);

                        System.out.print("Enter the course code: ");
                        String courseCode = input.next();

                        System.out.print("Enter the course name: ");
                        String courseName = input.next();

                        System.out.print("Enter the number of credits: ");
                        int credits = input.nextInt();

                        Course newCourse = new Course(courseCode, courseName, credits);
                        department.getCourseCatalog().newCourse(courseName, courseCode, credits);
                        System.out.println("New course added: " + newCourse.toString());
                        break;
                    case 2:
                        // Edit an existing course
                        System.out.print("Enter the course code: ");
                        String courseCodeToEdit = input.next();

                        Course courseToEdit = null;
                        for (Department dept : Department.getDepartments()) {
                            courseToEdit = dept.getCourseCatalog().getCourseByNumber(courseCodeToEdit);
                            if (courseToEdit != null) {
                                break;
                            }
                        }

                        if (courseToEdit == null) {
                            System.out.println("Course not found");
                        } else {
                            System.out.println("Enter new course name (or enter 'skip' to skip): ");
                            String newName = input.next();
                            if (!newName.equals("skip")) {
                                courseToEdit.setCourseName(newName);
                            }

                            System.out.println("Enter new number of credits (or enter -1 to skip): ");
                            int newCredits = input.nextInt();
                            if (newCredits != -1) {
                                courseToEdit.setCredits(newCredits);
                            }

                            System.out.println("Course updated: " + courseToEdit.toString());
                        }
                        break;
                    case 3:
                        // Delete a course
                        System.out.print("Enter the course code: ");
                        String courseCodeToDelete = input.next();

                        Course courseToDelete = null;
                        for (Department dept : Department.getDepartments()) {
                            courseToDelete = dept.getCourseCatalog().getCourseByNumber(courseCodeToDelete);
                            if (courseToDelete != null) {
                                break;
                            }
                        }

                        if (courseToDelete == null) {
                            System.out.println("Course not found");
                        } else {
                            for (Department dept : Department.getDepartments()) {
                                dept.getCourseCatalog().removeCourse(courseToDelete);
                            }
                            System.out.println("Course deleted: " + courseToDelete.toString());
                        }
                        break;
                    case 0:
                        // Back
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            case 3:
                // Browse available courses
                System.out.println("Available Courses");
                for (Department dept : Department.getDepartments()) {
                    System.out.println("Department: " + dept.getDepartments());
                    for (Course course : dept.getCourseCatalog().getCourseList()) {
                        System.out.println(course.toString());
                    }
                }
                break;
            case 4:
                // Register for courses
                System.out.print("Enter your student ID: ");
                String studentId = input.next();

                StudentProfile student = StudentDirectory.getInstance().findStudent(studentId);
                if (student == null) {
                    System.out.println("Error: Student with ID " + studentId + " not found.");
                    break;
                }
                            System.out.println("Available courses:");
            CourseCatalog catalog = CourseCatalog.getInstance();
            ArrayList<Course> courses = catalog.getCourseList();

            for (int i = 0; i < courses.size(); i++) {
                Course course = courses.get(i);
                System.out.println((i + 1) + ". " + course.getCOurseNumber() + " " + course.getCOurseNumber());
            }

            System.out.print("Enter the course number you want to register for: ");
            int courseNumber = input.nextInt();

            if (courseNumber < 1 || courseNumber > courses.size()) {
                System.out.println("Error: Invalid course number.");
                break;
            }

            Course selectedCourse = courses.get(courseNumber - 1);
            boolean success = student.registerForCourse(selectedCourse);

            if (success) {
                System.out.println("Successfully registered for " + selectedCourse.getCOurseNumber() + " " + selectedCourse.getCOurseNumber() + ".");
            } else {
                System.out.println("Error: Could not register for " + selectedCourse.getCOurseNumber() + " " + selectedCourse.getCOurseNumber() + ".");
            }

            break;

        case 5:
            // Quit the program
            System.out.println("Exiting program. Goodbye!");
            success = false;
            break;

        default:
            System.out.println("Error: Invalid selection. Please try again.");
            break;
    } // end switch
    System.out.println();

} while (choice != 0);

input.close();

// Department department = new Department("Information Systems");
// CourseCatalog coursecatalog = department.getCourseCatalog();

// Course course = coursecatalog.newCourse("app eng", "info 5100", 4);

// CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

// CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
// if (courseoffer==null)return;
// courseoffer.generatSeats(10);
// PersonDirectory pd = department.getPersonDirectory();
// Person person = pd.newPerson("0112303");
// StudentDirectory sd = department.getStudentDirectory();
// StudentProfile student = sd.newStudentProfile(person);
// CourseLoad courseload = student.newCourseLoad("Fall2020");
// courseload.newSeatAssignment(courseoffer); //register student in class

// int total = department.calculateRevenuesBySemester("Fall2020");
// System.out.print("Total: " + total);
// System.out.print("Total: " + coursecatalog);

}

}
// }
