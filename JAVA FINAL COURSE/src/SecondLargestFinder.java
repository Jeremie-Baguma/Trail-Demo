import java.util.ArrayList;

public class SecondLargestFinder {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(4);
        numbers.add(45);
        numbers.add(99);
        numbers.add(45);

        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("ArrayList must contain at least two elements.");
        }


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found, all elements might be the same.");
        }

        return secondLargest;
    }
}