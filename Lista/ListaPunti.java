public class ListaPunti {
    private Nodo testa;
    private Nodo coda;
    private int n;
    ListaPunti(){
        this.testa=null;
        this.coda=null;
        this.n=0;
    }

    Nodo insertCoda(Point p){
        Nodo nuovo = new Nodo(p,null);
        if(testa==null){
            coda=nuovo;
            testa=coda;
        }else{
            coda.setNext(nuovo);
            coda=nuovo;
        }
        n++;
        return nuovo;
    }

    void leggere(){
        Nodo temp;
        temp = testa;
        while(temp!=null){
            System.out.println(temp.toString());
            temp=temp.getNext();
        }
    }

}
