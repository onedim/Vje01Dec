public class BenjoPrimjer {

	public static void main(String[] args) {
		/**
		 * TextIO.writeUserSelectedFile();//pise u selektovani fajl
		 * TextIO.putln("Ovo je malo laksa verzija");//stavlja na jednu liniju
		 * pa prelazi na drugu TextIO.put("Ovo je malo laksa verzija");
		 * TextIO.put("Naravno moguce je i %20s \n formatirati");
		 * TextIO.writeStandardOutput();//konzolni output
		 */

		TextIO.readUserSelectedFile();
		int sum = 0;
		TextIO.putln("A ovako se cita");

		while (TextIO.eof() != true) { // cita do kraja karaktera
			try {
				String word = TextIO.getlnWord();
				int broj = Integer.parseInt(word);
				sum += broj;
			} catch (IllegalAccessException e) {
				TextIO.putln("Razmak");
			} catch (IllegalAccessException ia) {
				TextIO.putln("moramo skontati kako getWord radi");
				break;

			}
		}
	}
}
