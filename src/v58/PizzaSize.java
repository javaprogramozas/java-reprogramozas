package v58;

public enum PizzaSize {

    SMALL(24),
    NORMAL(32),
    LARGE(40);

    private final int sizeInCm;

    PizzaSize(int size) {
        this.sizeInCm = size;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    @Override
    public String toString() {
        return name() + "(" + sizeInCm + ")";
    }

    public static PizzaSize findBySize(int minimum) {
        PizzaSize[] values = PizzaSize.values();
        for (int i = 0; i < values.length; i++) {
            PizzaSize size = values[i];
            if (size.sizeInCm > minimum) {
                return size;
            }
        }
        return values[values.length - 1];
    }
}
