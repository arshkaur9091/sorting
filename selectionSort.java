import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
    }
}

// time complexity O(n^2)