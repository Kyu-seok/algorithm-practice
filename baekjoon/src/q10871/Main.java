package q10871;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        String outString = "";

        for (int i = 0; i < n ; i++) {
            int number = sc.nextInt();
            if(number < x) {
                outString += number + " ";
            }
        }

        System.out.println(outString);

    }
}
