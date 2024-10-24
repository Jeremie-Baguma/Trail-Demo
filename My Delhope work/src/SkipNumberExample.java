import java.util.Arrays;

public class SkipNumberExample {

    public static void main(String[] args) {
        int input = 10; // Example input value
        Integer[] result = addNumbersToArray(input);
        System.out.println(Arrays.toString(result));
    }

    public static Integer[] addNumbersToArray(int n) {
        Integer[] array = new Integer[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 5) {
                array[index++] = null; // Skip 5 and store null
            } else {
                array[index++] = i; // Add other numbers to the array
            }
        }
        return array;
    }
}
