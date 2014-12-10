/**
 * Napisite program koji trazi da se sa tastature unese neki cijeli
 * 	broj, a koji ce zatim na ekranu ispisati znak cija je ASCII sifra
 * 	jednaka unesenom broju. Program treba da proizvede dijalog koji
 * 	izgleda poput sljedeceg: 
 * 	Unesi neki broj: 67 
 * 	Znak koji ima ASCII sifru 67 je znak C.
 */

public class Zadatak8 {

	public static void main(String[] args) {

		System.out.println("Unesi broj: ");
		int uneseniBroj = TextIO.getlnInt();
		
		
		System.out.printf("Znak koji ima ASCII sifru %d je znak %c.", uneseniBroj, konvertovanje(uneseniBroj));
		// UPAMTI "%c" ZA ISPIS KARAKTERA!		
	}

	private static char konvertovanje(int broj) {
		char sifra = (char) broj; // UPAMTI OVO!!!
		return sifra;
	}

}