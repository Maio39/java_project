class Dado{
    int f1,f2,f3,f4,f5,f6;

    Dado(){
        this.f1=1;
        this.f2=2;
        this.f3=3;
        this.f4=4;
        this.f5=5;
        this.f6=6;
    }

    int lancioDado(){
        int x;
        x = (int)(1+Math.random()*6);
        return x;
    }

    int confronto(int n1,int n2){
        if(n1==n2){
            return 1;
        }
        if(n1>n2){
            return 2;
        }
        if(n1<n2){
            return 3;
        }
        return 0;
    }
    int sommaDadi(int n1, int n2){
        int somma;
        somma = n1+n2;
        return somma;
    }
}