package v21;

public class Bővítés {

	public static void main(String[] args) {

		byte bájt = 5;
		short rövid = bájt;
		int egész = rövid;
		long hosszúEgész = egész;
		float valós = hosszúEgész;
		double hosszúValós = valós;

		hosszúEgész = 15L;
		hosszúValós = 15.0;
		// valós = 15.0;

		// A fordító néha "csal"
		bájt = 5;
		// bájt = egész;
		bájt = 1 + 1;
		
		// Kifejezések típusa
		long a = 201 - 124;   // int - int = int, majd bővítés long-ra
		float b = 5 + 3;      // int + int = int, majd bővítés float-ra
		int c = bájt * rövid; // mindkét operandus int-re majd int * int
		long c2 = hosszúEgész * bájt; // bájtot bővítjük long-ra, long * long
		double d = 5.2f / egész; // egész bővítése double-re, majd osztás
		// byte x = bájt + bájt;  // mindkét operandus int-re, majd káosz!
		
		// Számít a kiértékelési sorrend!
		double f = 3.8 + 5 / 2.0; // == 5.8 ???

		System.out.println(f);

	}

}
