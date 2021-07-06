package q8393;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int result = 0;

        for (int i = 0; i < number + 1; i++) {
            result = i + result;
        }
        System.out.println(result);
    }
}
