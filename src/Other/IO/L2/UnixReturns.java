package Other.IO.L2;

public class UnixReturns {

    static class Test {
        public byte[] bytes;
        public byte[] expectedBytes;

        Test(byte[] bytes, byte[] expectedBytes) {
            this.bytes = bytes;
            this.expectedBytes = expectedBytes;
        }
    }

    public static void main(String[] args) {
        boolean check = false;
//        Test[] tests = {
//                new Test(new byte[]{65, 66, 13, 13, 10, 10, 13, 67, 13, 13}, new byte[]{65, 66, 13, 10, 10, 13, 67, 13, 13}),
//                new Test(new byte[]{65, 13, 10, 10, 13}, new byte[]{65, 10, 10, 13}),
//                new Test(new byte[]{1, 2, 13, 10, 3, 4, 13, 10, 5, 6}, new byte[]{1, 2, 10, 3, 4, 10, 5, 6}),
//                new Test(new byte[]{1, 2, 3, 13, 10, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 10, 10, 4, 5, 6}),
//                new Test(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}),
//                new Test(new byte[]{13, 10, 1, 2, 3, 4, 5, 6}, new byte[]{10, 1, 2, 3, 4, 5, 6}),
//                new Test(new byte[]{1, 2, 3, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 10, 4, 5, 6}),
//                new Test(new byte[]{1, 2, 3, 4, 5, 6, 13, 10}, new byte[]{1, 2, 3, 4, 5, 6, 10}),
//                new Test(new byte[]{1, 2, 3, 13, 13, 10, 4, 5, 6}, new byte[]{1, 2, 3, 13, 10, 4, 5, 6}),
//                new Test(new byte[]{1, 2, 3, 10, 13, 4, 5, 6}, new byte[]{1, 2, 3, 10, 13, 4, 5, 6})
//        };
//        for (Test t :tests){
//            System.out.print("[");
//            for (byte b : t.bytes) {
//                if (check && b != 10) {
//                    System.out.print(13 + ", ");
//                }
//
//                if (b == 13) {
//                    check = true;
//                } else {
//                    System.out.print(b + ", ");
//                    check = false;
//                }
//            }
//            if (check) {
//                System.out.print(13);
//            }
//            System.out.print("]");
//            System.out.println();
//            System.out.println(Arrays.toString(t.expectedBytes));
//            check = false;
//        }
        try {
            int b = System.in.read();

            while (b != -1) {
                if (check && b != 10) {
                    System.out.write(13);
                }
                if (b == 13) {
                    check = true;
                } else {
                    System.out.write(b);
                    check = false;
                }
                b = System.in.read();
            }
            if (check) {
                System.out.write(13);
            }
        } catch (
                Exception e) {
        } finally {
            System.out.flush();
        }
    }
}