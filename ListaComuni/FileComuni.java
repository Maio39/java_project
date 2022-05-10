/*
    nome:       Marco Maier
    data:       14/12/2020
    Oggetto:    Utilizzando il file CSV allegato relativo ai comuni d'Italia, fare una classe per la gestione del file che svolga le seguenti funzioni:
                - legge il file cosi come è, cioe ogni riga senza distinguere i vari campi
                - Legge il file visualizzando bene i vari campi distanziati da qualcosa che volete voi
*/

import java.util.*;
import java.io.*;
class FileComuni{
    String nomeFile;

    FileComuni(String nomeFile){
        this.nomeFile=nomeFile;
    }
    
    void letturaFile(){
        String s;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);

            s=fIn.readLine();
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

    void letturaCampiDistanziati(){
        String s;
        StringTokenizer st;
        String istat[];
        String comune[];
        String provincia[];
        String regione[];
        String prefisso[];
        String cap[];
        String codFisco[];
        String abitanti[];
        String link[];
        int i=0;
        int cont=0;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            istat = new String[3000];
            comune = new String[3000];
            provincia = new String[3000];
            regione = new String[3000];
            prefisso = new String[3000];
            cap = new String[3000];
            codFisco = new String[3000];
            abitanti = new String[3000];
            link = new String[3000];
            s=fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                while(st.hasMoreTokens()){
                    istat[i]=st.nextToken();
                    comune[i]=st.nextToken();
                    provincia[i]=st.nextToken();
                    regione[i]=st.nextToken();
                    prefisso[i]=st.nextToken();
                    cap[i]=st.nextToken();
                    codFisco[i]=st.nextToken();
                    abitanti[i]=st.nextToken();
                    link[i]=st.nextToken();
                    System.out.println(istat[i]+"\t"+comune[i]+"\t"+provincia[i]+"\t"+regione[i]+"\t"+prefisso[i]+"\t"+cap[i]+"\t"+codFisco[i]+"\t"+abitanti[i]+"\t"+link[i]+"\t");
                    i++;
                    cont++;
                }
                s=fIn.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void DatiProvincia(String provincia2){
        String s;
        StringTokenizer line;
        String provincia;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s = fIn.readLine();
            line = new StringTokenizer(s,";");
            while(s!=null){
                s=fIn.readLine();
                line = new StringTokenizer(s,";");
                line.nextToken();
                line.nextToken();
                provincia = line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                if(provincia2.equals(provincia)){
                    System.out.println(s);
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void backup(String nomeFileBackup){
        String s;
        try{
            FileWriter fw = new FileWriter(nomeFileBackup);
            PrintWriter fOut = new PrintWriter(fw);
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
                fOut.println(s);
                s=fIn.readLine();
            }
        }
        catch(Exception e){
        }
    }
    /*
    void numeroAbitantiProvincia(){
        String s;
        StringTokenizer line;
        String provincia;
        String provincia2="";
        String abitanti2;
        int abitanti=0;
        int cont=0;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            do{
                s = fIn.readLine();
                line = new StringTokenizer(s,";");
                cont=0;
                while(s!=null){
                    s=fIn.readLine();
                    line = new StringTokenizer(s,";");
                    line.nextToken();
                    line.nextToken();
                    provincia = line.nextToken();
                    line.nextToken();
                    line.nextToken();
                    line.nextToken();
                    line.nextToken();
                    abitanti2=line.nextToken();
                    line.nextToken();
                    if(cont==0){
                        provincia2=provincia;
                    }
                    if(provincia2==provincia){
                        abitanti=abitanti+Integer.parseInt(abitanti2);
                    }
                    cont++;
                }
            }while();    
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    */
}