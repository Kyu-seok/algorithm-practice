package q11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_number = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2,input_number)-1)).append('\n');
        hanoi(input_number, '1', '3', '2');

        System.out.println(sb);
    }

    public static void hanoi( int n, char from, char to, char aux) {
        if(n==1) {
            sb.append(from+ " " + to+"\n");
            return;
        }
        hanoi(n-1, from, aux, to);
        sb.append(from+ " " + to+"\n");
        hanoi(n-1, aux, to, from);
    }
}
