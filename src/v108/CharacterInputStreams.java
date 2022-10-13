package v108;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
  Reader - BufferedReader    - LineNumberReader
         - CharArrayReader
         - InputStreamReader - FileReader
         - FilterReader      - PushbackReader
         - PipedReader
         - StringReader
 */
public class CharacterInputStreams {

    public static void main(String[] args) {
//        stringReaderExample();
//        charArrayReaderExample();
//        fileReaderExample();
//        bufferedReaderExample();
        bufferedReaderExampleWithStream();
    }

    private static void stringReaderExample() {
        StringReader reader = new StringReader("StringReader példa");
        try {
            int firstCode = reader.read();
            char[] moreChars = new char[11];
            int numOfChars = reader.read(moreChars);
            System.out.printf("Első karakter kódja: %d (%c)%n", firstCode, firstCode);
            System.out.println("A következő 11 karakter: " + Arrays.toString(moreChars));
            System.out.println("Beolvasott karakterek száma: " + numOfChars);

            System.out.print("A maradék: '");
            int code;
            while ((code = reader.read()) != -1) {
                char c = (char)code;
                System.out.print(c);
            }
            System.out.print("'\n");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void charArrayReaderExample() {
        CharArrayReader reader = new CharArrayReader("CharArrayReader példa".toCharArray());
        try {
            int firstCode = reader.read();
            char[] moreChars = new char[20];
            int numOfChars = reader.read(moreChars, 2, 8);
            System.out.printf("Első karakter kódja: %d (%c)%n", firstCode, firstCode);
            System.out.println("A következő 8 karakter: " + Arrays.toString(moreChars));
            System.out.println("Beolvasott karakterek száma: " + numOfChars);

            System.out.print("A maradék: '");
            int code;
            while ((code = reader.read()) != -1) {
                char c = (char)code;
                System.out.print(c);
            }
            System.out.print("'\n");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void fileReaderExample() {
        try (FileReader reader = new FileReader("input.txt")) {
            StringBuilder content = new StringBuilder();
            int code;
            while ((code = reader.read()) != -1) {
                //content = content + (char)code; // Ez nem valami hatékony
                content.append((char)code);
            }
            System.out.println("A fájl tartalma: \n" + content);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void bufferedReaderExample() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append('\n');
            }
            System.out.println("A fájl tartalma: \n" + content);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void bufferedReaderExampleWithStream() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String content = reader.lines().collect(Collectors.joining("\n"));
            System.out.println("A fájl tartalma: \n" + content);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}
