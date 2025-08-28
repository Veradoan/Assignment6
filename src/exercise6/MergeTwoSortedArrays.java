package exercise6;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

    // Method to merge two sorted arrays into one sorted array
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge until one of the arrays is exhausted
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1 (if any)
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2 (if any)
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for array 1
        System.out.print("Enter the number of elements in array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements in ascending order: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for array 2
        System.out.print("Enter the number of elements in array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
      
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = merge(arr1, arr2);
        System.out.print("Input: "+ Arrays.toString(arr1));
        System.out.println(" and "+Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(merged));

        sc.close();
    }
}
