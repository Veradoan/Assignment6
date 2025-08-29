
package exercise6;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertBetweenArrayAndArrayList {

   
   public static ArrayList<String> arrayToArrayList(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (String element : array) {
            list.add(element);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
     
        String[] array = {"Ann", "Bob"};
        ArrayList<String> list = arrayToArrayList(array);
        System.out.println("arrayToArrayList with " + Arrays.toString(array) +
                           " -> returns an ArrayList containing " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charles");
        list2.add("David");
        String[] array2 = arrayListToArray(list2);

        System.out.println("arrayListToArray with " + list2 +
                           " -> returns an array " + Arrays.toString(array2));
    }
}
