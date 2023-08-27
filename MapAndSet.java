package Esercizi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapAndSet {
    public static void main(String[] args) {
        HashMap<String, Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);


        Set<String> keys = months.keySet();
        System.out.println(keys);

        List<Integer> cardinalMonths = new ArrayList<>(months.values());
        System.out.println(cardinalMonths);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        for (Integer num : cardinalMonthArray) {
            System.out.println(num);
        }
    }
}