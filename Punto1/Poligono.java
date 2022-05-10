/*
	Nome:		Marco Maier
	Classe:	4e
	Data:		26/11/2020
	Oggetto:	Creare una classe poligono con i metodi per inserire i lati, calcolare 
			l'area e il perimetro.
*/
import java.io.*;
class Poligono{
	Point punti[];
	
	Poligono(int n){
		punti = new Point[n];
	}
	
	void inputPunti(){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String s;
		double x,y;
		try{
			for(int i=0;i<punti.length;i++){
				System.out.println("Inserisci la coordinata x del punto"+i+1+": ");
				s=in.readLine();
				x=Double.parseDouble(s);
				System.out.println("Inserisci la coordinata y del punto"+i+1+": ");
				s=in.readLine();
				y=Double.parseDouble(s);
				punti[i]= new Point(x,y);
			}
		}
		catch(Exception e){
		}
	}
	
	double[] lati(){
		int numLati;
		numLati=punti.length;
		double lati[]=new double[numLati];
		for(int i=0;i<numLati;i++){
			for(int j=0;j<numLati;j++){
				lati[i]
			}
		}
	}
	
	
}
