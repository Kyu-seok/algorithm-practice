package q10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int fabonacciNumber = fabonacci(n);
        System.out.println(fabonacciNumber);

    }

    static int fabonacci(int n) {

       if(n ==  0) {
           return 0;
       } else if(n == 1) {
           return 1;
       }

        return fabonacci(n-1) + fabonacci(n-2);
    }
}
