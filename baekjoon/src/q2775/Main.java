package q2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int ii = 0 ; ii < testCase; ii ++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] array = new int[15][15];

            for (int i = 0; i < 15; i++) {
                array[i][0] = 1;
                array[0][i] = i+1;
            }

            for (int i = 1 ; i < 15; i++) {
                for(int j = 1; j < 15; j++) {
                    int value = 0;
                    for( int z = 0; z <= j; z++) {
                        value += array[i-1][z];
                    }
                    array[i][j] = value;
                }
            }

            System.out.println(array[k][n-1]);

        }
    }
}
