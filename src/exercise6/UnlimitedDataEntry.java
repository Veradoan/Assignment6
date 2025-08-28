
package exercise6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class UnlimitedDataEntry {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        ArrayList<Integer>nums=new ArrayList<>();
        
        int sum=0;
        System.out.print("Input: ");
        while(true){
            int n=kb.nextInt();
            if(n==-1){
                break;
            }
            nums.add(n);
            sum+=n;
            
        }
        System.out.println("Number enter: "+Arrays.toString(nums.toArray())+", The sum is: "+sum);;
    }
}
