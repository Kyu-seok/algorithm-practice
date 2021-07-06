package q2562;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int currNumber = input.nextInt();
        int maxNumber = currNumber;
        int sequence = 1;

        for(int i = 0 ; i < 8 ; i++) {
            currNumber = input.nextInt();
            if(maxNumber < currNumber) {
               maxNumber = currNumber;
               sequence = i + 2;
            }
        }

        System.out.println(maxNumber);
        System.out.println(sequence);
    }
}
