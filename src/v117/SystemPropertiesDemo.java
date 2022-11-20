package v117;

import java.util.Comparator;
import java.util.Map;

public class SystemPropertiesDemo {

    public static void main(String[] args) {
        systemProperties();
        environmentVariables();
    }

    private static void systemProperties() {
        // JVM beállítások
        System.getProperties().entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getKey().toString()))
                .forEach(entry -> System.out.printf("%s = %s%n", entry.getKey(), entry.getValue()));

        System.out.println();
        System.out.println("Felhasználó: " + System.getProperty("user.name"));
        System.out.println("Java verzió: " + System.getProperty("java.version"));
        System.out.println("Saját beállítás: " + System.getProperty("myproperty", "undefined"));
    }

    private static void environmentVariables() {
        // Környezeti változók
        System.getenv().entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%s = %s%n", entry.getKey(), entry.getValue()));

        System.out.println();
        System.out.println("Felhasználó: " + System.getenv("USERNAME"));
        System.out.println("Java könyvtár: " + System.getenv("JAVA_HOME"));
        System.out.println("Saját beállítás: " + System.getenv("MYPROPERTY"));
    }

}
