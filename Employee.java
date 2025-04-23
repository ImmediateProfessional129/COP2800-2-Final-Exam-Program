class Employee extends Person {
    protected String office; 
    protected double salary; 
    protected MyDate dateHired;
    // These are the instance variables of the Employee class. They are protected so that they can be accessed by subclasses of the Employee class.
    
    public Employee(String name, String address, String phone, String email, // Constructor for Employee class

    String office, double salary, MyDate dateHired) { // Parameters for Employee constructor
    super(name, address, phone, email); // Call to superclass constructor
    this.office = office; 
    this.salary = salary; 
    this.dateHired = dateHired;
    } // These are the parameters for the Employee constructor and they are assigned to the instance variables of the Employee class using the this keyword to refer to the instance variables of the Employee class.
    
    @Override // This is the toString method for the Employee class. It is overridden from the superclass Person.
    public String toString() { 
    return "Class: Employee | Name: " + name + " | Hired: " + dateHired.toString(); 
    }
} // End of Employee class
