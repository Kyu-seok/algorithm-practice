package q10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println((N % H) * 100 + (N / H) + 1);
            }
        }

    }
}
