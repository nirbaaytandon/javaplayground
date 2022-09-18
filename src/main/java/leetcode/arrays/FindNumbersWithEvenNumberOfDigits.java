package leetcode.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();

        int[] n = new int[]{1, 34, 56, 888, 66666};
        System.out.println(findNumbersWithEvenNumberOfDigits.findNumbers(n));

    }

    public int findNumbers(int[] nums) {

        int count = 0;

        /**
         * convert to string array
         */

        String[] strArray = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        for (String i : strArray) {
            if (i.length() % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
