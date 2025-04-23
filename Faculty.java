class Faculty extends Employee { 
    private String officeHours; 
    private String rank;
    // These are the instance variables of the Faculty class. They are private so that they can only be accessed by the methods of the Faculty class.

    public Faculty(String name, String address, String phone, String email, // Constructor for Faculty class

    String office, double salary, MyDate dateHired, 
    String officeHours, String rank) { 
    super(name, address, phone, email, office, salary, dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
    } // These are the parameters for the Faculty constructor and they are assigned to the instance variables of the Faculty class using the this keyword to refer to the instance variables of the Faculty class.
    
    @Override // Override the toString method of the Employee class
    public String toString() { 
    return "Class: Faculty | Name: " + name + " | Rank: " + rank + " | Office Hours: " + officeHours; // Return the string representation of the Faculty object.
    } 
} // End of Faculty class
