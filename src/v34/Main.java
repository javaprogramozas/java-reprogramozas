package v34;

public class Main {

    /**
     * Objektum orientált programozás (Object Oriented Programming - OOP)
     *
     * Objektum:
     *  - tulajdonságok + viselkedés (példányváltozók + metódusok)
     *  - megvalósítja az egységbe zárást
     *  - van identitása
     *
     * A program nem más mint objektumok közötti interakció
     *
     * Java -> (nem tisztán) OOP nyelv
     *
     * Osztály:
     *  - "tervrajzok", az objektumok leírásai
     *  - metódusok és adattagok formájában írják le az objektumot
     *  - az osztály példányai az objektumok (példányosítás)
     */

    public static void main(String[] args) {
        int szám = 1;
        String név;
        Állat csiga;

        név = "Zoltán";
        csiga = new Állat("Oszkár", 20); // példányosítás -> konstruktor
        Állat.állatokSzámánakNövelése();

        Állat madár = new Állat(név, szám * 2);
        //Állat.származásiHely = "Mars";

        Állat kutya = new Állat(null);
        //kutya.név = null;

        csiga.eszik();
        madár.eszik(3 + szám);
        kutya.tömeg = 100;
        kutya.sebesség = 10;
        //kutya.jóllakott = false;

        String csigaBemutatkozás = csiga.bemutatkozás() + "!";
        //kutya.bemutatkozás();

        System.out.println(csigaBemutatkozás);
        System.out.println(madár.bemutatkozás());
        System.out.println(kutya.nevem() + " a nevem, és " + kutya.tömeg + "g vagyok, származási helyem a " + Állat.származásiHely);
        System.out.println(Állat.állatokSzáma);
    }
}
