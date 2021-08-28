package v10;

public class Var {
    public static void main(String[] args) {
        // Lokális változók - típusfelismerés
        var intro = "Hello Java 10!";
        var összeg = 11.0;

        System.out.println(intro);
        System.out.println("Összeg: " + összeg);

        // Visszafelé kompatibilitás miatt a "var" _nem_ kulcsszó
        int var = 5;


        // -- Korlátozások --
        // Inicializálni kell
        //var nincsKezdőérték;

        // Nem lehet null érték
        //var nullÉrték = null;

    }
}
