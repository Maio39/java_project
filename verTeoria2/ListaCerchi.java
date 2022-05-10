/*
	nome:		Marco
	cognome:		Maier
	classe:		4E
	Data:			4/3/2021
	Oggetto:		Classe per creare una lista di certchi
*/


class ListaCerchi{
	private Nodo testa;
	private Nodo coda;
	private int n;
	
	ListaCerchi(){
		this.testa=null;
		this.coda=null;
		this.n=0;
	}
	
	Nodo insertCoda(Cerchio c){
		Nodo nuovo = new Nodo(c,null);
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
	
	void cerchiPrimoQuadrante(){
		Nodo temp;
		temp=testa;
		while(temp!=null){
			if(temp.c.p.getX()>0&&temp.c.p.getY()>0){
				System.out.println(temp.toStringa());
			}
			temp=temp.getNext();
		}
	}
}
