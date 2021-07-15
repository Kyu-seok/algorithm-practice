package q2439;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j=0;
        int s;
        for(int i = 0 ; i < n ; i++) {

            s = n-i-1;
            for(int k = 0; k < s ; k++) {
                System.out.print(" ");
            }

            for(j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

