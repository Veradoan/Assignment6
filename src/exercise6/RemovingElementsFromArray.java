package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovingElementsFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }

        System.out.println("Result: " + list);

        sc.close();
    }
}
