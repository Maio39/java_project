class Rectangle2 {
    double side1;
    double side2;
    String nome;
    
    Rectangle2(double side1, double side2, String nome){
        this.side1=side1;
        this.side2=side2;
        this.nome=nome;
    }

    double perimetro(){
        double p;
        p = (side1+side2)*2;
        return p;
    }
    
    double area(){
        double a;
        a = side1 * side2;
        return a;
    }

    double diagonale(){
        double d;       //variabile diagonale
        d=Math.sqrt(side1*side1+side2*side2);
        return d;
    }

    String toStringa(){
        String res;
        res = "\nLato 1: "+side1+"\nLato 2: "+side2+"\nNome: "+nome+"\n";
        return res;
    }
}
