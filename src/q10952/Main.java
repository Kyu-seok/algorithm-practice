package q10952;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        while(true) {

            int a = input.nextInt();
            int b = input.nextInt();

            if ((a==0) && (b==0)) {
                input.close();
                break;
            }

            System.out.println(a+b);
        }
    }
}
