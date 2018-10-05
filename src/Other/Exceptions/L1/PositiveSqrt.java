package Other.Exceptions.L1;

public class PositiveSqrt {

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalStateException("Expected non-negative number, got " + x);
        }

        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(sqrt(4.0));
        try {
            System.out.println(sqrt(-4.0));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
