package v11;

public class UnárisOperátorok {

    public static void main(String[] args) {

        // értékadás
        int alma, körte;
        alma = 152;
        körte = alma;
        System.out.println("1.) Alma = " + alma + "\tkörte = " + körte);

        alma = 35;

        System.out.println("2.) Alma = " + alma + "\tkörte = " + körte);


        // Előjel operátor
        int pluszÖt = +5;
        int mínuszHárom = -3;
        int mínusÖt = -pluszÖt;

        System.out.println("plusz öt = " + pluszÖt + "\n" +
                "mínusz három = " + mínuszHárom + "\n" +
                "mínusz öt = " + mínusÖt);

        System.out.println();

        // Logikai "nem" operátor
        boolean igaz = true;
        boolean hamis = !igaz;
        System.out.println("igaz = " + igaz + ", !igaz = " + hamis);

        // Értéknövelő és értékcsökkentő operátorok --> később
    }


}