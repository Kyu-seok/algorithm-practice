package q8958;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int repeat = input.nextInt();

        for(int i = 0 ; i < repeat ; i++) {

            String result = input.next();
            char[] charResult = new char[result.length()];
            for (int j = 0 ; j < result.length() ; j++) {
                charResult[j] = result.charAt(j);
            }

            int sum = 0;
            int streak = 0;

            for (int k = 0 ; k < charResult.length ; k++) {
                if(charResult[k] == 'O') {
                    streak = streak + 1;
                }
                else {
                    streak = 0;
                }
                sum = sum + streak;
            }


            System.out.println(sum);
        }
    }
}
