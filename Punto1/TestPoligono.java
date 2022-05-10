/*
	Nome:		Marco Maier
	Classe:	4e
	Data:		26/11/2020
	Oggetto:	Test per la classe poligono
*/
import java.io.*;
class TestPoligono{

	public static void main(String args[]){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		Poligono p1;
		String s;
		int n;
		
		try{
		System.out.println("Inserisci il numero dei lati: ");
		s=in.readLine();
		n=Integer.parseInt(s);
		p1 = new Poligono(n);
		p1.insertLati(n);
		System.out.println("Il perimetro è: "+p1.perimetro(n));
		}
		catch(Exception e){
		}	
	}

}
