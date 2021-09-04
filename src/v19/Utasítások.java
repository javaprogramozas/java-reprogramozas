package v19;

public class Utasítások {

	public static void main(String[] args) {

		int videókSzáma;  // deklarációs utasítás

		videókSzáma = 19; // értékadás

		videókSzáma--; // értéknövelő és csökkentő operátorok

		System.out.println("Ez a videó az utasításokról szól."); // metódus hívás

		max(5, 10); // metódus hívás, csak a mellékhatása érvényesül

		String szöveg = new String("Utasítalak!"); // objektum létrehozása
		new String("Utasítalak!");

		// Folyamatvezérlő utasítások - if, for, while, switch
	}

	private static int max(int a, int b) {
		// System.out.println("Maximum számítás a = " + a + ", b = " + b);
		return a > b ? a : b;
	}

}
