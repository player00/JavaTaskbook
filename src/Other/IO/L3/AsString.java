package Other.IO.L3;

import java.io.*;
import java.nio.charset.Charset;

public class AsString {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader.readLine();
    }

    public static void main(String[] args) {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
//        InputStream inputStream = new ByteArrayInputStream("0123".getBytes());
        try {
            System.out.println(readAsString(inputStream, Charset.forName("ASCII")));
        } catch (Exception e) {
        }
    }
}