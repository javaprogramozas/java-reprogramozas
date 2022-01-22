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
        int szám;
        String név;
        Állat csiga;

        szám = 1;
        név = "Zoltán";
        csiga = new Állat(); // példányosítás -> konstruktor
        Állat madár = new Állat();

        System.out.println(szám);
        System.out.println(név);
        System.out.println(csiga);
        System.out.println(madár);
        System.out.println(csiga == madár);
    }
}
