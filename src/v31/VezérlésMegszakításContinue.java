package v31;

import java.util.Scanner;

public class VezérlésMegszakításContinue {

    public static void main(String[] args) {

        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int osztó = beolvasó.nextInt();

        for (int i = 1; i < 50; i++) {

            if (i % osztó == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
