import java.io.*;
public class Test {
    public static void main(String[] args) {
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            String nomeFile="frazioni.CSV";
            int opt;
            String s;
            int num,den;
            Frazione fr1 = new Frazione(7, 6);
            Frazione fr2 = new Frazione(5, 3);
            ListaFrazioni lista = new ListaFrazioni();
            ListaFrazioni lista2 = new ListaFrazioni();
            do{
                System.out.println("\nInserire l'opzione desiderata");
                System.out.println("\n1 = Inserire una nuova frazione");
                System.out.println("\n2 = Fare la somma di due frazioni");
                System.out.println("\n3 = Inserire la lista di frazioni in un file");
                System.out.println("\n4 = Leggere tutte le frazioni");
                System.out.println("\n5 = Somma di tutte le frazioni");
                System.out.println("\n6 = Creare una lista con dati da un file e visualizzare la lista creata");
                System.out.println("\n0 = ESCI");
                s = in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("\nInserire il numeratore della frazione: ");
                        s=in.readLine();
                        num=Integer.parseInt(s);
                        System.out.println("\nInserire il denominatore della frazione: ");
                        s=in.readLine();
                        den=Integer.parseInt(s);
                        Frazione fr = new Frazione(num, den);
                        lista.insertCoda(fr);
                    break;
                    case 2:
                        System.out.println(fr1.somma(fr2).semplifica().toStringa());
                    break;
                    case 3:
                        lista.listaFile(nomeFile);
                    break;
                    case 4:
                        lista.leggere();
                    break;
                    case 5:
                        String ss;
                        ss=lista.sommaFrazioni().semplifica().toStringa();
                        System.out.println(ss);
                    break;
                    case 6:
                        lista2.fileLista(nomeFile);
                        lista2.leggere();
                    break;

                }

            }while(opt!=0);


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
