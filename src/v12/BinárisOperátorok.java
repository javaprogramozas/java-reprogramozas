package v12;

public class BinárisOperátorok {

    public static void main(String[] args) {

        // Aritmetikai operátorok egész számokon
        int összadás = 5 + 2;
        int kivonás = 17 - 6;
        int szorzás = 3 * 4;
        int egészOsztás = 20 / 3;
        int maradékosOsztás = 18 % 7;

        System.out.println("\n5 + 2 = " + összadás + "\n" +
                "17 - 6 = " + kivonás + "\n" +
                "3 * 4 = " + szorzás + "\n" +
                "20 / 3 = " + egészOsztás + "\n" +
                "18 % 7 = " + maradékosOsztás);

        // Aritmetikai operátorok lebegőpontos számokon
        double lÖsszeadás = 5.3 + 2.1;
        double lKivonás = 17.68 - 6.6;
        double lSzorzás = 30.15 * 0.5;
        double lOsztás = 20.0 / 3.0;
        double lMaradékosOsztás = 18.0 % 7.5;

        System.out.println("\n5.3 + 2.1 = " + lÖsszeadás + "\n" +
                "17.68 - 6.6 = " + lKivonás + "\n" +
                "30.15 * 0.5 = " + lSzorzás + "\n" +
                "20.0 / 3.0 = " + lOsztás + "\n" +
                "18.0 % 7.5 = " + lMaradékosOsztás);

        // Változók aritmetikai kifejezésekben
        int kifejezés1 = összadás * 2;
        int kifejezés2 = összadás + kivonás - szorzás;

        double kifejezés3 = lÖsszeadás * lKivonás / lSzorzás;

        // Stringek összefűzése
        String hello = "Hello";
        String világ = "World!";

        String eredmény = hello + " " + világ;
        System.out.println(eredmény);

        String sokFelkiáltójeles = eredmény + '!';
        System.out.println(sokFelkiáltójeles);

        // Aritmetikai műveletek összevonása értékadással
        int egész = 1;
        egész = egész + 4;
        // egész += 4; // += -= *= /= %=

        System.out.println("Egész: " + egész);
    }

}
