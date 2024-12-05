
import java.util.*;

public class mergeSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        divide(arr, 0, size - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void conquer(int arr[], int startIndex, int mid, int endIndex) {
        int merged[] = new int[endIndex - startIndex + 1];

        int idx1 = startIndex;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIndex) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= endIndex) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = startIndex; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        divide(arr, startIndex, mid);
        divide(arr, mid + 1, endIndex);

        conquer(arr, startIndex, mid, endIndex);
    }
}

// time complexity O(n logn)
