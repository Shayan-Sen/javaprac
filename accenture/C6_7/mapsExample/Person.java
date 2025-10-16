package accenture.C6_7.mapsExample;

import java.util.regex.Pattern;

class Person {
    private final String name;
    private final String email;

    public boolean validateEmail(String email){
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regexEmail);
        return pattern.matcher(email).matches();
    }

    public Person(String name, String email) {
        if(validateEmail(email)){
            this.email = email;
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }


    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
