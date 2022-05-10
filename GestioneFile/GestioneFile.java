/*
    Nome:       Marco Maier
    Classe:     4E
    Oggetto:    Gestione di un file in cui si inseriscono delle frasi
                si legge il file e si cercano le frasi in cui è presente una parola a scelta
*/
import java.util.*;
import java.io.*;
class GestioneFile{
    String nomeFile;
    GestioneFile(String nomeFile){
        this.nomeFile=nomeFile;
    }
    void inputFile(String frase){
        boolean modScrittura = true;
        try{
            FileWriter fw = new FileWriter(nomeFile,modScrittura);
            PrintWriter fOut = new PrintWriter(fw);
            fOut.println(frase);
            fOut.flush();
            fOut.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void outputFile(){
        String s;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
                System.out.println(s);
                s=fIn.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void cercaParola(String parola){
        String s;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
		    s=s.toLowerCase();
		    parola=parola.toLowerCase();
                if(s.contains(parola)){
                    System.out.println(s);
                }
                s=fIn.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
