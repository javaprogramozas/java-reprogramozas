package v21;

public class Szűkítés {
    public static void main(String[] args) {
        byte bájt = 1;
        int egész;
        long hosszúEgész = 123;
        double hosszúValós;

        // Explicit típus konverzió
        egész = (int)hosszúEgész;
        byte x = (byte)(bájt + bájt);

        // Explicit konverzió lehet szűkítés és bővítés is!
        //hosszúEgész = (long)egész;

        // double -> float: IEEE kerekítés
        hosszúValós = 340282346638599000000000000000000000000.0;
        float valós = (float)hosszúValós;
        System.out.println("double -> float");
        System.out.printf("double %f\nfloat  %f\n\n", hosszúValós, valós);

        // double, float -> long: kerekítés 0 felé
        hosszúValós = 9223372036854775900.001;
        hosszúEgész = (long)hosszúValós;
        System.out.println("double, float -> long");
        System.out.printf("double %f\nlong   %d\n\n", hosszúValós, hosszúEgész);

        // double, float -> int: kerekítés 0 felé
        egész = (int)hosszúValós;
        System.out.println("double, float -> int");
        System.out.printf("double %f\nint    %d\n\n", hosszúValós, egész);

        // egész típus -> kisebb egész típus: a legszignifikánsabb bitek levágásra kerülnek
        hosszúEgész = 2147483648L;
        egész = (int)hosszúEgész;
        System.out.println("long -> int");
        System.out.printf("long %d %s\nint %d %s\n\n", hosszúEgész, padding(hosszúEgész), egész, padding(egész));

        System.out.println("int -> byte");
        int n = 255;
        byte o = (byte)n;
        System.out.printf("int  %d\nbyte %d\n\n", n, o);

        int p = 1385;
        byte q = (byte)p;
        System.out.println("p = " + padding(p) + " (" + p + ")");
        System.out.println("q =                         " + padding(q) + "  (" + q + ")");
        System.out.println();

        // lebegőpontos -> egész: először long v. int-re konvertálódik, majd onnan a céltípusra
        System.out.println("float -> int");
        float r = 1385.12f;
        int s = (int)r;
        byte t = (byte)r;
        System.out.println("float " + r + "\nint   " + s + "\nbyte  " + t);
    }

    private static String padding(byte number) {
        String binary = Integer.toBinaryString(number);
        return String.format("%8s", binary).replace(' ', '0');
    }

    private static String padding(int number) {
        String binary = Integer.toBinaryString(number);
        return String.format("%32s", binary).replace(' ', '0');
    }

    private static String padding(long number) {
        String binary = Long.toBinaryString(number);
        return String.format("%32s", binary).replace(' ', '0');
    }
}
