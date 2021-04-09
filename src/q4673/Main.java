package q4673;

class Main {

    static boolean[] array = new boolean[10001];

    public static void main(String args[]) {

        int n;

        for (int i = 1 ; i < 10001 ; i++) {
            n = d(i);
            if (n < 10001){
                array[n] = true;
            }
        }

        for (int i = 1 ; i < 10001 ; i++) {
            if(array[i] != true) {
                System.out.println(i);
            }
        }
    }

    static public int d(int number) {
        int sum = number;
        while(number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
