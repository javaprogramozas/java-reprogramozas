package v54;

public abstract class RealEstate {

    private int floorArea;

    public RealEstate(int floorArea) {
        this.floorArea = floorArea;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public abstract double getPrice();

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("Ez a(z) %s %d m2 méretű és %.2f aranypénz értékű",
                getType(), floorArea, getPrice());
    }
}
