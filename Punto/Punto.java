/*
    Nome:       Marco
    Cognome:    Maier
    classe:     4E
    Oggetto:    Creare una classe punto che dovrà avere almeno i seguenti metodi:
                - distanza dall'origine
                - distanza da un altro punto
                - confronto con un altro punto
*/

class Punto{
    double x;
    double y;
    Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    double distanzaOrigine(){
        double distanzaO;
        distanzaO=Math.sqrt(x*x+y*y);
        return distanzaO;
    }

    double distanzaDuePunti(Punto p2){
        double distanzaP;
        distanzaP=Math.sqrt((p2.x-x)*(p2.x-x)+(p2.y-y)*(p2.y-y));
        return distanzaP;
    }

    int confrontoPunti(Punto p1, Punto p2){
        int res;
        if(p1.distanzaOrigine()>p2.distanzaOrigine()){
            res = 1;
            return res;
        }
        if(p1.distanzaOrigine()<p2.distanzaOrigine()){
            res = 2;
            return res;
        }
        if(p1.distanzaOrigine()==p2.distanzaOrigine()){
            res = 3;
            return res;
        }
        res = 0;
        return res;
    }

}