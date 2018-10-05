package Other.Generics.L1;

public class PairGen {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }

}

class Pair<T1, T2> {
    private final T1 value1;
    private final T2 value2;

    static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return new Pair<>(value1, value2);
    }

    T1 getFirst() {
        return value1;
    }

    T2 getSecond() {
        return value2;
    }

    boolean equals(Pair pair) {
        boolean res = true;

        Object newValue1 = pair.getFirst();
        Object newValue2 = pair.getSecond();

        if (value1 == null && newValue1 != null ||
                value1 != null && newValue1 == null ||
                value2 == null && newValue2 != null ||
                value2 != null && newValue2 == null) {
            return false;
        }
        if (value1 != null) {
            res = value1.equals(newValue1);
        }
        if (value2 != null) {
            res &= value2.equals(newValue2);
        }

        return res;
    }

    public int hashCode() {
        int code = 1;

        if (value1 != null) {
            code *= value1.hashCode();
        }

        if (value2 != null) {
            code *= value2.hashCode();
        }

        return code;
    }

    private Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}