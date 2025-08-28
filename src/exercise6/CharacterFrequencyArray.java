package exercise6;
import java.util.Scanner;

public class CharacterFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Input: ");
        String text = sc.nextLine();

     
        int[] freq = new int[26];

    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        System.out.println("Output:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + freq[i]);
            }
        }

       
    }
}
