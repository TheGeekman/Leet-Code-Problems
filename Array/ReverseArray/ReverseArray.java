public class ReverseArray {

    // Iterative approach => Time complexity O(n)
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // recursive approach => Time complexity O(n)
    static void recursiveReverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursiveReverseArray(arr, start + 1, end - 1);

    }

    // prints an array

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printArray(arr, 6);

        recursiveReverseArray(arr, 0, 5);

        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }

}

// Write a program to reverse an array or string

// Given an array (or string), the task is to reverse the array/string.
// Examples :

// Input : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input : arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}
