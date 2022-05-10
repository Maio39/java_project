class Pila{//Gestione input output di tipo LIFO(Last In First Out)
    private Nodo testa;
    private Nodo coda;
    private int n;

    Pila(){
        testa=null;
        coda=null;
        n=0;
    }

    void push(Prodotto p){
        Nodo nuovo = Nodo(p,null);
        if(testa==null){
            testa=nuovo;
            coda=nuovo;
            
        }else{
            nuovo.setNext(testa);
            testa=nuovo;
            
        }
        n++;
    }
    Nodo pop(){
        if(testa!=null){
            Nodo elim = testa;
            testa=testa.getNext();
            Nodo elim.setNext(null);
            n--;
            return elim;
        }
        return null;
    }
}