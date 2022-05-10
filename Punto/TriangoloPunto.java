/*
    Nome:       Marco Maier
    Classe:     4E
    Data:       23/11/2020
    Oggetto:    Creare una classe Triangolo definito da tre punti
                su un piano cartesiano
*/

class TriangoloPunto {
    Punto p1,p2,p3;
    private double lato1,lato2,lato3;
    TriangoloPunto(Punto p1,Punto p2,Punto p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public double calcolaLato1_2(){
        lato1=p1.distanzaDuePunti(p2);
        return lato1;
    }

    public double calcolaLato2_3(){
        lato2=p2.distanzaDuePunti(p3);
        return lato2;
    }

    public double calcolaLato3_1(){
        lato3=p3.distanzaDuePunti(p1);
        return lato3;
    }

    public double perimetro(){
        double somma;
        somma=lato1+lato2+lato3;
        return somma;
    }
}
