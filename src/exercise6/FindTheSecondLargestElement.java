
package exercise6;
import java.util.Scanner;
import java.util.Arrays;


public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
    
        int largest = arr[0];
        int secondLargest = arr[0];

       
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; 
                largest = arr[i];        
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

    
        if (largest == secondLargest) {
            System.out.println("There is no second-largest element.");
        } else {
            System.out.println("Output: The second-largest element is: " + secondLargest);
        }

        
    }
}

    

