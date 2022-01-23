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

    private String név; // példányváltozó

    protected int tömeg;

    double sebesség;

    private boolean jóllakott;

    public Állat() {
    }

    public Állat(String aNév) {
        this(aNév, 0);
        System.out.println("Egy paraméteres konstruktor");
    }

    public Állat(String aNév, int aTömeg) {
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
        if (növekmény > tömeg * 0.1) {
            jóllakott = true;
        }
    }

    String bemutatkozás() {
        return név + " a nevem, és " + tömeg + "g vagyok, származási helyem a " + származásiHely;
    }

    public String nevem() {
        return név;
    }

    // osztályszintű metódusok
    static void állatokSzámánakNövelése() {
        állatokSzáma++;
    }
}
