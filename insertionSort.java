import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current< arr[j]){
              arr[j+1]=arr[j];
              j--;
            }
            // placement
            arr[j+1]=current;
        }
    }
}

// time complexity O(n^2)