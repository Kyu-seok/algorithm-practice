package q1545;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float[] scores = new float[input.nextInt()];
        float highScore = 0;
        float sum = 0;

        for (int i = 0 ; i < scores.length ; i++) {         //save array of scores and find the highest score
            scores[i] = input.nextFloat();
            if(highScore < scores[i]) {
                highScore = scores[i];
            }
            sum += scores[i];
        }

        System.out.println((sum * 100 / highScore)/scores.length);
    }
}
