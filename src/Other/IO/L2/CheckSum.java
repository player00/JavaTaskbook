package Other.IO.L2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSum {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int b = inputStream.read();

        while (b != -1) {
            System.out.println(b);
            sum = Integer.rotateLeft(sum, 1) ^ b;
            b = inputStream.read();
        }

        return sum;
    }

    public static void main(String[] args) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01});
        try {
            System.out.println(checkSumOfStream(byteArrayInputStream));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
