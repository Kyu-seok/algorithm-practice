package q10818;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0 ; i < n ; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(getMin(array) + " " + getMax(array));
    }

    static int getMax(int[] inputArray) {
        int max = inputArray[0];
        for(int i = 0; i < inputArray.length ; i++ ) {
            int a = inputArray[i];
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
    static int getMin(int[] inputArray) {
        int min = inputArray[0];
        for(int i = 0; i < inputArray.length ; i++ ) {
            int a = inputArray[i];
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
