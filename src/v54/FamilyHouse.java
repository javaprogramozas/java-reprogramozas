package v54;

public class FamilyHouse extends RealEstate {

    private int gardenArea;
    private double pricePerSqMeters;

    public FamilyHouse(int floorArea, int gardenArea, double pricePerSqMeters) {
        super(floorArea);
        this.gardenArea = gardenArea;
        this.pricePerSqMeters = pricePerSqMeters;
    }

    @Override
    public double getPrice() {
        return getFloorArea() * pricePerSqMeters + gardenArea * pricePerSqMeters * 0.2;
    }

    @Override
    public String getType() {
        return "családi ház";
    }

    @Override
    public String toString() {
        return super.toString() + " " + gardenArea + " m2 telekkel";
    }
}
