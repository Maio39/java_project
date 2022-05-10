import java.io.*;
class Triangolo{
	Point punti[];
	
	Triangolo(){
		punti = new  Point[3];
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
	
	double lato1_2(){
		double l;
		l=punti[0].distanceFrom(punti[1]);
		return l;
	}
	double lato2_3(){
		double l;
		l=punti[1].distanceFrom(punti[2]);
		return l;
	}
	double lato3_1(){
		double l;
		l=punti[2].distanceFrom(punti[0]);
		return l;
	}

	
	double perimetro(){
		double perimetro;
		perimetro=lato1_2()+lato2_3()+lato3_1();
		return perimetro;
    }
    
    double area(){
        double area;
        area=1/2*((punti[0].getX()*punti[1].getY()*1)+(punti[0].getY()*1*punti[2].getX())+(1*punti[1].getX()*punti[2].getY())-(1*punti[1].getY()*punti[2].getX()+punti[0].getY()*punti[1].getX()*1+punti[0].getX()*1*punti[2].getY()));
        return area;
    }
	
}
