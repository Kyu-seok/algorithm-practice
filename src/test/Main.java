package test;

import java.lang.Number;
import java.math.BigInteger;

class Main {
    public static void main(String args[]) {
        BigInteger resultPower = new BigInteger("5");
        BigInteger resultFactorial = new BigInteger("1");

        resultPower = resultPower.pow(99);

        for (int i = 99 ; i > 0 ; i--) {
           resultFactorial = resultFactorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("result of 5 ^ 99: " +resultPower );
        System.out.println("result of 99!: " + resultFactorial);
    }
}
