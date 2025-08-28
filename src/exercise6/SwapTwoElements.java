
package exercise6;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoElements {
   
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
        System.out.print("Enter the number of element: ");
        int n = kb.nextInt();

        // Nhập mảng
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

       
        System.out.println("Original array: " + Arrays.toString(arr));

      
        System.out.print("Index1: ");
        int index1 = kb.nextInt();
        System.out.print("Index2: ");
        int index2 = kb.nextInt();

        
        swap(arr, index1, index2);

        
        System.out.println("Array after the function call: " + Arrays.toString(arr));

       
    }
}



