package leetcode.arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 */
public class InsertIntoArray {
    public void duplicateZeros(int[] arr) {
/**
 * create another array that is the same length as the input array
 * check every element is 0 or not
 *  if element is 0 then place it at that position
 *  in the array and
 */

        int noOfZeros = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZeros++;
        }
        for (int i = n - 1; i >= 0; i--) {
            int curIndex = i + noOfZeros;
            if (curIndex < n) {
                arr[curIndex] = arr[i];
            }
            if (arr[i] == 0) {
                if (curIndex - 1 < n) {
                    arr[curIndex - 1] = arr[i];
                }
                noOfZeros--;
            }
        }


    }
}
