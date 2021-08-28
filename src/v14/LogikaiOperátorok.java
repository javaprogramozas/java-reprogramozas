package v14;

public class LogikaiOperátorok {

    public static void main(String[] args) {
        // Logikai operátorok
        int életkor = 20;
        int sörökSzáma = 0;
        boolean felnőtt = életkor >= 18;
        boolean vanSör = sörökSzáma > 0;
        boolean szombatVan = true;
        boolean vasárnapVan = false;

        boolean és = felnőtt && vanSör;      // false
        boolean vagy = szombatVan || vasárnapVan; // true
        boolean kizáróVagy = true ^ true;         // false

        // Rövidzár kiértékelés
        boolean b = (életkor > 15) && (sörökSzáma == 0);

        // Feltételes kifejezés
        // 'logikai kifejezés' ? 'érték ha igaz' : 'érték ha hamis'
        int alma = 30, körte = 5;
        int nagyobb = alma > körte ? alma : körte;
        System.out.println("Nagyobb szám: " + nagyobb);

        int vizsgajegy = 3;
        String vizsgaEredmény = vizsgajegy == 1 ? "Megbuktál..." : "Átmentél!";
        System.out.println(vizsgaEredmény);

        // String helytelen = vizsgajegy > 1 ? "" : 10.3;

        // +Bitműveletek
    }
}
