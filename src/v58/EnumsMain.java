package v58;

public class EnumsMain {

    public static void main(String[] args) {

        PizzaSize size1 = PizzaSize.SMALL;

        String message = switch (size1) {
            case SMALL -> "Kicsi pizza";
            case NORMAL -> "Normál pizza";
            case LARGE -> "Nagy pizza";
        };

        PizzaSize[] values = PizzaSize.values();
        for (int i = 0; i < values.length; i++) {
            PizzaSize size = values[i];
            System.out.println(size + " -> " + size.ordinal() + " size=" + size.getSizeInCm());
        }

        if (size1 != PizzaSize.LARGE) {
            System.out.println("Ez egy nagy méret");
        }

        System.out.println(message);

        System.out.println(PizzaSize.findBySize(38));
        PizzaSize small = PizzaSize.valueOf("SMALL");
        System.out.println(small);
    }

}
