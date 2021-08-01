import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            int one = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == one)
                    return new int[]{i, j};
            }

        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 9, 3, 12};
        int b = 12;
        System.out.println("answer:");
        for (int c : twoSum(a, 12)) {
            System.out.println(a[c]);
        }
    }
}
