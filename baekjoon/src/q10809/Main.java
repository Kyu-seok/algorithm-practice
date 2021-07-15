package q10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        int[] checkLocation = new int[26];
        Arrays.fill(checkLocation, -1);

        for (int i = 0 ; i < word.length() ; i++) {
            char alphabet = word.charAt(i);
            if(checkLocation[alphabet - 97] == -1) {
                checkLocation[alphabet - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(checkLocation[i]);
        }
    }
}
