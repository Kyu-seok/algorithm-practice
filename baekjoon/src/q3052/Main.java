package q3052;

import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[10];

        for(int i = 0 ; i < 10 ; i++) {
            number[i] = input.nextInt()%42;
        }

        int types = 1;

        for( int i = 0 ; i < 9 ; i++) {                //need an update on the algoithm
            boolean notContains = true;
            for(int j = 9; j > i ; j--) {
               if(i != j) {
                    if (number[i] == number[j]) {
                        notContains = false;
                    }
               }
            }
            if (notContains == true) {
                types++;
            }
        }
        System.out.println(types);
    }
}
