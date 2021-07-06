package q1110;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean done = false;
        int cycle = 1;
        int inputNumber = input.nextInt();
        int calcNumber = inputNumber;

        while (!done) {
            calcNumber = ((calcNumber % 10) * 10) + (((calcNumber/10) + (calcNumber%10))%10);
            if(calcNumber == inputNumber) {
                System.out.println(cycle);
                break;
            }
            else {
                cycle++;
            }
        }
    }
}
