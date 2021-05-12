package q1193;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int cross_count = 1, prev_count_sum = 0;

        while(true) {

            //직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (number <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {
                    System.out.print((cross_count - (number - prev_count_sum - 1)) + "/" + (number - prev_count_sum));
                    break;
                }

                else {
                    System.out.print((number - prev_count_sum) + "/" + (cross_count - (number - prev_count_sum)));
                    break;
                }

            } else {
               prev_count_sum += cross_count;
               cross_count++;
            }
        }
    }
}
