package q1152;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] word = line.split(" ");
        int filled = 0;
        for (int i = 0; i < word.length; i++) {
            if(!word[i].isEmpty()) {
                filled++;
            }
        }
        System.out.println(filled);
    }
}
