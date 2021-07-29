import java.util.Arrays;

public class SquareUp {

    public static void main(String[] args) {
        int n = 3;
        int[] nums = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i * n - j);

                nums[i * n - j] = j;
            }
        }

        // Arrays.stream(nums).forEach(System.out::println);
    }

}
