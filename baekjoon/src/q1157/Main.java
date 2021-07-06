package q1157;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        line = line.toUpperCase(Locale.ROOT);
        int[] alphabet = new int[26];
        char ch = '0';
        int max = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            alphabet[(c-65)]++;
        }

        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i +65);
            }
            else if(max == alphabet[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
