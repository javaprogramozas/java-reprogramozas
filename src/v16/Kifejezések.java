package v16;

public class Kifejezések {

	public static void main(String[] args) {
		String név;

		név = "Károly";
		
		System.out.println("Üdvözöllek " + név + "!");

		int hossz = "Hello ".length() + név.length();
		
		int nettóÁr = 1250;
		
		double bruttóÁr = nettóÁr * 0.27;

		int metódusos = 2 * max(nettóÁr, 1999) + 1;
		
		int a = 1 + 2 - 3; // (1 + 2) - 3
		
		int b = 5 + 2 * 6 - 1; // (5 + (2 * 6)) - 1
		
		int n = 0;
		int c = 15 - 4 * n++;    // 15 - (4 * (n++))
		boolean d = -n * 2 >= 3; // ((-n) * 2) >= 3
		boolean e = n > 8 || !false && d; // (n > 8) || ((!false) && d)
		
		// Használjunk zárójeleket 
		// a kiértékelési sorrend módosítására
		int f = (5 + 2) * (6 - 1);

		boolean g1 = a > 10 || b == 5 && f % 3 == 2;     // (a > 10) || ((b == 5) && ((f % 3) == 2))
		boolean g2 = (a > 10 || b == 5) && (f % 3 == 2); // ((a > 10) || (b == 5)) && ((f % 3) == 2))
		
		int óra = 11;		
		boolean dolgozniKell = (óra > 8 && óra < 12) || (óra > 13 && óra < 17);

		int a1, a2, a3, a4;
		a1 = a2 = a3 = a4 = 5; // a1 = (a2 = (a3 = (a4 = 5)))

	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
