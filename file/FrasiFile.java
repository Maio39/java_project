/*
    Oggetto:    Fare un semplice programma srtutturato ad oggetti per scrivere 
                delle frasi famose.
                Ciascuna frase sarà scritta su una sola riga.
                Realizzare un piccolo menù con due voci una per scrivere una 
                frase e un'altra voce per leggere tutte le frasi memorizzate.
*/
import java.io.*;
class FrasiFile{
    String nomeFile;

    FrasiFile(String nomeFile){
        this.nomeFile=nomeFile;
    }

    void scriviFile(String frase){
        boolean modScrittura=true;
        try{
            FileWriter fw = new FileWriter(nomeFile,modScrittura);
            PrintWriter fOut = new PrintWriter(fw);
            fOut.println("\n");
            fOut.println(frase);

            fOut.flush();
            fOut.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    void letturaFile(){
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
}