import java.util.Scanner;

/**
 * Napisite funkciju koja prima cijeli broj n , a koja ispisuje na ekran sve brojeve od 1
 * do n koji su dijeljivi sa sumom svojih cifara. Funkciju demonstrirati u programu koji 
 * zahtjeva od korisnika da unese broj n a zatim poziva napisanu funkciju sa parametrom n.
 * @author nedimomerovic
 *
 */
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
        int broj;
        int suma=0;
        System.out.println("Unesite broj");
        broj = ulaz.nextInt();

        for (int i=1; i<= broj; i++){
        	int cekanje=i; 
        	while (cekanje != 0) {	//dok je broj razlicit od 0
                 suma += cekanje % 10;//suma se zbraja od ostatka djeljenja sa 10
                 cekanje /= 10;// broj se dijeli sa 10 i nova int vrijednost postaje varijabla broj(otpada zadnji sve do 0)
                 
        	}
        	if (i%suma==0){
        	System.out.println("Redni broj: "+i);
        	}
        	       	     	
        	 suma=0;
        }
	}
}