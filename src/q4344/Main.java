package q4344;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        for(int i = 0 ; i < testCase ; i++) {
            int arraySize = input.nextInt();
            float[] resultArray = new float[arraySize];

            float sum = 0;
            for (int j = 0; j < arraySize ; j++) {
                resultArray[j] = input.nextFloat();
                sum = sum + resultArray[j];
            }

            float average = sum / (float) arraySize;
            int overAverage = 0 ;

            for (int k = 0 ; k < arraySize ; k++) {
                if(resultArray[k] > average) {
                    overAverage = overAverage + 1;
                }
            }
            float ans =  ((float)overAverage / (float)arraySize)*100;
            System.out.printf("%2.3f%%\n", ans);
        }
    }
}
