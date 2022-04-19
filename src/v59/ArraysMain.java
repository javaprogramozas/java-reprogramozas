package v59;

import v51.Cat;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {

//        simpleArray();
//        processAnArray();
//        indexingErrors();
        arrayOfObjects();

    }

    private static void simpleArray() {
        // Egydimenziós tömb
        int[] numbers = new int[5];
        numbers[0] = 4; // értékadás

        numbers[1] = numbers[0] * 2; // hivatkozás egy elemre
        int third = numbers[2];
        System.out.println("[3] -> " + numbers[3]);
        System.out.println("[1] -> " + numbers[1]);
    }

    private static void processAnArray() {
        // Direkt értékadás
        int number = 5;
        int[] numbers = new int[]{1, number, 6, 0, 12, -1};
        int length = numbers.length;
        System.out.println("Hossz = " + length);

        numbers[3] = 100;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = %d%n", i, numbers[i]);
        }
    }

    private static void indexingErrors() {
        int[] numbers = new int[]{0, 1, 2};

        int index = -5;

        if (index >= 0 && index < numbers.length) {
            System.out.println("10. index -> " + numbers[index]);
        } else {
            System.out.println("Nincs " + index + ". indexű elem");
        }

        try {
            System.out.println("10. index -> " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nincs " + index + ". indexű elem");
        }

    }

    private static void arrayOfObjects() {
        String[] names = new String[3];
        names[0] = "John";

        Cat tom = new Cat("Tom");
        Cat[] cats = new Cat[]{tom, new Cat("Csizmás Kandúr")};

        //cats[0].introduceSelf();
        //cats[1].setWeight(15);
        //System.out.println(cats[1].getName() + " súlya: " + cats[1].getWeight());

        System.out.println(Arrays.toString(new int[0]));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(cats));
    }
}
