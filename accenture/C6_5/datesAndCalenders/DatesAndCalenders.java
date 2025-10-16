package accenture.C6_5.datesAndCalenders;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalenders {

    public static void displayCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("\n========================================\n" + calendar + "\n======================================\n");
        Date date =  new Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    public static void displaySetDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, 01, 21);
        Date date = calendar.getTime();
        System.out.println(date);
    }
    public static void main(String[] args) {
        displayCurrentDate();
        System.out.println("\n=================================================\n");
        displaySetDate();
    }
}
