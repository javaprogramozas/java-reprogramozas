package v13;

public class ÖsszehasonlítóOperátorok {

	public static void main(String[] args) {
		// Összehasonlító operátorok
		
		int alma = 15;
		int körte = 33;
		
		boolean nagyobb = 5 > 3;                    // true
		boolean nagyobbVagyEgyenlő = 9 >= 9;        // true
		boolean kisebb = alma < -5;                 // false
		boolean kisebbVagyEgyenlő = 13.28 <= körte; // true
		boolean egyenlő = alma == 10;               // false
		boolean nemEgyenlő = körte != 0;            // true
		
		// Ne keverjük az értékadás (=) és
		// az egyenlőség összehasonlító (==) operátorokat!
		// boolean helytelen = 12 = 3;
		
		boolean karakteresHasonlítás = 'A' > 'B';   // false
		// boolean helytelen = "Ez" <= "Az";
		char kérdőjel = '?';
		boolean sz = kérdőjel == ' ';
		boolean hamis = nagyobb == false;  // ==> !nagyobb
		boolean figyelem = "Valami" == "Valami"; // nem primitív típusok esetén eltérően működik!

	}

}
