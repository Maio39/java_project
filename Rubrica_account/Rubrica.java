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
public class Rubrica {
    Account accounts[];
    int nAcc=0;

    Rubrica(int n){
        accounts = new Account[n];
    }

    void insertAccount(){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        String email,password;
        try{
            System.out.println("Inserisci l'email: ");
            email=in.readLine();
            System.out.println("Inserisci la password: ");
            password=in.readLine();
            accounts[nAcc] = new Account(email, password);
            nAcc++;
        }
        catch(Exception e){
        }
    }
    void visualizzaAccount(){
        for(int i=0;i<nAcc;i++){
            System.out.println("\n"+accounts[i].toStringa());
        }
    }

    void ricercaData(Data d){
        for(int i=0;i<nAcc;i++){
            if(accounts[i].d1.confrontoDate(d)==3){
                System.out.println(accounts[i].toStringa());
            }
        }
    }

    void modificaAccount(String email){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        int opt;
        String s;
        String email2,password2;
        int g,m,a;
        try{
            for(int i=0;i<nAcc;i++){
                if(accounts[i].getEmail()==email){
                    do{
                        System.out.println("\nCosa vuoi modificare? ");
                        System.out.println("\n1 = EMAIL");
                        System.out.println("\n2 = PASSWORD");
                        System.out.println("\n3 = DATA");
                        System.out.println("\n0 = ESCI");
                        s=in.readLine();
                        opt=Integer.parseInt(s);
                        switch(opt){
                            case 1:
                                System.out.println("\nInserisci l'email modificata: ");
                                email2=in.readLine();
                                accounts[i].setEmail(email2);
                            break;
                            case 2:
                                System.out.println("\nInserisci la password modificata: ");
                                password2=in.readLine();
                                accounts[i].setPassword(password2);
                            break;
                            case 3:
                                System.out.println("\nInserisci il giorno modificato: ");
                                s=in.readLine();
                                g=Integer.parseInt(s);
                                accounts[i].d1.setDays(g);
                                System.out.println("\nInserisci il mese modificato: ");
                                s=in.readLine();
                                m=Integer.parseInt(s);
                                accounts[i].d1.setMonths(m);
                                System.out.println("\nInserisci l'anno modificato: ");
                                s=in.readLine();
                                a=Integer.parseInt(s);
                                accounts[i].d1.setYears(a);
                            break;
                        }
    
                    }while(opt!=0);
                }
            } 
        }
        catch(Exception e){
        }
    }


}
