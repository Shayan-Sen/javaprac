package accenture.C6_4.lesson3.inheritenceExample;

public class StudentEmployee extends Student {
    private String employeeId;
    private double rateOfPayPerHour;

    StudentEmployee(){}

    StudentEmployee(String firstName, String lastName, String studentId, String employeeId, double rateOfPayPerHour){
        super(firstName, lastName, studentId);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return (employeeId != null)? employeeId : "No Employee ID Assigned";
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }
    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString() {
        return "StudentEmployee [ " +
                "firstName = " + super.getFirstName() +
                ", lastName = " + super.getLastName() +
                ", studentId = " + super.getStudentId() +
                ", employeeId = " + employeeId +
                " ]";
    }
    
}
