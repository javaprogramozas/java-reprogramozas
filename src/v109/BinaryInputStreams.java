package v109;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
   InputStream - FilterInputStream - BufferedInputStream
                                   - DataInputStream
                                   - PushbackInputStream
               - ByteArrayInputStream
               - FileInputStream
               - ObjectInputStream
               - PipedInputStream
               - SequenceInputStream

 */
public class BinaryInputStreams {

    public static void main(String[] args) {
//        byteArrayInputStreamExample();
        fileInputStream();
        dataInputStreamExample();
    }

    private static void byteArrayInputStreamExample() {
        byte[] bytes = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        int aByte;
        while ((aByte = inputStream.read()) != -1) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        inputStream = new ByteArrayInputStream(bytes);
        try {
            byte[] threeBytes = inputStream.readNBytes(3);
            System.out.println("Első három: " + Arrays.toString(threeBytes));
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
        byte[] remainingBytes = inputStream.readAllBytes();
        System.out.println("Maradék: " + Arrays.toString(remainingBytes));
    }

    private static void fileInputStream() {
        try (FileInputStream inputStream = new FileInputStream("data.dat")) {
            int aByte;
            while ((aByte = inputStream.read()) != -1) {
                System.out.printf("%02x ", aByte);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void dataInputStreamExample() {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("data.dat"))){
            String hello = inputStream.readUTF();
            System.out.println(hello);
            byte aByte = inputStream.readByte();
            System.out.println(aByte);
            int anInt = inputStream.readInt();
            System.out.println(anInt);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}
