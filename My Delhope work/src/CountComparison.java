public class CountComparison {
        public static int[] countComparisons (int n, int val1, int[] arr) {
            int countSmaller = 0;
            int countEqual = 0;
            int countGreater = 0;

            for (int num : arr) {
                if (num < val1) {
                    countSmaller += 1;
                } else if (num == val1) {
                    countEqual += 1;
                } else {
                    countGreater += 1;
                }
            }

            return new int[] {countSmaller, countEqual, countGreater};
        }

        public static void main(String[] args) {
            int n = 5;
            int val1 = 6;
            int[] arr = {2, 4, 6, 8, 10};
            int[] result = countComparisons(n, val1, arr);

            // Output the result in the desired format
            for (int count : result) {
                System.out.print(count);
            }
        }
    }


