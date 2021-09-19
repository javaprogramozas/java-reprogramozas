package v23;

import java.util.Scanner;

public class TöbbszörösElágazás {

    public static void main(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.println("Osztályozó program\n");

        System.out.print("Elért pontszámod: ");
        int pontszám = beolvasó.nextInt();

        if (pontszám >= 85) {
            System.out.println("A dolgozatod kiváló");
        } else if (pontszám >= 75) {
            System.out.println("A dolgozatod jó");
        } else if (pontszám >= 63) {
            System.out.println("A dolgozatod közepes");
        } else if (pontszám >= 50) {
            System.out.println("A dolgozatod elégséges");
        } else {
            System.out.println("Elégtelen, megbuktál :(");
        }

        System.out.println("A program befejeződik...");
        beolvasó.close();
    }

}
