package v62;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        tryCatchFinallyBlock();
    }

    private static void tryCatchFinallyBlock() {
        Scanner input = new Scanner(System.in);
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
        input.close();
        System.out.println("Metódus vége");
    }

}
