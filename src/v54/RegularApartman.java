package v54;

public class RegularApartman extends Apartman {

    public RegularApartman(int floorArea, double pricePerSqMeters, int balconyArea) {
        super(floorArea, pricePerSqMeters, balconyArea);
    }

    @Override
    public String getType() {
        return "társasházi lakás";
    }
}
