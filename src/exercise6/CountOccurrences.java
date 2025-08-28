
package exercise6;
import java.util.Scanner;
import java.util.Arrays;
public class CountOccurrences {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n=keyboard.nextInt();
        System.out.println("Enter the elements: ");
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=keyboard.nextInt();
        }
        System.out.println("Input: "+ Arrays.toString(num));
        System.out.print("Enter X: ");
        int x=keyboard.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(x==num[i]){
                count++;
            }
        }
        System.out.print("Output: The number "+x+" appears "+count+" times");
    }
}
