package q2292;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 1;
        int range = 2;

        if(x==1) {
            System.out.println("1");
        }
        else {
             while(range <= x) {
                 range = range + (count * 6);
                 count++;
             }
             System.out.println(count);
        }
    }
}
