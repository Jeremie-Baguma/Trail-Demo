public class DoubleArrayValues {
    public static void main(String[] args) {
        // Step 1: Define and initialize an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Step 2: Print the original array values
        System.out.println("Original array values:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Step 3: Double the values in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;  // Multiply each element by 2
        }

        // Step 4: Print the doubled array values
        System.out.println("Doubled array values:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
