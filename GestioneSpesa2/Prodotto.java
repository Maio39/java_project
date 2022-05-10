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
    double quantità;

    Prodotto(String nome, double prezzoUnitario, double quantità){
        this.nome=nome;
        this.prezzoUnitario=prezzoUnitario;
        this.quantità=quantità;
    }
    double prezzoTot(){
        return quantità*prezzoUnitario;
    }

    String toStringa(){
        return nome+" prezzo: "+prezzoUnitario+" quantità: "+quantità;
    }
}