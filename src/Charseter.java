import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Charseter {
    public static void main(String[] args) {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        int bytes;
        int a;
        List<Byte> list = new ArrayList<>();

        while ((bytes = inputStream.read())!=-1) {
            list.add((byte) bytes);
        }

        byte[] b = new byte[list.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }
        String readAsString = new String(b, charset);


        return readAsString;

    }
}
