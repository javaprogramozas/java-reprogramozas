package v122;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MemoryLeakDemo {
    private static final boolean LEAKY = true;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final List<String> NAMES;

    static {
        NAMES = generateRandomNames(10000);
    }

    public static void main(String[] args) {

        System.out.print("Start?");
        new Scanner(System.in).nextLine();

        Set<Person> people = new HashSet<>();

        int counter = 0;
        int threshold = 1;
        while (true) {
            try {
                Person person = generatePerson(LEAKY);
                people.remove(person);
                people.add(person);
                double averageAge = calculateAverageAge(people);
                if (threshold == counter) {
                    System.out.println("#" + counter + ". " + people.size() + " fő átlagéletkora: " + averageAge);
                    threshold *= 10;
                }
                counter++;
                if (counter < 50) {
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private static List<String> generateRandomNames(int length) {
        List<String> names = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            names.add(randomString(10));
        }
        return List.copyOf(names);
    }

    private static double calculateAverageAge(Set<Person> people) {
        return people.stream()
                .mapToLong(person -> person.getAge(LocalDate.now()))
                .average()
                .orElse(0);
    }

    private static Person generatePerson(boolean leaky) {
        String name = selectRandomName();
        LocalDate birthDate = getRandomDate();
        if (leaky) {
            return new LeakyPerson(name, birthDate);
        } else {
            return new ProperPerson(name, birthDate);
        }
    }

    private static String selectRandomName() {
        Random random = new Random();
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    private static LocalDate getRandomDate() {
        Random random = new Random();
        int year = 1920 + random.nextInt(100);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;
        return LocalDate.of(year, month, day);
    }

    public static String randomString(int length) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            char randomChar = ALPHABET.charAt(random.nextInt(ALPHABET.length()));
            builder.append(randomChar);
        }

        return builder.toString();
    }

}
