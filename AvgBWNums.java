import java.util.Arrays;

public class AvgBWNums {

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3, 4, 100 };

        int high = Arrays.stream(nums).max().getAsInt();
        int low = Arrays.stream(nums).min().getAsInt();
        // int avg = Arrays.stream(nums).map(num -> {
        // int sum = num.sum());
        // return sum.avg();
        // }

        // )

        System.out.println(high);
        System.out.println(low);
        System.out.println(nums.length);
        System.out.println((Arrays.stream(nums).sum() - high - low));
        int avg = (Arrays.stream(nums).sum() - high - low) / (nums.length - 2);

        System.out.println(avg);

    }

}