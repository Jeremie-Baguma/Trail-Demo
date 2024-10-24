import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;

        ArrayList<Integer> primes = generatePrime(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
    }

    public static ArrayList<Integer> generatePrime(int start, int end) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        return primeList;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
