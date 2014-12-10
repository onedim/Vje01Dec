
public class UpisUFajl {

	public static void main(String[] args) {
		TextIO.writeUserSelectedFile();
		System.out.println("Upisite svoje ime");
		String ime=TextIO.getln();
		TextIO.put("Ime \n"+ ime );
		System.out.println("Upisite svoje Prezime");
		String prezime=TextIO.getln();
		TextIO.put("\nPrezime\n"+ prezime);
		System.out.println("Koliko imate godina");
		int godine=TextIO.getInt();
		TextIO.put("\nGodine\n"+godine );

	}

}
