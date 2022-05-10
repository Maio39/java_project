/*
	nome:		Marco
	cognome:		Maier
	classe:		4E
	Data:			4/3/2021
	Oggetto:		Classe Test 
*/
import java.io.*;
class Test{
	public static void main(String args[]){
		String s;
		int opt;
		ListaCerchi lc = new ListaCerchi();
		double x,y,r;
		try{
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(input);
			do{
				System.out.println("\nScegliere l'opzione desiderata");
				System.out.println("\n1 = Inserire un cerchio");
				System.out.println("\n2 = calcolare l'area di un cerchio");
				System.out.println("\n3 = Confrontare se due cerchi sono uguali in base all'area");
				System.out.println("\n4 = Leggere tutti i cerchi inseriti nella lista");
				System.out.println("\n5 = Visualizzare solo i cerchi che si trovano nel primo quadrante");
				System.out.println("\n0 = ESCI");
				s=in.readLine();
				opt=Integer.parseInt(s);
				switch(opt){
					case 1:
						System.out.println("cerchio: ");
						System.out.println("\nInserisci la coordinata X del punto:");
						s=in.readLine();
						x=Double.parseDouble(s);
						System.out.println("\nInserisci la coordinata Y del punto:");
						s=in.readLine();
						y=Double.parseDouble(s);
						Punto p = new Punto(x,y);
						System.out.println("\nInserisci il valore del raggio: ");
						s=in.readLine();
						r=Double.parseDouble(s);
						Cerchio c = new Cerchio(p,r);
						lc.insertCoda(c);
					break;
					case 2:
						System.out.println("\nCerchio: ");
						System.out.println("\nInserisci la coordinata X del punto:");
						s=in.readLine();
						x=Double.parseDouble(s);
						System.out.println("\nInserisci la coordinata Y del punto:");
						s=in.readLine();
						y=Double.parseDouble(s);
						Punto p1 = new Punto(x,y);
						System.out.println("\nInserisci il valore del raggio: ");
						s=in.readLine();
						r=Double.parseDouble(s);
						Cerchio c1 = new Cerchio(p1,r);
						System.out.println(c1.area());
					break;
					case 3:
						//Inserimento primo cerchio
						System.out.println("Primo cerchio:");
						System.out.println("\nInserisci la coordinata X del punto:");
						s=in.readLine();
						x=Double.parseDouble(s);
						System.out.println("\nInserisci la coordinata Y del punto:");
						s=in.readLine();
						y=Double.parseDouble(s);
						Punto p2 = new Punto(x,y);
						System.out.println("\nInserisci il valore del raggio: ");
						s=in.readLine();
						r=Double.parseDouble(s);
						Cerchio c2 = new Cerchio(p2,r);
						//Inserimento secondo cerchio
						System.out.println("Secondo cerchio:");
						System.out.println("\nInserisci la coordinata X del punto:");
						s=in.readLine();
						x=Double.parseDouble(s);
						System.out.println("\nInserisci la coordinata Y del punto:");
						s=in.readLine();
						y=Double.parseDouble(s);
						Punto p3 = new Punto(x,y);
						System.out.println("\nInserisci il valore del raggio: ");
						s=in.readLine();
						r=Double.parseDouble(s);
						Cerchio c3 = new Cerchio(p3,r);
						//confronto dei due cerchi in base all'area
						c2.confrontoCerchi(c3);
					break;
					case 4:
						lc.leggere();
					break;
					case 5:
						lc.cerchiPrimoQuadrante();
					break;
				}
			}while(opt!=0);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}