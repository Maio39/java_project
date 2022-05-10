/*
    Nome:           Marco
    Cognome:        Maier
    Data:           18/03/2021
    Oggetto:        Test della Classe prodotto
                    
*/
import java.util.*;
import java.io.*;
public class GestioneSpesa {
    public static void main(String[] args) {
        Vector spesa = new Vector<Prodotto>();
        int opt;
        String s;
        String nome;
        int quantità;
        double prezzoUnitario;
        int index;
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            do{
                System.out.println("\n1 = Inserire un prodotto");
                System.out.println("\n2 = Rimuovere un prodotto");
                System.out.println("\n3 = Inserire un prodotto in una posizione specifica");
                System.out.println("\n4 = visualizzare la spesa");
                System.out.println("\n0 = ESCI");
                System.out.println("\nInserire l'opzione desiderata: ");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("\nInserisci il nome del prodotto: ");
                        nome=in.readLine();
                        System.out.println("\nInserisci il prezzo unitario del prodotto");
                        s=in.readLine();
                        prezzoUnitario=Double.parseDouble(s);
                        System.out.println("\nInserisci la quantità: ");
                        s=in.readLine();
                        quantità=Integer.parseInt(s);
                        Prodotto p = new Prodotto(nome, prezzoUnitario, quantità);
                        spesa.add(p);
                    break;
                    case 2:
                        System.out.println("\ninserire l'indice in cui rimuovere il prodotto:");
                        s=in.readLine();
                        index=Integer.parseInt(s);
                        spesa.remove(index);
                    break;
                    case 3:
                        System.out.println("\nInserisci il nome del prodotto: ");
                        nome=in.readLine();
                        System.out.println("\nInserisci il prezzo unitario del prodotto");
                        s=in.readLine();
                        prezzoUnitario=Double.parseDouble(s);
                        System.out.println("\nInserisci la quantità: ");
                        s=in.readLine();
                        quantità=Integer.parseInt(s);
                        Prodotto p1 = new Prodotto(nome, prezzoUnitario, quantità);
                        System.out.println("\nInserire la posizione in cui inserire il prodotto: ");
                        s=in.readLine();
                        index=Integer.parseInt(s);
                        spesa.add(index, p1);
                    break;
                    case 4:
                        Prodotto p2;
                        for(int i=0;i<spesa.size();i++){
                            p2=(Prodotto) spesa.elementAt(i);
                            System.out.println(p2.toStringa());
                        }
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
