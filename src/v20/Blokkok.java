package v20;

public class Blokkok {
    public static void main(String[] args) {

        int alma = 1;

        {
            // Üres blokk
        }

        {
            alma += 5;

            double körte = 3;

            System.out.println(alma + " db alma van, " + körte + " db körte");

            {
                String vakond = "Egyre mélyebbre megyünk...";
            }

            // System.out.println(vakond);
        }

        // boolean vanSokKörte = körte > 3;

        String körte = "nagy";

        System.out.println(körte);
        alma++;
    }
}
