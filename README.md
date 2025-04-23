# COP2800-2-Final-Exam-Program
This repository is a submission link for COP2800-2: Final Exam Program that deals with the test program.

// This program was created by Marcello Gonzalez on 4/23/2025 for the course of COP2800-2 at Palm Beach State College. The purpose of this program is to create a program that uses inheritance to create a hierarchy of classes that represent people, students, employees, faculty, and staff. It will generate an output that displays the information of each object.

import java.util.Calendar;
public class GonzalezMarcelloJavaFinal {
public static void main(String[] args) { // Main method
   
  MyDate hireDate = new MyDate(2023, 1, 14); // Create a MyDate object for the hire date

  Person person = new Person("Jake Danielson", "123 Employee Rd", "641-563-3276", "jake@example.com"); // Create a Person object

  Student student = new Student("Jennifer Thomas", "342 Classmate Ave", "305-465-9085", "jennifer@example.com", Student.SENIOR); // Create a Student object

  Employee employee = new Employee("Danielle Winters", "379 Staff Ln", "412-675-2372", "danielle@example.com", "Room 205", 68000, hireDate); // Create an Employee object

  Faculty faculty = new Faculty("Dr. Ralph Jackson", "343 Faculty Dr", "403-767-0572", "ralph@example.com", "Room 312", 50000, hireDate, "11am-3pm", "Assistant Professor"); // Create a Faculty object

  Staff staff = new Staff("Audrey Bacall", "616 Admin St", "305-842-7769", "audrey@example.com", "Room 421", 52000, hireDate, "Secretary of the Department of Computer Science"); // Create a Staff object

    System.out.println(person); 
    System.out.println(student); 
    System.out.println(employee); 
    System.out.println(faculty);
    System.out.println(staff); 
    } 
  } // End of Main clas
