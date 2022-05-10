/*
    Nome:           Marco 
    Cognome:        Maier
    Classe:         4E
    Data:           11/03/2021
    Oggetto:        Classe Nodo
*/
class Nodo{
    Incontro partita;
    private Nodo next;
    Nodo(Incontro partita, Nodo next){
        this.partita=partita;
        this.next=next;
    }
    Nodo(){
        this.next=null;
        this.partita=null;
    }
    public Nodo getNext(){
        return next;
    }
    public void setNext(Nodo next){
        this.next = next;
    }
    void clearNext(){
        this.next=null;
    }
    String toStringa(){
        return partita.toStringa();
    }
}