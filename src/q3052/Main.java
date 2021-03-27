package q3052;

import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[10];

        for(int i = 0 ; i < 10 ; i++) {
            number[i] = input.nextInt()%42;
        }

        int diff = 0;
        for( int i = 0 ; i < 10 ; i++) {                //need an update on the algoithm
            for(int j = 0; j < 10 ; j++) {
                if (i != j) {
                    if(number[i] !=  number[j]) {
                        diff++;
                    }
                }
            }
        }
        System.out.println(diff);
    }
}
