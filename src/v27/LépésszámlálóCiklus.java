package v27;

import java.util.Scanner;

public class LépésszámlálóCiklus {

    public static void main(String[] args) {
        // Határozzuk meg az első N szám összegét
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szám = beolvasó.nextInt();

        int összeg = 0;
        for (int i = 1 ; i <= szám ; i += 2) {
            összeg += i;
        }
        /*
        int i = 1;
        while (i <= szám) {
            // Utasítások
            összeg += i;
            i++;
        }
         */

        System.out.println("Összeg: " + összeg);
    }
}
