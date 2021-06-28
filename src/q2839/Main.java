package q2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        br.close();

        if (number == 4 || number == 7) {
            System.out.println(-1);
        }
        else if (number % 5 == 0) {
            System.out.println(number / 5);
        }
        else if (number % 5 == 1 || number % 5 == 3) {
            System.out.println((number / 5) + 1);
        }
        else if (number % 5 == 2 || number % 5 == 4) {
            System.out.println((number / 5) + 2);
        }
    }
}
