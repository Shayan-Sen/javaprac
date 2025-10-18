package accenture.C6.C6_3.workingwithobjects;

class Person {
    private String firstName;
    private String lastName;

    Person() {
        this.firstName = "";
        this.lastName = "";
    }
    
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n";
    }
}
