import java.util.ArrayList;

public class RemoveValueFromList {public static void removeAllOccurrences(ArrayList<Integer> list, int value) {
    list.removeIf(n -> n == value);
    System.out.println("Updated list: " + list);
}

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);

        int valueToRemove = 5;

        removeAllOccurrences(numbers, valueToRemove);
    }
}
