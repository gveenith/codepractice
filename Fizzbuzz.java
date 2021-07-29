import java.util.Arrays;
import java.util.stream.Stream;

public class Fizzbuzz {

    public static void main(String[] args) {

        int[] inputNums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
        String[] outputArray = Arrays.stream(inputNums).mapToObj(num -> getStringNumbers(num)).toArray(String[]::new);
        System.out.println(Arrays.toString(outputArray));
    }

    private static String getStringNumbers(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

}