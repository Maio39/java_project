/*
        Nome:       Marco Maier
        Data:       Feste
        Oggetto:    Fare la gestione di un file CSV scelto o creato da noi
*/
import java.util.*;
import java.io.*;
class GestioneCalcio{
    String nomeFile;

    GestioneCalcio(String nomeFile){
        this.nomeFile=nomeFile;
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

    int numSquadre(){
        String s;
        StringTokenizer st;
        int cont=0;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                while(st.hasMoreTokens()){
                    st.nextToken();
                    st.nextToken();
                    st.nextToken();
                    st.nextToken();
                    st.nextToken();
                    st.nextToken();
                    st.nextToken();
                    cont++;
                }
                s=fIn.readLine();
            }
            return cont-1;
        }
        catch(IOException e){
            System.out.println(e);
        }
        return cont;
    }
    void letturaCampiDistanziati(){
        String s;
        StringTokenizer st;
        String squadra[];
        String anno[];
        String valore[];
        String campionato[];
        String vittorieCamp[];
        String coppeItaliane[];
        String coppeEuropee[];
        int i=0;
        int cont=0;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            squadra = new String[3000];
            anno = new String[3000];
            valore = new String[3000];
            campionato = new String[3000];
            vittorieCamp = new String[3000];
            coppeItaliane = new String[3000];
            coppeEuropee = new String[3000];
            s=fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                while(st.hasMoreTokens()){
                    squadra[i]=st.nextToken();
                    anno[i]=st.nextToken();
                    valore[i]=st.nextToken();
                    campionato[i]=st.nextToken();
                    vittorieCamp[i]=st.nextToken();
                    coppeItaliane[i]=st.nextToken();
                    coppeEuropee[i]=st.nextToken();
                    System.out.println(squadra[i]+"\t"+anno[i]+"\t"+valore[i]+"\t"+campionato[i]+"\t"+vittorieCamp[i]+"\t"+coppeItaliane[i]+"\t"+coppeEuropee[i]+"\t");
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
    void datiSquadra(String squadra2){
        String s;
        StringTokenizer line;
        String squadra;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s = fIn.readLine();
            line = new StringTokenizer(s,";");
            while(s!=null){
                s=fIn.readLine();
                line = new StringTokenizer(s,";");
                squadra = line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                if(squadra.equals(squadra2)){
                    System.out.println(s);
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void ricercaVittorieCampionato(int vittorie){
        String s,s2;
        StringTokenizer line;
        int vittorieCamp;
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
                line.nextToken();
                line.nextToken();
                s2=line.nextToken();
                vittorieCamp=Integer.parseInt(s2);
                line.nextToken();
                line.nextToken();
                if(vittorieCamp==vittorie){
                    System.out.println(s);
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    void ricercaValore(int valore){
        String s,s2;
        StringTokenizer line;
        int valore2;
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
                s2=line.nextToken();
                valore2=Integer.parseInt(s2);
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                if(valore==valore2){
                    System.out.println(s);
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    void ricercaCampionato(String campionato){
        String s;
        StringTokenizer line;
        String camp;
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
                line.nextToken();
                camp = line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                if(camp.equals(campionato)){
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

    void InserimentoSquadra(String nuovaSquadra){
        boolean modScrittura=true;
        try{
            FileWriter fw = new FileWriter(nomeFile,modScrittura);
            PrintWriter fOut = new PrintWriter(fw);
            
            fOut.println("\n");
            fOut.println(nuovaSquadra);

            fOut.flush();
            fOut.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void ordinamentoValore(){
        String s,s2;
        StringTokenizer line;
        int n = numSquadre();
        int valore[]=new int[n];
        String str[]=new String[n];
        String temp;
        int temp2;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s = fIn.readLine();
            System.out.println("\n"+s+"\n");
            for(int i=0;i<n;i++){
                s=fIn.readLine();
                line = new StringTokenizer(s,";");
                line.nextToken();
                line.nextToken();
                s2=line.nextToken();
                valore[i]=Integer.parseInt(s2);
                line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                str[i]=s;
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(valore[i]<valore[j]){
                        temp2=valore[i];
                        valore[i]=valore[j];
                        valore[j]=temp2;

                        temp=str[i];
                        str[i]=str[j];
                        str[j]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(str[i]+"\n");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    void ordinamentoCampionato(){
        String s,s2;
        StringTokenizer line;
        int n = numSquadre();
        String campionato[]=new String[n];
        String str[]=new String[n];
        String temp;
        int temp2;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s = fIn.readLine();
            System.out.println("\n"+s+"\n");
            for(int i=0;i<n;i++){
                s=fIn.readLine();
                line = new StringTokenizer(s,";");
                line.nextToken();
                line.nextToken();
                line.nextToken();
                campionato[i]=line.nextToken();
                line.nextToken();
                line.nextToken();
                line.nextToken();
                str[i]=s;
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((campionato[i].compareTo(campionato[j])>0)){
                        temp=campionato[i];
                        campionato[i]=campionato[j];
                        campionato[j]=temp;

                        temp=str[i];
                        str[i]=str[j];
                        str[j]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(str[i]+"\n");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
