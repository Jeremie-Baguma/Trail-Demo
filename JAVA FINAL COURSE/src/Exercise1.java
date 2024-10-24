import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 { public static void main(String[] args) {
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

    // Remove even numbers using an iterator
    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
        Integer number = iterator.next();
        if (number % 2 == 0) {
            iterator.remove();
        }
    }

    // Print the updated list
    System.out.println("Updated List: " + numbers);
}

}

