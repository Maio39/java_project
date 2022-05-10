/*
	nome:		Marco Maier
	classe:		4E
	data:			18 febbraio 2021
	oggetto:		classe cerchio
*/
import java.io.*;
class Cerchio{
	private double r;
	
	Cerchio(double r){
		this.r=r;
	}
	
	Cerchio(){
		r=1;
	}
	public double getRaggio(){
		return r;
	}
    public void setRaggio(double raggio){
        this.r=raggio;
    }
	double area(){
		return Math.PI*r*r;
	}
	double perimetro(){
		return 2*Math.PI*r;
	}
	public String toStringa(){
		return "\nRAGGIO: "+r+"\nAREA: "+area()+"\nPERIMETRO: "+perimetro();
	}
}