package v54;

public class Main {

    public static void main(String[] args) {
        //RealEstate realEstate = new RealEstate(50);
        Apartman apartman = new RegularApartman(60, 100, 5);
        Apartman luxury = new LuxuryApartman(200, 150, 50);
        FamilyHouse familyHouse = new FamilyHouse(110, 1000, 60);

        //display(realEstate);
        display(apartman);
        display(luxury);
        display(familyHouse);

    }

    private static void display(RealEstate realEstate) {
        System.out.println(realEstate);
    }
}
