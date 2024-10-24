import java.util.ArrayList;
import java.util.Collections;

public class MedianFinder {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);


        Collections.sort(numbers);


        double median;
        int size = numbers.size();

        if (size % 2 == 1) {

            median = numbers.get(size / 2);
        } else {

            int middle1 = numbers.get((size / 2) - 1);
            int middle2 = numbers.get(size / 2);
            median = (middle1 + middle2) / 2.0;
        }


        System.out.println("The median is: " + median);
    }
}