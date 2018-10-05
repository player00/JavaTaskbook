package Other.Exceptions.L1;

public class ClassCaller {

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();

        if (stes.length < 4) {
            return null;
        }

        String[] temp = stes[stes.length - 1].toString().replaceAll("\\(.*\\)$", "").split("\\.");

        temp = stes[3].toString().replaceAll("\\(.*\\)$", "").split("\\.");

        String res = "";
        for (int i = 0; i < temp.length - 1; i++) {
            res += temp[i] + ".";
        }
        res = res.replaceAll("\\.$", "#");

        res += temp[temp.length - 1];

        return res;
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

//    public static void main(String[] args) {
//        System.out.println(getCallerClassAndMethodName()); //null
//        anotherMethod();                                   //org.stepic.java.example.Test#main
//    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }

}

