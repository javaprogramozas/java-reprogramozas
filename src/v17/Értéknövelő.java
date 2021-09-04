package v17;

public class Értéknövelő {
    public static void main(String[] args) {
        // Értéknövelő és csökkentő operátorok
        int a = 5;
        System.out.println("a = " + a);

        int b = a++;
        System.out.println("a = " + a + ", b = " + b);

        int c = ++a;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int d = a++ + ++a;
        System.out.println("a = " + a + ", d = " + d);

        boolean e = (d < 10) && (((a++) % 2) == 0);
        System.out.println("a = " + a + ", e = " + e);

        boolean f = (d > 10) && (((a++) % 2) == 0);
        System.out.println("a = " + a + ", f = " + f);

        a++;
        System.out.println("a = " + a);

    }
}
