import java.util.HashSet;

public class CitySet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> cities = new HashSet<>();

        // Add 5 city names to the set
        cities.add("Kampala");
        cities.add("Nairobi");
        cities.add("Dar es Salaam");
        cities.add("Kigali");
        cities.add("Johannesburg");

        // Print the set
        System.out.println("Cities set: " + cities);

        // Add a duplicate city
        cities.add("Nairobi");

        // Print the set again after attempting to add a duplicate
        System.out.println("Cities set after adding duplicate: " + cities);
    }
}
