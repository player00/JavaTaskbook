package Other;

public class Complex {

    public static final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        public String toString() {
            return re + " + " + im + "i";
        }

        public boolean equals(Object obj) {
            if (obj instanceof ComplexNumber) {
                return Double.compare(re, ((ComplexNumber) obj).getRe()) == 0 && Double.compare(im, ((ComplexNumber) obj).getIm()) == 0;
            } else {
                return false;
            }
        }

        public int hashCode() {
            return Double.hashCode(re) + Double.hashCode(im);
        }
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(1, 1.1);
        ComplexNumber complexNumber2 = new ComplexNumber(1, 1);
        System.out.println(complexNumber1.equals(complexNumber2));
    }
}
