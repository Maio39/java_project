/*
    Nome:           Marco
    Cognome:        Maier
    Data:           18/03/2021
    Oggetto:        Classe prodotto che dovrà avere i seguenti attributi:
                    -Inserire un prodotto alla volta
                    -Rimuovere un prodotto alla volta(in base alla posizione)
                    -Inserire un prodotto in una posizione specifica
                    -visualizzare la lista della spesa
                    
*/
class Prodotto{
    String nome;
    double prezzoUnitario;
    int quantità;

    Prodotto(String nome, double prezzoUnitario, int quantità){
        this.nome=nome;
        this.prezzoUnitario=prezzoUnitario;
        this.quantità=quantità;
    }

    String toStringa(){
        return nome+" prezzo: "+prezzoUnitario+" quantità: "+quantità;
    }
}