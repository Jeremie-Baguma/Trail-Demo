import java.util.ArrayList;

public class ReplaceNegativeWithZero {
    public static void replaceNegatives(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {

                numbers.set(i, 0);
            }
        }


        System.out.println(numbers);
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(7);
        numbers.add(-1);

        replaceNegatives(numbers);
    }
}
