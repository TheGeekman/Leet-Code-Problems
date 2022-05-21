public class DupInArray {
    // public static int findDuplicate(int[] nums) {

    // // create a visited array of size `n+1`
    // // we can also use a map instead of a visited array
    // boolean visited = new Boolean(nums.length - 1);
    // for (int value : nums) {
    // // if the element is seen before
    // if (visited[value]) {
    // return value;
    // }
    // visited[value] = true;

    // }
    // return -1;
    // }

    public static int findDuplicateApp(int nums[]) {
        int duplicate = -1;
        for (int i : nums) {
            // get the value of the current element
            int val = (i < 0) ? -i : i;

            // make element at index `val` negative if it is positive
            if (nums[val] >= 0) {
                nums[val] = -nums[val];
            } else {
                // if the element is already negative, it is repeated
                duplicate = val;
                break;
            }
        }

        // restore the original array before returning
        for (int i = 0; i < nums.length; i++) {
            // make negative elements positive
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            }
        }

        return duplicate;

    }

    public static void main(String[] args) {
        // input array contains `n` numbers between 1 and `n-1`
        // with one duplicate, where `n` is the array's length
        int[] nums = { 1, 2, 3, 4, 4 };

        System.out.println("The duplicate element is " + findDuplicateApp(nums));
    }
}
