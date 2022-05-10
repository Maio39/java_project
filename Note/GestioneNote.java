/*
    nome:               Marco
    cognome:            Maier
    classe:             4E
    data:               25/03/2021
    oggetto:            Classe per la gestione delle note
*/
import java.util.*;
public class GestioneNote {
    Vector note;

    GestioneNote(){
        note= new Vector<Nota>(1,1);
    }

    void insertNotaPosition(int index,Nota n){
        note.add(index, n);
    }

    Nota removeNote(int index){
        Nota n;
        n=(Nota)note.remove(index);
        return n;
    }

    void visualNote(){
        Nota n;
        for(int i=0;i<note.size();i++){
            n = (Nota) note.elementAt(i);
            System.out.println(n.toStringa());
        }
    }
    void cercaParola(String parola){
        Nota n;
        for(int i=0;i<note.size();i++){
            n = (Nota) note.elementAt(i);
            if(n.toStringa().contains(parola)){
                System.out.println(n.toStringa());
            }
        }
    }
    void orderByFrequency(){
        Nota n1,n2;
        int cont=0;
        for(int i=0;i<note.size();i++){
            n1 = (Nota) note.elementAt(i);
            n2 = (Nota) note.elementAt(i+1);
            if(n1.getCategoria().equals((String) n2.getCategoria())){
                if(cont==0){
                    System.out.println(n1.toStringa());
                    cont++;
                }
                System.out.println(n2.toStringa());
            }else{

            }
        }
    }
}
