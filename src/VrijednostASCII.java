public class VrijednostASCII {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Dodajte argumente koje zelite sabrati");
		} else {
			int suma = 0;
			boolean prost = true;

			for (String x : args) {// String vrsta podatka Suma ime novog
									// podatka:odakle se uzima
				try {
				suma = suma + Integer.parseInt(x);
									
				
				
				if (Integer.parseInt(x)==0 ){
					System.out.printf("Kraj programa");

				}					
				}catch (NumberFormatException e){
					System.out.printf("upozorenje %s nije ispravan broj,preskace se \n", e);
					
				}		
			}
				
			System.out.printf("Suma je, %s!\n", suma);
			
		}
	}
}