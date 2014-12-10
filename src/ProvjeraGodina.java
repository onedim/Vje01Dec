public class ProvjeraGodina {

	public static void main(String[] args) {
		TextIO.readUserSelectedFile();
		TextIO.writeStandardOutput();
		while (TextIO.eof() != true) {
		
			String word = TextIO.getlnWord();
			TextIO.putln(word);
			for (String x : args) {

				try {
					int godine = Integer.parseInt(x);
					if (godine > 17) {
						System.out.printf("Navali");
					} else {
						System.out.printf("Maloljetno");
					}

				} catch (NumberFormatException e) {
					System.out.printf(
							"upozorenje %s nije ispravan broj,preskace se \n",e);

				}
			}

		}

	}

}
