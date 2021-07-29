package FP;

import java.util.Arrays;
import java.util.List;

public class reduce {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 2, 2, 2, 5 };

        // int ptr = 0;
        // int sum = nums[ptr];
        // for (int i = 1; i <= nums.length - 1; i++) {

        // if (nums[i] == sum) {
        // nums[ptr] += nums[i];
        // nums[i] = 0;
        // } else {
        // ptr = i;
        // sum = nums[i];
        // }

        // }

        int[] n = Arrays.stream(nums).sorted().toArray();
        System.out.println(n[1]);
        // Arrays.stream(nums).forEach(System.out::println);

    }

}
