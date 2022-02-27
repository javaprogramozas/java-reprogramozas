package v48;

import v47.Person;

/**
 * Szabályok:
 * Reflexív: bármely objektum egyenlő önmagával -> x.equals(x)
 * Szimmetrikus: ha egy objektum egyenlő egy másikkal, akkor az fordítva is igaz -> x.equals(y) == y.equals(x)
 * Tranzitív: ha x.equals(y) és y.equals(z) akkor x.equals(z)
 * Konzisztens: egy objektumon többszöri equals hívás ugyanazzal a paraméterrel mindig ugyanazt adja vissza
 *              mindaddig amíg egyik objektum se változott.
 * Null egyenlőség: egyetlen objektum se egyenlő null-lal, azaz mindig !x.equals(null)
 * equals és hashCode: ha x.equals(y) akkor x.hashCode() == y.hashCode(),
 *                     de ha x.hashCode() == y.hashCode() akkor nem feltétlenül x.equals(y)
 */
public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person astronaut = new Person("Neil Armstrong", "astronaut",1930);
        Person astronautClone = new Person("Neil Armstrong", "astronaut",1930);
        Person physicist = new Person("Stephen Hawking", "theoretical physicist", 1942);
        Person hockeyPlayer = new Person("Neil Armstrong", "ice hockey player", 1932);
        Person copy = astronaut;

        System.out.println("astronaut == astronaut -> " + (astronaut == astronaut));
        System.out.println("astronaut == physicist -> " + (astronaut == physicist));
        System.out.println("astronaut == clone -> " + (astronaut == astronautClone));
        System.out.println("astronaut == copy -> " + (astronaut == copy));
        System.out.println();

        System.out.println("astronaut equals astronaut -> " + (astronaut.equals(astronaut)));
        System.out.println("astronaut equals physicist -> " + (astronaut.equals(physicist)));
        System.out.println("astronaut equals clone -> " + (astronaut.equals(astronautClone)));
        System.out.println("astronaut equals hockey player -> " + (astronaut.equals(hockeyPlayer)));
    }


}
