/*
    Nome:           Marco 
    Cognome:        Maier
    Classe:         4E
    Data:           11/03/2021
    Oggetto:        Classe lista Incontri
*/
public class ListaIncontri {
    private Nodo testa;
    private Nodo coda;
    private int n;

    ListaIncontri(){
        this.testa=null;
        this.coda=null;
        this.n=0;
    }

    Nodo insertCoda(Incontro partita){
        Nodo nuovo = new Nodo(partita, null);
        if(testa==null){
            testa=nuovo;
            coda=testa;
        }else{
            coda.setNext(nuovo);
            coda=nuovo;
        }
        n++;
        return nuovo;
    }
    void leggere(){
        Nodo temp;
        temp=testa;
        while(temp!=null){
            System.out.println(temp.toStringa());
            temp=temp.getNext();
        }
    }
    void visualIncontriSquadra(String squadra){
        Nodo temp;
        temp=testa;
        while(temp!=null){
            if(squadra.equalsIgnoreCase(temp.partita.squadra1)){
                System.out.println(temp.toStringa());
                temp=temp.getNext();
            }
            if(squadra.equalsIgnoreCase(temp.partita.squadra2)){
                System.out.println(temp.toStringa());
                temp=temp.getNext();
            }
            temp=temp.getNext();
        }
    }
}
