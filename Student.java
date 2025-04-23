class Student extends Person { // Student class extends Person class
    public static final String FRESHMAN = "Freshman"; 
    public static final String SOPHOMORE = "Sophomore"; 
    public static final String JUNIOR = "Junior"; 
    public static final String SENIOR = "Senior"; 
// These are the constants for the status of the student. They are public so that they can be accessed by other classes.
    private String status; 
    // This is the instance variable of the Student class. It is private so that it can only be accessed by the methods of the Student class.
    public Student(String name, String address, String phone, String email, String status) { 
        super(name, address, phone, email); 
    this.status = status; // This is the constructor for the Student class. It takes five parameters: name, address, phone, email, and status. It initializes the instance variables of the Student class to the values of the parameters.

    } 

    @Override
    public String toString() { 
    return "Class: Student | Name: " + name + " | Status: " + status; 
    }
} // End of Student class