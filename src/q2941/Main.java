package q2941;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int number = findNumber(word, 0);

        System.out.println(number);
    }

    private static int findNumber(String word, int i) {
        int n = i;

        while(!word.isEmpty()) {
            if((word.charAt(0)=='c') && (word.charAt(1) =='=')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='c') && (word.charAt(1) =='-')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='d') && (word.charAt(1)=='z') && (word.charAt(2)=='=')) {
               word = word.substring(3);
               findNumber(word, ++n);
            }
            else if((word.charAt(0)=='d') && (word.charAt(1)=='-')) {
                word =word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='l') && (word.charAt(1)=='j')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='n') && (word.charAt(1)=='j')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='s') && (word.charAt(1)=='=')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else if((word.charAt(0)=='z') && (word.charAt(1)=='=')) {
                word = word.substring(2);
                findNumber(word, ++n);
            }
            else{
                word = word.substring(1);
                findNumber(word, n++);
            }
        }

        return n;
    }
}
