package q2292;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        float n = ((float) x-1)/6;
        int result = 0;
        if(n == 0) {
            result = 1;
        }
        else if((n>0)&&(n<=1)) {
            result = 2;
        }
        else if((n>1)&&(n<=3)) {
            result = 3;
        }
        else if((n>3)&&(n<=6)) {
            result = 4;
        }
        else if((n>6)&&(n<=10)) {
            result = 5;
        }
        else if((n>10)&&(n<=15)) {
            result = 6;
        }
        else if((n>15)&&(n<=21)) {
            result = 7;
        }
        System.out.println(result);
    }
}
