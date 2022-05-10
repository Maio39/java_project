/*
    nome:               Marco
    cognome:            Maier
    classe:             4E
    data:               25/03/2021
    oggetto:            Classe nota
*/
public class Nota{
    private String testo;
    private String categoria;
    private int priorita;

    Nota(String testo,String categoria,int priorita){
        this.categoria=categoria;
        this.testo=testo;
        this.priorita=priorita;
    }
    String getTesto(){
        return testo;
    }
    String getCategoria(){
        return categoria;
    }
    int getPriorita(){
        return priorita;
    }
    String toStringa(){
        String s;
        s=categoria+" "+" "+testo+";"+" "+priorita;
        return s;
    }
}