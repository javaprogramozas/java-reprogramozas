package v54;

public class LuxuryApartman extends Apartman {

    public LuxuryApartman(int floorArea, double pricePerSqMeters, int balconyArea) {
        super(floorArea, pricePerSqMeters, balconyArea);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }

    @Override
    public String getType() {
        return "luxuslakás";
    }
}
