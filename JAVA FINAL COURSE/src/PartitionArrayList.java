import java.util.ArrayList;

public class PartitionArrayList {public static void main(String[] args) {
    // Create and populate the ArrayList with integers
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);

    // Create sublists for even and odd numbers
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    // Partition the list into even and odd numbers
    for (Integer number : numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    // Print both sublists
    System.out.println("Even numbers: " + evenNumbers);
    System.out.println("Odd numbers: " + oddNumbers);
}
}
