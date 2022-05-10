import java.io.*;
public class FileEmail {
    String nomeFile;

    FileEmail(String nomeFile){
        this.nomeFile=nomeFile;
    }

    void scriviFile(String frase){      //String frase può essere una qualsiasi stringa
        boolean modScrittura=true;

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
