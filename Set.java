package Esercizi;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args){
        HashSet<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("\n" + days + "\n");

        LinkedHashSet<String> days2 = new LinkedHashSet<>();
        days2.add("Monday");
        days2.add("Tuesday");
        days2.add("Wednesday");
        days2.add("Thursday");
        days2.add("Friday");
        days2.add("Saturday");
        days2.add("Sunday");

        System.out.println(days2);

        boolean setsEqual = days.equals(days2);

        System.out.println("\nAre the two sets equal? " + setsEqual);

    }

}
