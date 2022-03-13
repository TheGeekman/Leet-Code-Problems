public class SortZeroOneTwo {

    // The time complexity of this approach is O(n).
    public static void sort(int[] arr) {
        int zeroCount = 0;
        int oneCount = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
            if (arr[i] == 1) {
                oneCount++;
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
            arr[i] = 1;
        }

        for (int i = zeroCount + oneCount; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    // Sort With Dutch National Flag Approach

    public static void sortWithDutchFlag(int[] arr) {
        int start = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 0, 1, 2 };
        // sort(arr);
        sortWithDutchFlag(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
