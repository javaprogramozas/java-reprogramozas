package v110;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        // relatív fájl a futtatás helyéhez képest
        File inputTxt = new File("input.txt");

        System.out.println("Saját könyvtárban: " + inputTxt.getAbsolutePath());

        // abszolút hivatkozás a könyvtárra, teljes elérési úttal
        File projectDirectory = new File("E:\\development\\java-reprogramozás");
        File anotherDirectory = new File("/development/java-reprogramozás");
        System.out.println("Projekt könyvtár: " + anotherDirectory.getAbsolutePath());

        // relatív hivatkozás a megadott könyvtárhoz képest
        inputTxt = new File(projectDirectory, "input.txt");
        System.out.println("Relatív: " + inputTxt.getAbsolutePath());

        // Szülő könyvtár lekérdezése
        System.out.println("Szülő: " + inputTxt.getParent());

        // Fájl/könyvtár létezésének lekérdezése
        System.out.println("Input.txt létezik: " + inputTxt.exists());
        System.out.println("Projekt könyvtár létezik: " + anotherDirectory.exists());

        File newDirectory = new File("examples.dir");
        System.out.println(newDirectory.getAbsolutePath() + " létezik: " + newDirectory.exists());
        //könyvtár létrehozása
        boolean success = newDirectory.mkdir();
        String message = "Könyvtár létrehozás " + (success ? "sikerült" : "nem sikerült");
        System.out.println(message);
        System.out.println(newDirectory.getAbsolutePath() + " létezik: " + newDirectory.exists());

        File newFile = new File(newDirectory, "test");
        // Fájl létrehozása
        success = newFile.createNewFile();
        message = "Fájl létrehozás " + (success ? "sikerült" : "nem sikerült");
        System.out.println(message);

        try (PrintWriter writer = new PrintWriter(newFile)) {
            writer.println("Ez egy új szöveges fájl tartalma...");
        }

        File dataSource = new File(newDirectory, "../data.dat");
        System.out.println("Abszolút: " + dataSource.getAbsolutePath());
        System.out.println("Kanonikus: " + dataSource.getCanonicalPath());

        // Átmeneti fájl létrehozása
        File tempFile = File.createTempFile("test", ".txt", newDirectory);
        //tempFile.deleteOnExit();
        System.out.println(tempFile.getAbsolutePath());

        try (PrintWriter writer = new PrintWriter(tempFile)) {
            writer.println("Ez egy átmeneti szöveges fájl tartalma...");
        }

        System.out.println(" ------------ ");
        for (File file : projectDirectory.listFiles((dir, name) -> name.startsWith("example"))) {
            System.out.println(file.getName());
        }
    }

}
