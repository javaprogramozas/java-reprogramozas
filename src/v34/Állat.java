package v34;

public class Állat {

    /*
        Alapértelmezett értékek
        Objektum -> null
        egész -> 0
        valós -> 0.0
        logikai -> false (hamis)
        char -> '\u0000'
     */

    static String származásiHely; // osztályváltozó

    static int állatokSzáma; // 0

    String név; // példányváltozó

    int tömeg;

    Állat(String aNév) {
        this(aNév, 0);
        System.out.println("Egy paraméteres konstruktor");
    }

    Állat(String aNév, int aTömeg) {
        név = aNév;
        tömeg = aTömeg;
        állatokSzámánakNövelése();
    }

    // példányszintű metódusok
    void eszik() {
        eszik(1);
    }

    // metódus túlterhelés - method overload
    void eszik(int növekmény) {
        tömeg = tömeg + növekmény;
    }

    String bemutatkozás() {
        return név + " a nevem, és " + tömeg + "g vagyok, származási helyem a " + származásiHely;
    }

    // osztályszintű metódusok
    static void állatokSzámánakNövelése() {
        állatokSzáma++;
    }
}
