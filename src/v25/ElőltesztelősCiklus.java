package v25;

import java.util.Scanner;

public class ElőltesztelősCiklus {

    public static void main(String[] args) {
        // Kérjünk be egy számot és írassuk ki a maximális tőle nem nagyobb 13-mal osztható számot

        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szám = beolvasó.nextInt();

        while (szám % 13 != 0) {
            szám--;
        }

        System.out.println("A legnagyobb 13-mal osztható szám: " + szám);

        beolvasó.close();
    }

}
