package accenture.C6.C6_3.creatingclass;

class Dog {
    private final String dogType;
    private final String dogName;
    private final String dogColor;
    private int dogAge;

    Dog(String dogType, String dogName, String dogColor,int dogAge){
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType() {
        return dogType;
    }
    public String getDogName() {
        return dogName;
    }
    public String getDogColor() {
        return dogColor;
    }
    public int getDogAge() {
        return dogAge;
    }

    public void incrementAge() {
        this.dogAge++;
    }

    public String description(){
        return "This is a "+ dogColor + " " + dogType + " named " + dogName + " and is " + dogAge + " years old.";
    }

    @Override
    public String toString() {
        return "DOG DETAILS: " +
                "\nDog Type: " + dogType  +
                "\nDog Name: " + dogName  +
                "\nDog Color: " + dogColor  +
                "\nDog Age: " + dogAge ;
    }
}
