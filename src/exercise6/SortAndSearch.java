
package exercise6;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[5];

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

      
        Arrays.sort(arr);

        
        System.out.println("Output after sorting:");
        System.out.println(Arrays.toString(arr));

        
        System.out.print("Enter number to find: ");
        int x = kb.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            System.out.print("Number to find " + x ); 
            System.out.println(" ->Ouput: The number "+x+" was found at index " + index);
   
        } else {
            System.out.println("Number to find " + x + " don't have in array");
        }

        
    }
}




