package Other;

import java.math.BigInteger;

public class Factorial {

    private static BigInteger factorial(int value) {
        BigInteger bigInt = BigInteger.valueOf(value);
        if (1 == value) {
            return BigInteger.ONE;
        } else {
            return factorial(value - 1).multiply(bigInt);
        }
    }

    public static void main(String[] args) {
        System.out.print(factorial(3));
    }

}
