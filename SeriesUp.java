import java.util.ArrayList;
import java.util.List;

public class SeriesUp {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 1, 4 };
        int numsLen = nums.length;
        int mirrorCount = 0;
        int count = 0;

        for (int i = 0; i < numsLen; i++) {
            count = 0;
            System.out.println(i);
            for (int j = numsLen - 1; j >= 0 && i + count < numsLen; j--) {

                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        mirrorCount = Math.max(count, mirrorCount);
                        count = 0;
                    }
                }
            }
            mirrorCount = Math.max(count, mirrorCount);
        }

        System.out.println(mirrorCount);

    }

}
