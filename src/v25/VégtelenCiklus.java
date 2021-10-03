package v25;

import java.util.Scanner;

public class VégtelenCiklus {

    public static void main(String[] args) {
        // Kérjünk be egy számot és írjuk ki a 100-nál kisebb többszöröseit

        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int osztó = beolvasó.nextInt();
        int többszörös = 0;

        while (többszörös < 100) {
            System.out.println(többszörös);
            többszörös += osztó;
        }

        beolvasó.close();
    }
}
