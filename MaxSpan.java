public class MaxSpan {

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 1, 1, 3 };
        int span = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Before tmp :" + nums[i] + "-----" + nums[j]);
                    tmp = j - i + 1;
                    System.out.println("After tmp :" + tmp);
                    span = Math.max(tmp, span);
                    System.out.println("Span :" + span);
                }
            }
        }

    }

}