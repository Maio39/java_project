/*
	nome:		Marco
	cognome:		Maier
	classe:		4E
	Data:			4/3/2021
	Oggetto:		Classe per creare i nodi di una lista
*/
class Nodo{
	Cerchio c;
	private Nodo next;
	
	Nodo(Cerchio c,Nodo next){
		this.c=c;
		this.next=next;
	}
	
	Nodo getNext(){
		return next;
	}
	
	void setNext(Nodo next){
		this.next=next;
	}
	
	String toStringa(){
		return c.toStringa();
	}
}