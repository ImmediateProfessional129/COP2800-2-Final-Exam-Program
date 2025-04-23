class Staff extends Employee { // Staff class extends Employee class
    private String title;
    // This is the instance variable of the Staff class. It is private so that it can only be accessed by the methods of the Staff class.
    public Staff(String name, String address, String phone, String email, 

     String office, double salary, MyDate dateHired, String title) { 

    super(name, address, phone, email, office, salary, dateHired); 

    this.title = title; 
    } // These are the parameters for the Staff constructor and they are assigned to the instance variables of the Staff class using the this keyword to refer to the instance variables of the Staff class.

    @Override 
    public String toString() { 
        return "Class: Staff | Name: " + name + " | Title: " + title; 
    } 
} // End of Staff class
