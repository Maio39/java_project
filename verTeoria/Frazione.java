/*
    Nome:       Marco Maier
    Classe:     4E
    Data:       30/11/2020
    Oggetto:    Realizzare la classe frazione con attributi, metodi e 
                costruttori opportuni.
*/
class Frazione{
	int n;	//numeratore della frazione
	int d;	//....
	
	String nome;
	Frazione(int n, int d){
        this.n=n;
        this.d=d;
    }
    Frazione(){
        this.n=0;
        this.d=0;
    }
    Frazione(Frazione fr){
        this.d=fr.d;
        this.n=fr.n;
    }

    String toStringa(){
        String s;
        s= n+"/"+d;
        return s;
    }
	
	Frazione somma(Frazione f){
        Frazione tmp;
        int den,num;
        num = this.n*f.d+this.d*f.n;
        den = this.d*f.d;
        tmp = new Frazione(num,den);
        return tmp;
    }

    Frazione semplifica(){
        Frazione tmp;
        int n,d;
        if(this.d!=0){
            int m = mcd(this.n,this.d);
            n = this.n/m;
            d = this.d/m;
            tmp = new Frazione(n, d);
            return tmp;
        }
        tmp = null;
        return tmp;
    }

    int mcd(int num1, int num2){
        int resto;
        do{
            resto = num1 % num2;
            num1=num2;
            num2=resto;
        }while(resto!=0);
        return num1;
    }

    Frazione differenza(Frazione f){
        Frazione tmp;
        int den,num;
        num = this.n*f.d-this.d*f.n;
        den = this.d*f.d;
        tmp = new Frazione(num, den);
        return tmp;
    }

    Frazione prodotto(Frazione f){
        int den,num;
        Frazione tmp;

        num=this.n*f.n;
        den=this.d*f.d;

        tmp = new Frazione(num, den);
        return tmp;

    }	
}