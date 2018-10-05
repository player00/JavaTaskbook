package Other;

import java.util.function.DoubleUnaryOperator;

public class Integral {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double sum = 0;

        for (double i = a; i <= b; i += 0.00001) {
            sum += f.applyAsDouble(i)*0.00001;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }
}
