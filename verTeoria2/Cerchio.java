/*
	nome:		Marco
	cognome:		Maier
	classe:		4E
	Data:			4/3/2021
	Oggetto:		Classe Cerchio
*/
class Cerchio{
	Punto p;
	double r;
	
	Cerchio(Punto p,double r){
		this.p=p;
		this.r=r;
	}
	Cerchio(double r){
		p=new Punto();
		this.r=r;
	}
	Cerchio(){
		p=new Punto();
		this.r=1;
	}
	
	double area(){
		double area;
		area=Math.PI*r*r;
		return area;
	}
	
	void confrontoCerchi(Cerchio altro){
		if(this.area()==altro.area()){
			System.out.println("l'area dei due cerchi è uguale");
		}else{
			if(this.area()>altro.area()){
				System.out.println("\nl'area del primo cerchio è maggiore");
			}else{
				System.out.println("\nl'area del secondo cerchio è maggiore");
			}
		}
	}
	
	String toStringa(){
		String s;
		s="Cerchio:  "+p.toStringa()+" raggio="+r;
		return s;
	}
	
}