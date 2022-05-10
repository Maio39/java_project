import java.io.*;
import java.util.StringTokenizer;
public class ListaFrazioni {
    private Nodo testa;
    private Nodo coda;
    private int n;
    ListaFrazioni(){
        this.testa=null;
        this.coda=null;
        this.n=0;
    }

    Nodo insertCoda(Frazione fr){
        Nodo nuovo = new Nodo(fr,null);
        if(testa==null){
            coda=nuovo;
            testa=coda;
        }else{
            coda.setNext(nuovo);
            coda=nuovo;
        }
        n++;
        return nuovo;
    }

    void leggere(){
        Nodo temp;
        temp = testa;
        while(temp!=null){
            System.out.println(temp.toStringa());
            temp=temp.getNext();
        }
    }

    void listaFile(String nomeFile){
        Nodo temp;
        temp = testa;
        boolean modScrittura=true;
        String str;
        try{
            FileWriter fw = new FileWriter(nomeFile,modScrittura);
            PrintWriter fOut = new PrintWriter(fw);
            while(temp!=null){
                str=temp.toStringa();
                fOut.println(str);
                temp=temp.getNext();
                fOut.flush();
            }
            fOut.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }

    Frazione sommaFrazioni(){
        Nodo temp;
        temp=testa;
        Frazione ris = new Frazione(temp.fr);
        while(temp!=null){
            ris=ris.somma(temp.getNext().fr);
            temp=temp.getNext();

        }
        return ris;
    }

    void fileLista(String nomeFile){
        String s,s2;
        StringTokenizer st;
        int n,d;
        Frazione fra;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIn = new BufferedReader(fr);
            s=fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s, "/");
                s2=st.nextToken();
                n=Integer.parseInt(s2);
                s2=st.nextToken();
                d=Integer.parseInt(s2);
                fra = new Frazione(n, d);
                insertCoda(fra);
                s=fIn.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

}
