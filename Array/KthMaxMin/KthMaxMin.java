import java.util.Arrays;

public class KthMaxMin {

    public static int findKthLargest(Integer[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static int findKthSmallest(Integer[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[] { 12, 3, 5, 7, 8 };
        System.out.println("largest " + findKthLargest(arr, 2));
        System.out.println("smallest " + findKthSmallest(arr, 1));

    }
}
