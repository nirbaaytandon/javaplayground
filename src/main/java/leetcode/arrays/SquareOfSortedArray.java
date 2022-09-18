package leetcode.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 */
public class SquareOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        nums = Arrays.stream(nums).map(i -> i * i).sorted().toArray();

        return nums;

    }

    public int[] sortedSquares2(int[] nums) {

        int n = nums.length;
        int pointer2 = n - 1;
        int pointer1 = 0;
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (pointer1 <= pointer2) {

                if (nums[pointer1] * nums[pointer1] > nums[pointer2] * nums[pointer2]) {
                    result[i] = nums[pointer1] * nums[pointer1];
                    pointer1++;
                } else {
                    result[i] = nums[pointer2] * nums[pointer2];
                    pointer2--;
                }
            } else {
                break;
            }
        }
        return result;


    }
}
