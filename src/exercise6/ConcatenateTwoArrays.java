
package exercise6;
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateTwoArrays {
    
    
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] newArray = new int[a1.length + a2.length];

       
        for (int i = 0; i < a1.length; i++) {
            newArray[i] = a1[i];
        }

       
        for (int i = 0; i < a2.length; i++) {
            newArray[a1.length + i] = a2[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

       
        System.out.print("Enter the number of array 1: ");
        int n1 = kb.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            a1[i] = kb.nextInt();
        }

        
        System.out.print("Enter the number of array 2: ");
        int n2 = kb.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) {
            a2[i] = kb.nextInt();
        }

      
        int[] result = concatenate(a1, a2);

       System.out.print("Input: a1 = "+Arrays.toString(a1));
        System.out.println(", a2 = "+Arrays.toString(a2));
        System.out.println("Output:New array " + Arrays.toString(result));

       
    }
}



