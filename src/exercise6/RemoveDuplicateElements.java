package exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();

       
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        ArrayList<Integer> numbers = new ArrayList<>();
       
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }

        System.out.println("Input: " + numbers);

      
        ArrayList<Integer> result = new ArrayList<>();

   
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            boolean isDuplicate = false;

            for (int j = 0; j < result.size(); j++) {
                if (result.get(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.add(current);
            }
        }

        System.out.println("Output: " + result);

        
}}
