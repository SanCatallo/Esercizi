package Esercizi;

import java.util.HashMap;

public class Map {
    public static void main(String[] args){

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        HashMap<Integer, String> oddNumbers = new HashMap<>();
        oddNumbers.put(1, "Uno");
        oddNumbers.put(3, "Tre");
        oddNumbers.put(5, "Cinque");
        oddNumbers.put(7, "Sette");
        oddNumbers.put(9, "Nove");

        for (HashMap.Entry<Integer, String> entry : oddNumbers.entrySet()){
             numbers.put(entry.getKey(), entry.getValue());
        }

        for (HashMap.Entry<Integer, String> entry : numbers.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        printValueForKey(numbers, 5);
        printValueForKey(numbers, 6);
        printValueForKey(numbers, 7);
        printValueForKey(numbers, 8);
        printValueForKey(numbers, 9);
    }

    private static void printValueForKey(HashMap<Integer, String> map, int key) {
        String value = map.get(key);
        if (value != null) {
            System.out.println("Value for key " + key + ": " + value);
        } else {
            System.out.println("No associated value for key " + key);
        }
    }
}
