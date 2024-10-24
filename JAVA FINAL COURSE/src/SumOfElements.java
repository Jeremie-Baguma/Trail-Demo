import java.util.ArrayList;

public class SumOfElements {
    public static void sumOfElements(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;  // Add each element to sum
        }

        System.out.println("The sum of all elements in the list is: " + sum);
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        sumOfElements(numbers);  // Call the function with the ArrayList
    }
}

