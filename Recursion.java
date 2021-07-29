public class Recursion {

    public static void main(String[] args) {
        int[] input = new int[] { 2, 5, 10, 4 };
        System.out.println(groupSum(0, input, 19));
    }

    static boolean groupSum(int start, int[] nums, int target) {
        // input first loop - 0,[5,6,2],8 - 1,[5,6,2],8 - 2,[5,6,2],2 - 3,[5,6,2],0 -
        // true

        // base case
        if (start >= nums.length)
            return (target == 0);
        // 1,[5,6,2],3 -> false
        // 2,[5,6,2],-3 -> 3,[5,6,2], -3 - false

        // 3,[5,6,2],-5 - false

        System.out.println("Loop 1" + " " + start + " " + nums + " " + target);
        if (groupSum(start + 1, nums, target - nums[start]) && checkBC(start, nums)) {
            System.out.println("Loop 1" + target + start);
            return true;
        }
        System.out.println("Loop 2" + " " + start + " " + nums + " " + target);
        if (groupSum(start + 1, nums, target)) {
            System.out.println("target reached" + target + start);
            return true;
        }

        return false;

    }

    static boolean checkBC(int start, int[] nums) {
        if (start == 0)
            return true;
        if ((start > 0) && (nums[start - 1] % 5 == 0) && nums[start] == 1)
            return false;
        return true;
    }

}