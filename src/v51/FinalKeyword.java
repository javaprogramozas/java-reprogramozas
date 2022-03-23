package v51;

import java.util.Scanner;

public class FinalKeyword {

    public static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        System.out.print("Enter number of minutes: ");
        Scanner input = new Scanner(System.in);
        int inputMinutes = input.nextInt();
        changeMinutesToSeconds(inputMinutes);
        input.close();

        final int age;
        age = 18 * inputMinutes;
        System.out.println(age);

        final Cat tom = new Cat("Tom");
        System.out.println(tom.getName());
        tom.setName("Cirmi");
        System.out.println(tom.getName());
        inputMinutes = 0;
    }

    private static void changeMinutesToSeconds(final int minutes) {
        int seconds = minutes * SECONDS_IN_MINUTE;
        System.out.printf("%d minutes are %d seconds%n", minutes, seconds);
    }

}
