package exercise6;

import java.util.Scanner;
import java.util.Arrays;

public class FindTheMaxAndMin {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the number of element:  ");
        int n=keyboard.nextInt();
        int[]num=new int[n];
        System.out.print("Enter the elements: ");
        //Enter array
        for(int i=0;i<n;i++){
            num[i]=keyboard.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(num));
        int max=num[0];
        int min=num[0];
       for(int i=0;i<n;i++){
           if(max<num[i]){
               max=num[i];
           }
           if(min>num[i]){
               min=num[i];
           }
       }
       System.out.println("The maximum value is "+max);
       System.out.println("The minimum value is: "+min);
    }

}

