/*
	@author: Marco Maier
	@data: 22-10-2020
	@descrizione: Una classe che utilizza la classe rettangolo
	
*/
import java.io.*;
class TestRettangolo{
	
	public static void main(String args[]){
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		
		Rectangle2 r1;
		String s;
		String n;
		double b,h;
		try{
			System.out.print("\nInserisci base: ");
			s=in.readLine();
			b=Double.parseDouble(s);
			
			System.out.print("\nInserisci altezza: ");
			s=in.readLine();
			h=Double.parseDouble(s);
			
			System.out.print("\nInserisci il nome: ");
			n=in.readLine();
			
			r1=new Rectangle2(b,h,n);
	
		System.out.println("\nIl Perimetro è: "+r1.perimetro());
		System.out.println("L'Area è: "+r1.area());
		System.out.println("La diagonale vale: "+r1.diagonale()); 
		}
		catch(Exception e){
		}

	}
}