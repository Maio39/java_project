class Nodo{
    Frazione fr;
    private Nodo next;
    Nodo(Frazione fr, Nodo next){
        this.fr=fr;
        this.next=next;
    }
    Nodo(){
        this.next=null;
        this.fr=null;
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
        return fr.toStringa();
    }
}