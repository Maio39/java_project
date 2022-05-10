import java.io.*;
class TestGestioneFile{
	public static void main(String args[]){
		String s;
		String frase,parola;
		int opt;
		String nomeFile="frasi.txt";
		GestioneFile gf;
		try{
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(input);
			gf = new GestioneFile(nomeFile);
			do{
				System.out.println("\n1 = Inserisci una nuova frase");
				System.out.println("\n2 = Visualizza tutte le frasi memorizzate");
				System.out.println("\n3 = Ricerca di una parola nelle varie frasi");
				System.out.println("\n0 = ESCI");
				System.out.println("Inserisci l'opzione desiderata: ");
				s=in.readLine();
				opt=Integer.parseInt(s);
				switch(opt){
					case 1:
						System.out.println("Inserisci la frase da inserire nel file: ");
						frase=in.readLine();
						gf.inputFile(frase);
					break;
					case 2:
						gf.outputFile();
					break;
					case 3:
						System.out.println("Inserisci la parola da cercare: ");
						parola=in.readLine();
						gf.cercaParola(parola);
					break;
				}
			}while(opt!=0);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
