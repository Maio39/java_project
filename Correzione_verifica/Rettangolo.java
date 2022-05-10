import java.io.*;
public class Rettangolo {
    private Point p[]=new Point[4];
    String nome;
    private double d;

    public Rettangolo(){
    }

    public Rettangolo(Point p1, Point p2, String nome){
        this.p[0]=p1;
        this.p[1]=p2;
        this.nome=nome;
        calcoloVertici();
        d=p1.distanceFrom(p2);
    }
    void calcoloVertici(){
        this.p[2]=new Point(p[0].getX(),p[1].getY());
        this.p[3]=new Point(p[1].getX(),p[0].getY());
    }
    void setPunto(int nPunto, double x,double y){
        switch(nPunto){
            case 1:
                p[0].setX(x);
                p[0].setY(y);
            break;
            case 2:
                p[1].setX(x);
                p[1].setY(y);
            break;
        }
        calcoloVertici();

    }
    public double area(){
        double a;
        a=p[0].distanceFrom(p[3])*p[0].distanceFrom(p[2]);
        return a;
    }
    public boolean equals(Rettangolo altro){
        boolean uguali;
        uguali=(d==altro.d)&&(p[0].inclinazione(p[1])==altro.p[0].inclinazione(p[1]));
        return uguali;
    }
    public String tostringa(){
        String s="";
        s=nome+" "+p[0].toStringa()+","+p[1].toStringa()+","+p[2].toStringa()+","+p[3].toStringa();
        return s;
    }

}
