
public class Rectangle {
    double side1;
    double side2;
    String nome;
    Rectangle(double side1, double side2, String nome){
        this.side1=side1;
        this.side2=side2;
        this.nome=nome;
    }

    double perimeter(){
        double p;       //variabile perimetro
        p=(side1+side2)*2;
        return p;
    }
    double area(){
        double a;       //variabile area
        a=side1+side2;
        return a;
    }
    double diagonal(){
        double d;       //variabile diagonale
        d=Math.sqrt(Math.pow(side1, (double)1/2)+Math.pow(side2, (double)1/2));
        return d;
    }
}