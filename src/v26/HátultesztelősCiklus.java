package v26;

import java.util.Random;

public class HátultesztelősCiklus {

    public static void main(String[] args) {
        // Írjunk programot ami dobókockával való dobást szimulál adott feltételig
        Random véletlenszámGenerátor = new Random();
        int dobás;
        do {
            dobás = véletlenszámGenerátor.nextInt(6) + 1;
            System.out.print(dobás + " ");
        } while (dobás != 6);

        System.out.println("\nProgram vége");
    }
}
