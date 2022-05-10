/*
	nome:		Marco
	cognome:		Maier
	classe:		4E
	Data:			4/3/2021
	Oggetto:		Classe punto
*/
class Punto{
	private double x;
	private double y;
	
	Punto(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	Punto(){
		this.x=0;
		this.y=0;
	}
	
	double getX(){
		return x;
	}
	
	double getY(){
		return y;
	}
	
	String toStringa(){
		String s;
		s="\n x="+getX()+" y="+getY();
		return s;
	}
}