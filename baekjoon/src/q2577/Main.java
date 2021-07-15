package q2577;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        String stringNumber = Integer.toString(a*b*c);
        for ( int i = 0; i < 10 ; i++) {
            int nRepeated=0;
            for (int j = 0 ; j < stringNumber.length() ; j++) {
                if(i == Character.getNumericValue(stringNumber.charAt(j))) {
                    nRepeated++;
                }
            }
            System.out.println(nRepeated);
        }
    }
}
