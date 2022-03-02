public class MaxMinInArray {

    public static void findMaxMin(int[] nums) {
        // initialize maximum and minimum element with the first element
        int max = nums[0];
        int min = nums[0];

        // do for each array element

        for (int i = 1; i < nums.length; i++) {
            // if the current element is greater than maximum found so far
            if (max < i) {
                max = nums[i];
            }

            // if current element is smaller than minimum found so far
            else if (min > i) {
                min = nums[i];
            }
        }
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);
    }

    // optimized solution to find min and max
    public static void findMinMaxOptimized(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        int n = nums.length;

        // if the array has an odd number of elements , ignore the last element and
        // consider it later.
        boolean odd = (n & 1) == 1;
        if (odd) {
            n--;
        }

        // compare elements in pair

        for (int i = 0; i < n; i = i + 2) {
            int maximum, minimum;

            if (nums[i] > nums[i + 1]) {
                minimum = nums[i + 1];
                maximum = nums[i];
            } else {
                minimum = nums[i];
                maximum = nums[i + 1];
            }

            if (maximum > max) {
                max = maximum;
            }

            if (minimum < min) {
                min = minimum;
            }

        }

        // handles the last element if the array has an odd number of elements
        if (odd) {
            if (nums[n] > max) {
                max = nums[n];
            }

            if (nums[n] < min) {
                min = nums[n];
            }
        }
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);

    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 8, 9, 34, 6, 73, 1 };
        // findMaxMin(nums); //Time Complexity: O(n)
        findMinMaxOptimized(nums); // Time Complexity: O(n)
    }
}
