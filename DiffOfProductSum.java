// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

import java.util.*;

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            // System.out.println(remainder);
            product *= remainder;
            sum += remainder;
            n = n / 10;
        }
        // System.out.println("ResultProd: " + product);
        // System.out.println("ResultSum: " + sum);
        return product - sum;
    }
}
public class DiffOfProductSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
	    int result = sol.subtractProductAndSum(n);
		System.out.println("Result: " + result);
        sc.close();
	}
}
