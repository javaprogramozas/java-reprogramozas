package v62;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            String text = catchOrThrow("valami.txt");
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("A megadott fájl nem létezik!");
        }
    }

    private static void tryCatchFinallyBlock() {
        try (Scanner input = new Scanner(System.in)) {
            do {
                try {
                    System.out.print("Adj meg egy számot: ");
                    int number = Integer.parseInt(input.nextLine());
                    int result = 100 / number;
                    System.out.printf("100 / %d = %d%n", number, result);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nem megfelelő input");
                } catch (ArithmeticException e) {
                    System.out.println("0-val nem lehet osztani");
                    break;
                }
            } while (true);
        }
        System.out.println("Metódus vége");
    }

    private static String catchOrThrow(String filename) throws FileNotFoundException {
        FileReader reader = new FileReader(filename);
        try {
            StringWriter writer = new StringWriter();
            reader.transferTo(writer);
            return writer.toString();
        } catch (IOException e) {
            return "";
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {}
            }
        }
    }

    private static String tryWithResources(String filename) {
        try (FileReader reader = new FileReader(filename);
             StringWriter writer = new StringWriter()) {
            reader.transferTo(writer);
            return writer.toString();
        } catch (IOException e) {
            return "";
        } finally {
            System.out.println("Végre vége..");
        }
    }

}
