package accenture.C6_4.lesson3.inheritenceExample;

public class Person {
    private String firstName;
    private String lastName;

    Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return (firstName != null)? firstName : "No First Name Assigned";
    }
    public String getLastName() {
        return (lastName != null)? lastName : "No Last Name Assigned";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [ " +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                " ]";
    }
}