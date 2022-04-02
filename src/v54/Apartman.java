package v54;

public abstract class Apartman extends RealEstate {

    private double pricePerSqMeters;
    private int balconyArea;

    public Apartman(int floorArea, double pricePerSqMeters, int balconyArea) {
        super(floorArea);
        this.pricePerSqMeters = pricePerSqMeters;
        this.balconyArea = balconyArea;
    }

    @Override
    public double getPrice() {
        return getFloorArea() * pricePerSqMeters + balconyArea * pricePerSqMeters * 0.5;
    }

    public boolean hasBalcony() {
        return balconyArea > 0;
    }

}
