import java.util.stream.Stream;

public class CountEvens {

    public static void main(String[] args) {
        System.out.println("here");
        // int[] nums = new int[] { 1, 3, 5, 6, 2 };
        // int len = nums.length;
        // int count = 0;
        // for (int i = 0; i < len; i++) {
        // if (nums[i] % 2 == 0) {
        // count++;
        // }
        // }

        // System.out.println(count);
        int nos = (int) Stream.of(2, 5, 8, 9, 4).filter(num -> num % 2 == 0).count();
        System.out.println(nos);
        // Stream.of(2, 5, 8, 9, 4).filter(num -> num / 2 ==
        // 0).forEach(System.out::println);
    }
}