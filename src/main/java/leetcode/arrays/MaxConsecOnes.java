package leetcode.arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 */
public class MaxConsecOnes {
    public static void main(String[] args) {
        int[] n = new int[]{1, 1, 2, 1, 1, 1, 1, 1, 3, 3, 4, 2};
        MaxConsecOnes maxConsecOnes = new MaxConsecOnes();
        System.out.println(maxConsecOnes.findMaxConsecutiveOnes(n));
        System.out.println(maxConsecOnes.fastersol(n));

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maximum = 0;
        int i = 0;
        while (i < nums.length) {
            int conOnes = 0;
            while (i < nums.length && nums[i] == 1) {
                conOnes++;
                i++;
            }
            maximum = Math.max(maximum, conOnes);
            i++;
        }

        return maximum;


    }

    public int fastersol(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i : nums) {
            if (i == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);

    }
}
