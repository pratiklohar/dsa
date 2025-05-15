package algo.twopointer;

import java.util.Arrays;
import java.util.TreeSet;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int[] result = new int[nums.length-k+1];
        int z = 0;

        while (right < nums.length) {
            int x = nums[left];
            for (int i = left; i <= right; i++) {
                if (nums[i] > x) {
                    x = nums[i];
                }
            }
            result[z] = x;
            z++;
            left++;
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(SlidingWindowMaximum.maxSlidingWindow(nums, k)));
    }
}
