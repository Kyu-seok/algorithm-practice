package q2908;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sNum1 = input.next();
        String sNum2 = input.next();

        sNum1 = reverseString(sNum1);
        sNum2 = reverseString(sNum2);

        if(Integer.parseInt(sNum1) > Integer.parseInt(sNum2)) {
            System.out.println(sNum1);
        }
        else {
            System.out.println(sNum2);
        }
    }

    private static String reverseString(String string) {
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString = newString + string.charAt(i);
        }
        return newString;
    }
}
