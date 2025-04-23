class Person { // This is the Person class. It is the superclass for the Student, Employee, Faculty, and Staff classes.

    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    // These are the instance variables of the Person class. They are protected so that they can be accessed by subclasses of the Person class.
    public Person(String name, String address, String phone, String email) { 

    this.name = name; 
    this.address = address; 
    this.phone = phone; 
    this.email = email; 
    } // This is the constructor for the Person class. It takes four parameters: name, address, phone, and email. It initializes the instance variables of the Person class to the values of the parameters.

    @Override 
    public String toString() { 
    return "Class: Person | Name: " + name;
    }
} // End of Person class
