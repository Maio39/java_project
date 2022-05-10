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

    String toStringa(){
        String s;
        s= "Numeratore: "+n+"\nDenominatore: "+d;
        return s;
    }
	
	Frazione somma(Frazione f){
        Frazione tmp;
        int den,num;
        if(this.d>f.d){
            for(int i=this.d;i>0;i--){
                if(this.d/i==0){
                    if(f.d/i==0){
                        den=i;
                        num=this.n+f.n;
                        tmp = new Frazione(num,den);
                        return tmp;
                    }
                }
            }
        }else{
            for(int i=f.d;i>0;i--){
                if(f.d/i==0){
                    if(this.d/i==0){
                        den=i;
                        num=this.n+f.n;
                        tmp = new Frazione(num,den);
                        return tmp;
                    }
                }
            }
        }
        tmp = new Frazione();
        return tmp;
    }

    Frazione differenza(Frazione f){
        Frazione tmp;
        int den,num;
        if(this.d>f.d){
            for(int i=this.d;i>0;i--){
                if(this.d/i==0){
                    if(f.d/i==0){
                        den=i;
                        num=this.n-f.n;
                        tmp = new Frazione(num,den);
                        return tmp;
                    }
                }
            }
        }else{
            for(int i=f.d;i>0;i--){
                if(f.d/i==0){
                    if(this.d/i==0){
                        den=i;
                        num=this.n-f.n;
                        tmp = new Frazione(num,den);
                        return tmp;
                    }
                }
            }
        }
        tmp = new Frazione();
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

    Frazione divisione(Frazione f){
        int den,num;
        Frazione tmp;

        num=this.n*f.d;
        den=this.d*f.n;

        tmp= new Frazione(num, den);
        return tmp;
    }
	
	
}