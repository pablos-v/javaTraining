// сгенерировать все перестановки длины N из K чисел с повторениями. 
// Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"

// public class homework1 {
//     public static void main(String[] args) {
//         generate(2, 3);
//     }

//     static void generate(int n, int k) {
//         if(k==0) return;
//         generate(n, k-1);
//         for (int i = 0; i <= n; i++) {
//             System.out.printf(" %d%d", k-1, i);
//         }
//     }
// } ПОДОГНАЛ))))
// ------------var2-----------------------

// public class homework1 {
//     public static void main(String[] args) {
//         int n = 2;
//         int k = 3;
//         int[] arr = new int[(int)Math.pow(k,n)];
//         generate(2, 3);
//     }

//     static void generate(int n, int k) {

//        for (int ii = 0; ii < k; ii++) {
//             for (int i = 0; i < n; i++) {
//                 arr[j] = k-1
//             }
//        }
//     }
// }
// ------------------------------------------------
// Given an integer number n, return the difference between the product of 
// its digits and the sum of its digits.

// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

// public class homework1 {

//     public static void main(String[] args) {
//         System.out.println(countDiff(4421));
//     }

    // static int countDiff(int n) {
    //     int product = productRec(n, 1);
    //     int sum = sumRec(n, 0);
    //     return product - sum;
    // }

    // static int productRec(int n, int res) {
    //     if (n == 0)
    //         return res;
    //     return res * productRec(n / 10, n % 10);
    // }

    // static int sumRec(int n, int res) {
    //     if (n == 0)
    //         return res;
    //     return res + sumRec(n / 10, n % 10);
    // }
// }
// ------------------------------------------------------

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
 */
// import java.util.Arrays;
// public class homework1 {

//     public static void main(String[] args) {
//         int[] nums = {0,2,1,5,3,4};
//         int[] newarr = new int[nums.length];
//         for (int i = 0; i < newarr.length; i++) {
//             newarr[i] = nums[nums[i]];
//         }
//         System.out.println(Arrays.toString(newarr));
//     }
// }