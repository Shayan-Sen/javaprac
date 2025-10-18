package accenture.zoomclass;

import java.util.HashSet;

public class Round2 {
    public static void main(String[] args) {
        HashSet<String> rooms = new HashSet<>();

        rooms.add("Room 101");
        rooms.add("Room 102");
        rooms.add("Room 103");

        boolean added = rooms.add("Room 101");
        if (!added) {
            System.out.println("Duplicate reservation detected for Room 101!");
        }

        System.out.println("Booked Rooms:");
        for (String room : rooms) {
            System.out.println(room);
        }

        String checkRoom = "Room 102";
        if (rooms.contains(checkRoom)) {
            System.out.println(checkRoom + " is already booked!");
        } else {
            System.out.println(checkRoom + " is available for booking.");
        }
    }
}