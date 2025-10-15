package accenture.C6_4.lesson3.inheritenceExample;

public class Student extends Person {
    private String studentId;

    Student(){}

    Student(String firstName, String lastName, String studentId){
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return (studentId != null)? studentId : "No Student ID Assigned";
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [ " +
                "firstName = " + super.getFirstName() +
                ", lastName = " + super.getLastName() +
                ", studentId = " + studentId +
                " ]";
    }

}
