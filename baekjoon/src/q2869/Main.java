package q2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B, V;

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        double day = (double) (V - A) / (A - B);
        int i = (int) Math.ceil(day);
        System.out.println(i+1);
    }

}
