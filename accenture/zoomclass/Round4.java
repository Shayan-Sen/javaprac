package accenture.zoomclass;

import java.util.*;
import java.util.stream.*;

public class Round4 {
    public static void main(String[] args) {
        List<Integer> roomPrices = Arrays.asList(150, 80, 200, 120, 90, 300, 110);

        // Filter prices > 100 and sort ascending
        List<Integer> filteredAndSorted = roomPrices.stream()
                .filter(price -> price > 100)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted room prices: " + filteredAndSorted);
    }
}