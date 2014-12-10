

/**
 * Napisite funkciju koja kao paramerar prima cijeli broj n, a koja vraca sumu cifara
 * broja n. Napisanu funkciju demonstrirajte u programu koji od korisnika trazi da unese 
 * broj a zatim ispisuje sumu njegovih cifara.
 * @author nedimomerovic
 *
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
        int broj;
        System.out.println("Unesite pozitivan int broj veci od 9: ");
        broj = ulaz.nextInt();
        
        
        if (broj <= 0)
              System.out.println("Niste unjeli pozitivan broj");
        else if (broj<=9){
        	System.out.println("Niste unjeli broj veci od 9");
        }
        
        else {
            int suma = 0;
              
            while (broj != 0) {	//dok je broj razlicit od 0
                   suma += broj % 10;//suma se zbraja od ostatka djeljenja sa 10
                   broj /= 10;// broj se dijeli sa 10 i nova int vrijednost postaje varijabla broj(otpada zadnji sve do 0)
            }
            System.out.println("Suma je" + suma);
        }
  }
}
