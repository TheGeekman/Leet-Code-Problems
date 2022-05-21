public class MoveNegative {

    public static void shiftIntegers(int[] arr, int n) {
        int j = 0, temp;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void shiftAll(int[] arr, int left, int right) {
        // loop to iterate over the array from left to right
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }

        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, -10, 13, -7, -60, 52, 8, -19 };
        int n = arr.length;
        // shiftIntegers(arr, n);
        shiftAll(arr, 0, arr.length - 1);
        printArray(arr, n);
    }

}
