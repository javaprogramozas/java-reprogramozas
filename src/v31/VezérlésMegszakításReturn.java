package v31;

import java.util.Scanner;

public class VezérlésMegszakításReturn {

    public static void main(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int megadottSzám = beolvasó.nextInt();

        int elsőOsztó = elsőOsztó(megadottSzám);

        if (elsőOsztó > 0) {
            System.out.println(megadottSzám + " legkisebb osztója: " + elsőOsztó);
        } else {
            System.out.println(megadottSzám + " számnak nincs 100-nál kisebb osztója");
        }

        beolvasó.close();
    }

    public static int elsőOsztó(int szám) {
        for (int osztó = 2; osztó < 100; osztó++) {
            if (szám % osztó == 0) {
                return osztó;
            }
        }
        return -1;
    }

}
