package v28;

import java.util.Scanner;

public class TöbbszörösElágazás3 {

    public static void main(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Első operandus: ");
        int operandus1 = beolvasó.nextInt();
        System.out.print("Második operandus: ");
        int operandus2 = beolvasó.nextInt();
        beolvasó.nextLine();

        System.out.print("Műveleti jel: ");
        String műveletiJel = beolvasó.nextLine();

        int eredmény = switch (műveletiJel) {
            case "+":
                System.out.println("összeadás");
                yield operandus1 + operandus2;
            case "-":
                yield operandus1 - operandus2;
            case "*":
                yield operandus1 * operandus2;
            case "%":
            case "/":
                yield operandus1 / operandus2;
            default:
                throw new IllegalArgumentException("Ismeretlen műveleti jel: " + műveletiJel);
        };

        System.out.println(operandus1 + " " + műveletiJel + " " + operandus2 + " = " + eredmény);

        beolvasó.close();
    }

    public static void main1(String[] args) {
        Scanner beolvasó = new Scanner(System.in);
        System.out.print("Év: ");
        int év = beolvasó.nextInt();
        System.out.print("Hónap: ");
        int hónap = beolvasó.nextInt();

        int napokSzámaAHónapban = switch (hónap) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                int eredmény;
                if (((év % 4 == 0)
                        && !(év % 100 == 0))
                        || (év % 400 == 0)) {
                    eredmény = 29;
                } else {
                    eredmény = 28;
                }
                yield eredmény;
            }
            default -> -1;
        };

        if (napokSzámaAHónapban != -1) {
            System.out.println(év + ". évben a " + hónap + ". hónap " + napokSzámaAHónapban + " napos volt");
        } else {
            System.out.println("Érvénytelen hónap: " + hónap);
        }

        beolvasó.close();
    }

}
