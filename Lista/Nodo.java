class Nodo{
    Point p;
    private Nodo next;
    Nodo(Point p, Nodo next){
        this.p=p;
        this.next=next;
    }
    Nodo(){
        this.next=null;
        this.p=null;
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
        return p.toStringa();
    }
}