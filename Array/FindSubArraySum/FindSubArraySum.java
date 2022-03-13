public class FindSubArraySum {

    // Kadane's Algorithm approach
    public static int SubArrayByKadane(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n - 1; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    // brute force approach with time complexity O(n2)
    public static int SubArrayByBruteForce(int arr[]) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int currSum = 0;
            for (int j = i; j < n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 8, -2, 6, -8, 5 };
        // System.out.println(SubArrayByBruteForce(a));
        System.out.println(SubArrayByKadane(a));
    }
}
