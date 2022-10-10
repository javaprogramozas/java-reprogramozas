package v107;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
  OutputStream - ByteArrayOutputStream
               - FilterOutputStream - BufferedOutputStream
                                    - DataOutputStream
                                    - PrintStream
               - FileOutputStream
               - PipedOutputStream
               - ObjectOutputStream
 */
public class BinaryOutputStreams {

    public static void main(String[] args) {
        printStreamExample();
        byteArrayOutputStreamExample();
        fileOutputStream();
        dataOutputStream();
    }

    private static void printStreamExample() {
        try (PrintStream stream = new PrintStream("print.txt")) {
            stream.print("Ez itt egy");
            stream.println(" PrintStream példa");
            stream.println(33);
            stream.printf("Ez ismerős? %d", 42);
            stream.write(33);
        } catch (FileNotFoundException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void byteArrayOutputStreamExample() {
        byte[] bytes = new byte[]{72, 101, 108, 108, 111};
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        stream.writeBytes(bytes);
        stream.write(33);

        System.out.println(Arrays.toString(stream.toByteArray()));
        System.out.println(stream.toString(StandardCharsets.UTF_8));
    }

    private static void fileOutputStream() {
        byte[] bytes = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f};
        try (FileOutputStream stream = new FileOutputStream("hello.dat")) {
            stream.write(bytes);
            stream.write(33);
            stream.write(289);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void dataOutputStream() {
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("data.dat"))) {
            stream.writeUTF("Hello!");
            stream.writeByte(33);
            stream.writeInt(289);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}
