import java.util.*;

public class UnionIntersectArray {

    // get union using hash data structure in java
    public static void getUnion(int a[], int n, int b[], int m) {
        // Defining set container s
        HashSet<Integer> s = new HashSet<>();
        // Inserting array elements in s
        for (int i = 0; i < n; i++)
            s.add(a[i]);
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        System.out.print("Number of elements after union operation: " + s.size() + "\n");
        System.out.print("The union set of both arrays is :" + "\n");

        System.out.print(s.toString() + " "); // s will contain only distinct
        // elements from array a and b
    }

    private static void findUnion(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                System.out.print(firstArr[i] + " ");
                i++;
            } else if (secondArr[j] < firstArr[i]) {
                System.out.print(secondArr[j] + " ");
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }

        while (i < firstArr.length) {
            System.out.print(firstArr[i] + " ");
            i++;
        }

        while (j < secondArr.length) {
            System.out.print(secondArr[j] + " ");
            j++;
        }
    }

    public static void findIntersection(int a[], int b[], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    System.out.println(b[j]);
                }
            }
        }
    }

    // Function to find intersection
    static void intersection(int a[], int b[], int n, int m) {
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (a[i] > b[j]) {
                j++;
            }

            else if (b[j] > a[i]) {
                i++;
            } else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] firstArr = { 1, 2, 3, 4, 5, 6 };
        int[] secondArr = { 4, 9, 13, 15, 16, 17 };

        // findUnion(firstArr, secondArr);
        getUnion(firstArr, firstArr.length, secondArr, secondArr.length);

    }
}
