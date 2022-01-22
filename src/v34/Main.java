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
        csiga = new Állat(); // példányosítás -> konstruktor
        csiga.név = "Oszkár";
        csiga.tömeg = 20;

        Állat madár = new Állat();
        madár.név = név;
        madár.tömeg = szám * 2;
        //Állat.származásiHely = "Mars";

        Állat kutya = new Állat();
        kutya.név = null;

        System.out.println(csiga.név + " a nevem, és " + csiga.tömeg + "g vagyok, származási helyem a " + Állat.származásiHely);
        System.out.println(madár.név + " a nevem, és " + madár.tömeg + "g vagyok, származási helyem a " + Állat.származásiHely);
        System.out.println(kutya.név + " a nevem, és " + kutya.tömeg + "g vagyok, származási helyem a " + Állat.származásiHely);
    }
}
