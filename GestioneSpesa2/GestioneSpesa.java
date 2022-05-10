/*
    Nome:           Marco
    Cognome:        Maier
    Data:           18/03/2021
    Oggetto:        Classe per la gestione delle liste 
                    della spesa
                    
*/
import java.io.*;
import java.util.*;
public class GestioneSpesa {
    Vector spesa;
    Data d;
    GestioneSpesa(){
        spesa= new Vector<Prodotto>();
        d = new Data();
    }

    void insertProdotto(Prodotto p){
        spesa.add(p);
    }

    void remove(int index){
        spesa.remove(index);
    }

    void insertPosition(Prodotto p, int index){
        spesa.add(index, p);
    }

    void visualSpesa(){
        Prodotto p2;
        for(int i=0;i<spesa.size();i++){
            p2=(Prodotto) spesa.elementAt(i);
            System.out.println(p2.toStringa());
        }
    }

    void saveFile(){
        String nomeFile = d.toStringa()+".CSV";
        Prodotto p2;
        try{
            FileWriter fw = new FileWriter(nomeFile, true);
            PrintWriter fOut = new PrintWriter(fw);
            for(int i=0;i<spesa.size();i++){
                p2=(Prodotto) spesa.elementAt(i);
                fOut.println(p2.toStringa());
            }
            fOut.flush();
            fOut.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    void visualSpesaData(Data d2){
        String s;
        String nomeFile= d2.toStringa()+".CSV";
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
                System.out.println(s);
                s=fIn.readLine();
            }
            fIn.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
