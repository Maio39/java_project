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
class Account{
    private String email;
    private String password;
    Data d1;

    Account(String email, String password){
        this.email=email;
        this.password=password;
        insertData();
        
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }

    String toStringa(){
        String res;
        res="\nEmail: "+this.email+"\nPassword: "+this.password+"\nData: "+d1.toStringa();
        return res;
    }

    void insertData(){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        int giorno;
        int mese;
        int anno;
        String s;
        boolean risp;
        try{
            d1 = new Data();
            do{
                System.out.println("\nInserisci il giorno: ");
                s=in.readLine();
                giorno=Integer.parseInt(s);
                risp=d1.setDays(giorno);
            }while(risp!=false);

            do{
                System.out.println("\nInserisci il mese: ");
                s=in.readLine();
                mese=Integer.parseInt(s);
                risp=d1.setMonths(mese);
            }while(risp!=true);

            do{
                System.out.println("\nInserisci l'anno: ");
                s=in.readLine();
                anno=Integer.parseInt(s);
                risp=d1.setYears(anno);
            }while(risp!=true);

        }
        catch(Exception e){
        }

    }
    

}