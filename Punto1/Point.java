 /*
Nome: Marco Maier
Luogo: Casa
Data : 16/11/2020
Oggetto: gestione di un punto in un piano cartesiano
*/

class Point{
	//attributi
	final double DEFAULT_X=0;
	final double DEFAULT_Y=0;
	private String name;
	private double x;
	private double y;
	//costruttori
	Point(double x, double y,String name){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
		this.name ="P";
	}
	
	Point(){
		x = DEFAULT_X;
		y = DEFAULT_Y;
		name = "O";
	}
	String toStringa(){
		String coordinate;
		coordinate = name + "(" + x +"," + y + ")";
		return coordinate;
	}
	//metodi
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String getName(){
		return name;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setName(String nome){
		this.name = nome;
	}
	double distanceFromOrigin(){
		double d;
		Point o=new Point();
		d=distanceFrom(o);
		//d  = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return d;
	}
	double distanceFrom(Point p){
		double d;
		//double difX = p.x - x;
		//double difY = p.y - y;
		d  = Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
		return d;
	} 
	int compareTo(Point p){
		if(distanceFromOrigin() < p.distanceFromOrigin()){
			return -1;
		}else{
			if(distanceFromOrigin() == p.distanceFromOrigin()){
				return 0;
			}else{
			
				return -1;
			}
			
		}
	}
	
	boolean equals(Point altro){
		if(distanceFromOrigin() == altro.distanceFromOrigin()){
			return true;
		}else{
			return false;
		}
	}
	
}