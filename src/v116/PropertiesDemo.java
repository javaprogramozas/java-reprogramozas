package v116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo {

    // Properties file names
    public static final String DEFAULT_PROPERTIES = "default.properties";
    public static final String APPLICATION_PROPERTIES = "application.properties";

    // Property keys
    public static final String APPLICATION_NAME_PROPERTY = "application.name";
    public static final String APPLICATION_VERSION_PROPERTY = "application.version";
    public static final String USERNAME_PROPERTY = "user";
    public static final String MAGIC_NUMBER_PROPERTY = "magic";


    public static void main(String[] args) {
        Properties properties = loadProperties();

        String applicationName = properties.getProperty(APPLICATION_NAME_PROPERTY);
        String applicationVersion = properties.getProperty(APPLICATION_VERSION_PROPERTY);
        System.out.printf("Started %s (%s)%n", applicationName, applicationVersion);

        String user = properties.getProperty(USERNAME_PROPERTY, "dear stranger");
        System.out.println("Hello " + user);

        String magicNumber = properties.getProperty(MAGIC_NUMBER_PROPERTY);
        if (magicNumber == null) {
            askForMagicNumber(properties);
        } else {
            System.out.println("Your magic number is: " + magicNumber);
        }

        saveProperties(properties);
        System.out.println("Bye!");
    }

    private static void askForMagicNumber(Properties properties) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your magic number? ");
            int number = scanner.nextInt();
            properties.setProperty(MAGIC_NUMBER_PROPERTY, Integer.toString(number));
            System.out.println("Thanks, I will remember that!");
        }
    }

    private static Properties loadProperties() {
        Properties defaultProperties = new Properties();
        try (InputStream defaultPropertiesInputStream = PropertiesDemo.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTIES)) {
            defaultProperties.load(defaultPropertiesInputStream);
        } catch (IOException e) {
            System.out.println(DEFAULT_PROPERTIES + " not found!");
        }

        Properties properties = new Properties(defaultProperties);

        try (BufferedReader reader = Files.newBufferedReader(Path.of(APPLICATION_PROPERTIES))) {
            properties.load(reader);
        } catch (IOException ignored) {
            // No application.properties found, falling back to defaults only
        }
        return properties;
    }

    private static void saveProperties(Properties properties) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(APPLICATION_PROPERTIES))) {
            properties.store(writer, null);
        } catch (IOException e) {
            System.out.println("Failed to save " + APPLICATION_PROPERTIES);
        }
    }

}
