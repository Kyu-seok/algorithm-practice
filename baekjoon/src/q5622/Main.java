package q5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        int[] array = new int[word.length()];

        for ( int i = 0; i < word.length(); i++) {
            array[i] = toNumber(word.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    private static int toNumber(char c) {
        int n=0;
        if((c=='A') || (c=='B') || (c=='C') ){
            n = 3;
        }
        else if((c=='D') || (c=='E') || (c=='F') ) {
            n = 4;
        }
        else if((c=='G') || (c=='H') || (c=='I') ) {
            n = 5;
        }
        else if((c=='J') || (c=='K') || (c=='L') ) {
            n = 6;
        }
        else if((c=='M') || (c=='N') || (c=='O') ) {
            n = 7;
        }
        else if((c=='P') || (c=='Q') || (c=='R') || (c=='S') ) {
            n = 8;
        }
        else if((c=='T') || (c=='U') || (c=='V') ) {
            n = 9;
        }
        else if((c=='W') || (c=='X') || (c=='Y') || (c=='Z') ) {
            n = 10;
        }
        return n;
    }
}
