import java.util.ArrayList;

public class ReplaceNegativeWithZeroFigure {
    public static void main(String[]Arg){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(7);
        numbers.add(8);
        ReplaceNegativeWithZero(numbers);
    }
    public static void ReplaceNegativeWithZero (ArrayList<Integer> numbers) {
        for (int number : numbers) {

            if (number < 0)
                System.out.println(0);
            else
                System.out.println(number);
        }
    }

}
