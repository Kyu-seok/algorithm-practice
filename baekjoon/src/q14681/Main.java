package q14681;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {                            //x value is positive
           if (b > 0) {
               System.out.println("1");
           }
           else {
               System.out.println("4");
           }
        }
        else if (a < 0) {                       //x value is negative
           if (b> 0) {
               System.out.println("2");
           }
           else {
               System.out.println("3");
           }
        }
    }
}
