import java.util.ArrayList;

public class ArrayListRotation { public static ArrayList<Integer> rotateArrayList(ArrayList<Integer> list) {
    if (list == null || list.size() <= 1) {
        return list;
    }

    // Remove the last element and add it to the front of the list
    Integer lastElement = list.remove(list.size() - 1);
    list.add(0, lastElement);

    return list;
}

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding elements to the ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Rotating the ArrayList
        ArrayList<Integer> rotatedList = rotateArrayList(numbers);

        // Displaying the rotated ArrayList
        System.out.println("Rotated List: " + rotatedList);
    }
}
