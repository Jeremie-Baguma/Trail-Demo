import java.util.ArrayList;
import java.util.List;

public class Exercise2 { // Method to get a sublist from an ArrayList
    public static List<Integer> getSublist(ArrayList<Integer> list, int startIndex, int endIndex) {
        // Validate the indices
        if (startIndex < 0 || endIndex > list.size() || startIndex > endIndex) {
            throw new IndexOutOfBoundsException("Invalid start or end index");
        }
        // Return the sublist
        return list.subList(startIndex, endIndex);
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Get a sublist from index 2 to 5
        List<Integer> sublist = getSublist(numbers, 2, 5);

        // Print the sublist
        System.out.println("Sublist: " + sublist);
    }
}
