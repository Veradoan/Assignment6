
package exercise6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class FilterEvenNumbers {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        ArrayList<Integer>evenNum=new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n=kb.nextInt();
        int []num=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
        num[i]=kb.nextInt();
    }
        for(int i=0;i<n;i++){
            if(num[i]%2==0){
                evenNum.add(num[i]);
            }
        }
        System.out.println("ArrayList containing "+Arrays.toString(evenNum.toArray()));
    }
    
}
