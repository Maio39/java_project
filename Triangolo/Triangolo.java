class Triangolo{
    double base;
    double side2;
    double side3;
    String nome;

    Triangolo(double base, double side2, double side3, String nome){
        this.base=base;
        this.side2=side2;
        this.side3=side3;
        this.nome=nome;
    }

    double perimetro(){
        double p;
        p=base+side2+side3;
        return p;
    }

    double areaErone(){
        double a;
        double sp;
        sp=perimetro()/2;
        a=Math.sqrt(sp*(sp-base)*(sp-side2)*(sp-side3));
        return a;
    }

    double altezza(){
        double alt;
        double a;
        a=areaErone();
        alt=2*a/base;
        return alt;
    }

    double area(){
        double a;
        double alt;
        alt=altezza();
        a=base*alt/2;
        return a;
    }

    String toStringa(){
        String res;
        res="\nBase = "+base+"\nLato2 = "+side2+"\nlato3 = "+side3+"\nNome = "+nome;
        return res;
    }

    boolean equal(Triangolo altro){    //confronta questo oggetto con un altro restituisce true se gli oggetti sono uguali altrimenti false
        if(base==altro.base && side2==altro.side2 && side3==altro.side3){
            return true;
        }
        return false;
    }

    int compareTo(Triangolo altro){
        if(areaErone()==altro.areaErone()){
            return 0;
        }
        if(areaErone()>altro.areaErone()){
            return 1;
        }
        if(areaErone()<altro.areaErone()){
            return -1;
        }
        return 2;
    }
}