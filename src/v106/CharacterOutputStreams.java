package v106;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
 Writer - BufferedWriter
        - CharArrayWriter
        - OutputStreamWriter - FileWriter
        - FilterWriter
        - PipedWriter
        - PrintWriter
        - StringWriter
 */
public class CharacterOutputStreams {

    public static void main(String[] args) {

        stringWriterExample();
        charArrayWriterExample();
        fileWriterExample();
        printWriterExample();
        chaining();
    }

    private static void stringWriterExample() {
        StringWriter writer = new StringWriter();

        writer.write("Ez ");
        writer.write('a');
        writer.append(" StringWriter").append(" példa");
        writer.write(33);

        String result = writer.toString();
        System.out.println(result);
    }

    private static void charArrayWriterExample() {
        CharArrayWriter writer = new CharArrayWriter();

        try {
            writer.write("Ez ");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
        writer.write('a');
        writer.append(" CharArrayWriter").append(" példa");
        writer.write(0x21);

        char[] characters = writer.toCharArray();
        System.out.println(Arrays.toString(characters));
    }

    private static void fileWriterExample() {
        try (FileWriter writer = new FileWriter("out.txt", StandardCharsets.ISO_8859_1, true)) {
            writer.write("Ez ");
            writer.write('a');
            writer.append(" FileWriter").append(" példa");
            System.out.println("Filewriter kész");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void printWriterExample() {
        try (PrintWriter writer = new PrintWriter("print.txt")) {
            writer.println("Ez itt egy PrintWriter!");
            writer.println(33);
            writer.printf("A %s oldalainak száma %d%n", "négyzet", 4);
            System.out.println("PrintWriter kész");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

    private static void chaining() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("chain.txt"))))) {
            writer.println("A különböző writereket egymás után is fűzhetjük");
            writer.println("Minden egyes réteg tulajdonságait kihasználva");
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}
