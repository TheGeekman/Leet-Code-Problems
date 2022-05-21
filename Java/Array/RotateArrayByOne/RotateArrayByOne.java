import java.util.Arrays;

public class RotateArrayByOne {

    // Time Complexity: O(n) As we need to iterate through all the elements
    // Auxiliary Space: O(1)
    public static void rotateArray(int[] arrp) {
        int x = arrp[arrp.length - 1], i;
        for (i = arrp.length - 1; i > 0; i--)
            arrp[i] = arrp[i - 1];
        arrp[0] = x;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        rotateArray(arr);
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}
