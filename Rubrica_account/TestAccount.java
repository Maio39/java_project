/*
    Nome:           Marco Maier
    Classe:         4E
    Data:           2/12/2020
    Oggetto:        Realizzare una rubrica di massimo N accounts.
                    Ogni account è costituito dai seguenti dati: 
                    - email
                    - password
                    - data di nascita GG-MM-AAAA 

                    La classe account dovrà avere, almeno, i seguenti metodi:
                    - metodi getter e setter (con eventuale validazione)
                    - toStringa (per visualizzare l'account)
                    La classe rubrica dovrà avere, almeno, i seguenti metodi:
                    - inserimento utente
                    - visualizzazione degli utenti
                    - ricerca per data di nascita dell'utente
                    - modifica di un determinato account (specificando l'email)
*/
import java.io.*;
public class TestAccount {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        String s;
        int opt,n;
        Rubrica r;
        Data d;
        int gg,mm,aa;
        String email3;
        try{
            System.out.println("Di quanti account la vuoi la rubrica? ");
            s=in.readLine();
            n=Integer.parseInt(s);
            r=new Rubrica(n);
            FileEmail file;
            do{
                System.out.println("\nScegli l'opzione desiderata: ");
                System.out.println("\n1 = Inserisci un account");
                System.out.println("\n2 = visualizza tutti gli account");
                System.out.println("\n3 = ricerca un account in base alla data");
                System.out.println("\n4 = Modifica un determinato account");
                System.out.println("\n5 = Registra tutti gli account su un file");
                System.out.println("\n6 = Legge tutti gli accont registrati sul file");
                System.out.println("\n0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        r.insertAccount();
                    break;
                    case 2:
                        r.visualizzaAccount();
                    break;
                    case 3:
                        System.out.println("\nInserisci la data da cercare: ");
                        System.out.println("\nInserisci il giorno: ");
                        s=in.readLine();
                        gg=Integer.parseInt(s);
                        System.out.println("\nInserisci il mese: ");
                        s=in.readLine();
                        mm=Integer.parseInt(s);
                        System.out.println("\nInserisci l'anno: ");
                        s=in.readLine();
                        aa=Integer.parseInt(s);
                        d=new Data(gg, mm, aa);
                        r.ricercaData(d);
                    break;
                    case 4:
                        System.out.println("\nInserisci l'email dell'account da modificare: ");
                        email3=in.readLine();
                        r.modificaAccount(email3);
                    break;
                    case 5:
                        System.out.println("Inserisci il File in cui registrare gli account: ");
                        s=in.readLine();
                        file = new FileEmail(s);
                        for(int i=0;i<r.nAcc;i++){
                            s=r.accounts[i].toStringa();
                            file.scriviFile(s);
                        }
                    break;
                    case 6:
                        System.out.println("Inserisci il File in cui leggere gli account registrati: ");
                        s=in.readLine();
                        file = new FileEmail(s);
                        file.letturaFile();
                    break;
                }
            }while(opt!=0);


        }
        catch(Exception e){
        }
    }
}
