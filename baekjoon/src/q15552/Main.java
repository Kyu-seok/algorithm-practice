package q15552;

import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //String s = bf.readLine(); //String
        int n = Integer.parseInt(bf.readLine()); //Int
        int a, b, result;
        String out;

        for (int i = 0; i < n ; i++) {
            String s = bf.readLine(); //String
            StringTokenizer st = new StringTokenizer(s , " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            result = a + b;
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();

    }
}
