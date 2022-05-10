/*
    Nome:           Marco
    Cognome:        Maier
    Data:           18/03/2021
    Oggetto:        Test della Classe prodotto
                    
*/
import java.util.*;
import java.io.*;
public class TestSpesa {
    public static void main(String[] args) {
        int opt;
        String s;
        String nome;
        double quantità;
        double prezzoUnitario;
        int index;
        GestioneSpesa lista1 = new GestioneSpesa();
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            do{
                System.out.println("\n1 = Inserire un prodotto");
                System.out.println("\n2 = Rimuovere un prodotto");
                System.out.println("\n3 = Inserire un prodotto in una posizione specifica");
                System.out.println("\n4 = visualizzare la spesa");
                System.out.println("\n5 = Salvataggio della lista della spesa su file");
                System.out.println("\n6 = Visualizzare la lista della spesa di una data specifica");
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
                        quantità=Double.parseDouble(s);
                        Prodotto p = new Prodotto(nome, prezzoUnitario, quantità);
                        lista1.insertProdotto(p);
                    break;
                    case 2:
                        System.out.println("\ninserire l'indice in cui rimuovere il prodotto:");
                        s=in.readLine();
                        index=Integer.parseInt(s);
                        lista1.remove(index);
                    break;
                    case 3:
                        System.out.println("\nInserisci il nome del prodotto: ");
                        nome=in.readLine();
                        System.out.println("\nInserisci il prezzo unitario del prodotto");
                        s=in.readLine();
                        prezzoUnitario=Double.parseDouble(s);
                        System.out.println("\nInserisci la quantità: ");
                        s=in.readLine();
                        quantità=Double.parseDouble(s);
                        Prodotto p1 = new Prodotto(nome, prezzoUnitario, quantità);
                        System.out.println("\nInserire la posizione in cui inserire il prodotto: ");
                        s=in.readLine();
                        index=Integer.parseInt(s);
                        lista1.insertPosition(p1, index);
                    break;
                    case 4:
                        lista1.visualSpesa();
                    break;
                    case 5:
                        lista1.saveFile();
                    break;
                    case 6:
                        System.out.println("\nInserire la data da cercare: ");
                        System.out.println("Giorno: ");
                        s=in.readLine();
                        int g = Integer.parseInt(s);
                        System.out.println("Mese: ");
                        s=in.readLine();
                        int m = Integer.parseInt(s);
                        System.out.println("Anno");
                        s=in.readLine();
                        int a = Integer.parseInt(s);
                        Data d2 = new Data(g, m, a);
                        lista1.visualSpesaData(d2);
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
