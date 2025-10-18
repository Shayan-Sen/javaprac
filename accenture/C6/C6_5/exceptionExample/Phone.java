package accenture.C6.C6_5.exceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    Phone(String phoneType, String phoneNumber) {
        if (phoneType == null || phoneNumber == null ) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }else{
            this.phoneType = phoneType;
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneType() {
        return phoneType;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone[ " +
                "phoneType='" + phoneType + "'" +
                ", phoneNumber='" + phoneNumber + "'" +
                " ]";
    }
}
