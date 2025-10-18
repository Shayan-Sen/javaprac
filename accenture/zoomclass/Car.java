package accenture.zoomclass;

class Car{
    private String model;
    private String colour;
    private int year;
   
    public Car(String model, String colour, int year){
        this.model=model;
        this.colour=colour;
        this.year=year;
    }
   
    public String getColor(){
        return colour;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setColor(String colour){
        this.colour=colour;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("----------------");
        System.out.println("Car Model: "+model);
        System.out.println("Car Colour: "+colour);
        System.out.println("Year: "+year);
        System.out.println("-------------------");
    }
   
}

