package exercise6;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the number of element: ");
        int n = keyboard.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = keyboard.nextInt();
        }

        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[n - 1 - i];
            num[n - 1 - i] = temp;
        }
        System.out.println("Output(array after reversal:)"+Arrays.toString(num));
    }
}
