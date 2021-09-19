package v23;

import java.util.Scanner;

public class FeltételesElágazás {

    public static void main(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.println("Osztó program\n");

        System.out.print("Osztandó: ");
        int osztandó = beolvasó.nextInt();

        System.out.print("Osztó: ");
        int osztó = beolvasó.nextInt();

        if (osztó != 0) {
            int eredmény = osztandó / osztó;
            System.out.println("Osztás eredménye: " + eredmény);
        } else {
            System.out.println("0-val nem lehet osztani!");
        }

        System.out.println("A program befejeződik...");
        beolvasó.close();
    }
}
