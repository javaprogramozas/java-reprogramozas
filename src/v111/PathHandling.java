package v111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PathHandling {

    public static void main(String[] args) throws IOException {

        // relatív fájl a futtatás helyéhez képest
        Path inputTxt = Path.of("input.txt");

        System.out.println("Saját könyvtárban: " + inputTxt.toAbsolutePath());

        // abszolút hivatkozás a könyvtárra, teljes elérési úttal
        Path projectDirectory = Path.of("E:\\development\\java-reprogramozás");
        Path anotherDirectory = Path.of("/development/java-reprogramozás");
        Path assembledFile = Path.of("E:","development", "java-reprogramozas", "input.txt");
        System.out.println("Projekt könyvtár (\\): " + projectDirectory);
        System.out.println("Projekt könyvtár (/): " + anotherDirectory);
        System.out.println("Összerakott: " + assembledFile);

        // relatív hivatkozás a megadott könyvtárhoz képest
        System.out.println("Relatív: " + projectDirectory.resolve(inputTxt));
        System.out.println();

        // Szülő könyvtár lekérdezése
        System.out.println("Név: " + inputTxt.getFileName());
        System.out.println("Szülő: " + inputTxt.getParent());
        System.out.println("Gyökér (kötet): " + inputTxt.getRoot());
        System.out.println("Count: " + inputTxt.getNameCount());
        System.out.println();
        System.out.println("Név: " + inputTxt.toAbsolutePath().getFileName());
        System.out.println("Szülő: " + inputTxt.toAbsolutePath().getParent());
        System.out.println("Gyökér (kötet): " + inputTxt.toAbsolutePath().getRoot());
        System.out.println("Count: " + inputTxt.toAbsolutePath().getNameCount());
        System.out.println("Subpath: " + inputTxt.toAbsolutePath().subpath(1, 2));
        System.out.println();

        // Fájl/könyvtár létezésének lekérdezése
        System.out.println("Input.txt létezik: " + Files.exists(inputTxt));
        System.out.println("Projekt könyvtár létezik: " + Files.exists(projectDirectory));

        Path newDirectory = Path.of("examples.dir");
        System.out.println(newDirectory.toAbsolutePath() + " létezik: " + Files.exists(newDirectory));

        //könyvtár létrehozása
        if (!Files.exists(newDirectory)) {
            Path createdDirectory = Files.createDirectory(newDirectory);
            System.out.println("A létrehozott könyvtár: " + createdDirectory);
            System.out.println(newDirectory.toAbsolutePath() + " létezik: " + Files.exists(newDirectory));
        }

        Path newFile = newDirectory.resolve(Path.of("test"));
        // Fájl létrehozása
        if (!Files.exists(newFile)) {
            Path createdFile = Files.createFile(newFile);
            System.out.println("A létrehozott fájl: " + createdFile);
            Files.writeString(createdFile, "Ez egy új szöveges fájl tartalma...");
        }

        System.out.println();
        Path dataSource = Path.of(newDirectory.toString(), "../data.dat");
        System.out.println("Eredeti: " + dataSource);
        System.out.println("Abszolút: " + dataSource.toAbsolutePath());
        System.out.println("Normalizált: " + dataSource.normalize());
        System.out.println("Valódi: " + dataSource.toRealPath());

        // Átmeneti fájl létrehozása
        Path tempFile = Files.createTempFile("test", ".txt");
        tempFile.toFile().deleteOnExit();
        System.out.println(tempFile.toAbsolutePath());

        Files.writeString(tempFile, "Ez egy átmeneti szöveges fájl tartalma...");

        System.out.println(" ------------ ");
        try (Stream<Path> list = Files.list(projectDirectory)) {
            list.forEach(System.out::println);
        }
        System.out.println(" ------------ ");

        try (Stream<String> lines = Files.lines(newFile)) {
            lines.forEach(System.out::println);
        }
    }
}
