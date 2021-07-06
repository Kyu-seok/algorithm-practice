package q1316;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nGroupWord = 0;
        int nInputWord = input.nextInt();

        for (int i = 0; i < nInputWord; i++) {
           String word = input.next();                  //takes in word
           boolean isGroupWord = true;                  //word is group initially
           char currChar = 0;
           char[] usedChar = new char[26];
           int iterator = 0;
           for (int j = 0; j < word.length(); j++) {
               if (j == 0) {
                   currChar = word.charAt(j);
                   usedChar[0] = currChar;
                   iterator++;
               }
               else {                                   //char is not the first element.
                   if(word.charAt(j) == currChar) {     //if second char is same with currChar
                       //nothing happens
                   }
                   else {                               //if second char is different from currChar
                       if( arrayContains(usedChar, word.charAt(j))) {
                           isGroupWord = false;
                       }
                       usedChar[iterator] = word.charAt(j);
                       iterator++;
                   }
                   currChar = word.charAt(j);
               }
           }
           if(isGroupWord) {
               nGroupWord++;
           }
        }
        System.out.println(nGroupWord);
    }

    public static boolean arrayContains(char[] array, char c) {
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == c) {
                contains = true;
            }
        }
        return contains;
    }
}
