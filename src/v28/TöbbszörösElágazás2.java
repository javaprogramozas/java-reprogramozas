package v28;

import java.util.Scanner;

public class TöbbszörösElágazás2 {

    public static void main2(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Első operandus: ");
        int operandus1 = beolvasó.nextInt();
        System.out.print("Második operandus: ");
        int operandus2 = beolvasó.nextInt();
        beolvasó.nextLine();

        System.out.print("Műveleti jel: ");
        String műveletiJel = beolvasó.nextLine();

        boolean hibásEredmény = false;
        int eredmény = 0;
        switch (műveletiJel) { // char, byte, short, int, "boxing" típusok, String, enum
            case "+" -> eredmény = operandus1 + operandus2;
            case "-" -> eredmény = operandus1 - operandus2;
            case "*" -> eredmény = operandus1 * operandus2;
            case "/" -> eredmény = operandus1 / operandus2;
            default -> {
                System.out.println("Ismeretlen műveleti jel: " + műveletiJel);
                hibásEredmény = true;
            }
        }

        if (!hibásEredmény) {
            System.out.println(operandus1 + " " + műveletiJel + " " + operandus2 + " = " + eredmény);
        }
        beolvasó.close();
    }

    public static void main(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Év: ");
        int év = beolvasó.nextInt();
        System.out.print("Hónap: ");
        int hónap = beolvasó.nextInt();

        int napokSzámaAHónapban = 0;

        switch (hónap) {
            case 1, 3, 5, 7, 8, 10, 12 -> napokSzámaAHónapban = 31;
            case 4, 6, 9, 11 -> napokSzámaAHónapban = 30;
            case 2 -> {
                if (((év % 4 == 0)
                        && !(év % 100 == 0))
                        || (év % 400 == 0)) {
                    napokSzámaAHónapban = 29;
                } else {
                    napokSzámaAHónapban = 28;
                }
            }
            default -> System.out.println("Nincs ilyen hónap!");
        }
        System.out.println(év + ". évben a " + hónap + ". hónap " + napokSzámaAHónapban + " napos volt");
        beolvasó.close();
    }

}
