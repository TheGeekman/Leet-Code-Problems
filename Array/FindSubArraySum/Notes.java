/*
 * find Largest sum contiguous Subarray [V. IMP]
 * 
 * Efficient Approach: Kadane’s Algorithm
 * 
 * Kadane’s Algorithm is an iterative dynamic programming algorithm. It
 * calculates the maximum sum subarray ending at a particular position by using
 * the maximum sum subarray ending at the previous position. Follow the below
 * steps to solve the problem.
 * 
 * Define two-variable currSum which stores maximum sum ending here and maxSum
 * which stores maximum sum so far.
 * Initialize currSum with 0 and maxSum with INT_MIN.
 * Now, iterate over the array and add the value of the current element to
 * currSum and check
 * If currSum is greater than maxSum, update maxSum equals to currSum.
 * If currSum is less than zero, make currSum equal to zero.
 * Finally, print the value of maxSum.
 */