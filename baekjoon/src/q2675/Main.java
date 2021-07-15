package q2675;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int repeat = input.nextInt();
            String word = input.next();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
