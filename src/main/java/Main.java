public class CodeTasks {

    public static int countLowerCase(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        if (Character.isUpperCase(str.charAt(index))) {
            return countLowerCase(str, index + 1);
        }
        return 1 + countLowerCase(str, index + 1);
    }

    public static String insertStars(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        if ((index + 1) % 3 == 0) {
            return str.charAt(index) + "*" + insertStars(str, index + 1);
        }
        return str.charAt(index) + insertStars(str, index + 1);
    }

    public static String reverseString(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        return str.charAt(str.length() - index - 1) + reverseString(str, index + 1);
    }

    public static void printCharsInRange(char from, char to) {
        if (from > to) {
            return;
        }
        System.out.println(from);
        printCharsInRange((char) (from + 1), to);
    }

    public static void printDivisors(int num, int divisor) {
        if (divisor == 0) {
            return;
        }
        if (num % divisor == 0) {
            System.out.println(divisor);
        }
        printDivisors(num, divisor - 1);
    }

    public static void printEvenDigits(int num) {
        if (num / 10 == 0) {
            return;
        }
        if ((num % 10) % 2 == 0) {
            System.out.println(num % 10);
        }
        printEvenDigits(num / 10);
    }

    public static void multiplicationTable(int row, int col) {
        if (row == 11) {
            return;
        }
        System.out.println(row * col);
        if (col == 10) {
            col = 0;
            row++;
        }
        multiplicationTable(row, col + 1);
    }

    public static void printArithmeticSequence(int start, int step, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(start);
        printArithmeticSequence(start + step, step, count - 1);
    }

    public static void printProgressiveSeries(int start, int count, int step) {
        if (count == 1) {
            System.out.println(start);
        } else {
            System.out.println(start);
            printProgressiveSeries(start + step, count - 1, step + 1);
        }
    }

    public static void zigzagSequence(int start, int count, int step) {
        if (count == 0) {
            return;
        }
        System.out.println(start);
        if (step % 2 == 0) {
            zigzagSequence(start - 1, count - 1, step + 1);
        } else {
            zigzagSequence(start + 2, count - 1, step + 1);
        }
    }

    public static void printEvenIndexes(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        if (index % 2 == 0) {
            System.out.println(arr[index]);
        }
        printEvenIndexes(arr, index + 1);
    }

    public static void printIncreasingElements(int[] arr, int index) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] < arr[index + 1]) {
            System.out.println(arr[index]);
        }
        printIncreasingElements(arr, index + 1);
    }

    public static int sumDigits(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return num % 10 + sumDigits(num / 10);
    }

    public static int repeatedDigitSum(int num) {
        int sum = sumDigits(num);
        if (sum < 10) {
            return sum;
        } else {
            return repeatedDigitSum(sum);
        }
    }

    public static boolean isSorted(int num) {
        if (num / 10 == 0) {
            return true;
        }
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        if (lastDigit < secondLastDigit) {
            return false;
        }
        return isSorted(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(12345));
    }
}
