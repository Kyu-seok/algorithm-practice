package q2588;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int a = firstNum/100;
        int b = (firstNum- a*100) /10;
        int c = (firstNum - a*100 - b*10);

        int d = secondNum/100;
        int e = (secondNum -d*100) / 10;
        int f = (secondNum - d*100 - e*10);

        System.out.println(firstNum*f);
        System.out.println(firstNum*e);
        System.out.println(firstNum*d);
        System.out.println(firstNum*secondNum);
    }
}
