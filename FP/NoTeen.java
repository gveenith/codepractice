package FP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 13, 19, 20);

        // nums.removeIf(n -> n >= 13 && n <= 19);
        // System.out.println(nums.toString());
        nums.stream().allMatch(n -> n < 13 && n > 19).forEach(System.out::println);
        // nums.stream().filter(n -> n >= 13).filter(m -> m <=
        // 19).collect(Collectors.toList());
        // .filter(n -> n < 13 && n > 19).forEach(System.out::println);

    }

}
