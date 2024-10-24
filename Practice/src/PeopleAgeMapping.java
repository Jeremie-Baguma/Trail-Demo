//Map a List of People to Their Ages
//Write a program that:
//-Creates a HashMap where the keys are people's names (Strings) and the values are their ages (Integers).
//-Add 5 people and their ages.
//-Print out each person and their age using a loop

import java.util.HashMap;
import java.util.Map;

public class PeopleAgeMapping {
    public static void main(String[] args) {
        // Create a HashMap to store people and their ages
        Map<String, Integer> peopleAges = new HashMap<>();

        // Add 5 people and their ages
        peopleAges.put("Alice", 25);
        peopleAges.put("Bob", 30);
        peopleAges.put("Charlie", 22);
        peopleAges.put("Diana", 28);
        peopleAges.put("Edward", 35);

        // Print each person and their age
        System.out.println("People and their ages:");
        for (Map.Entry<String, Integer> entry : peopleAges.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
