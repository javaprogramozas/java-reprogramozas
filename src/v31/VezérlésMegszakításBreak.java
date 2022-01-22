package v31;

import java.util.Scanner;

public class VezérlésMegszakításBreak {

    public static void main(String[] args) {

        Scanner beolvasó = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String sor = beolvasó.nextLine();
            if (sor.isBlank()) {
                break;
            }
            System.out.println(sor.length() + " karakter hosszú");
        }

        beolvasó.close();
    }

}
