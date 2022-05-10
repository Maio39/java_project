/*
    Nome:       Marco Maier
    Classe:     4e
    Data:       25/11/2020
    Oggetto:    Test Classe DizionarioEmail
*/

import java.io.*;
public class TestEmail {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        int opt;
        String s;
        DizionarioEmail d1;
        int n=1000;
        int scelta;
        boolean risposta;
        try{
            d1 = new DizionarioEmail(n);
            do{
                System.out.println("\n1 = Inserisci una email");
                System.out.println("\n2 = Visualizza una email lettera per lettera");
                System.out.println("\n3 = Cerca una email con un certo prefisso");
                System.out.println("\n4 = Cerca una email che contenga una certa sottostringa");
                System.out.println("\n5 = Cerca una email con un certo dominio");
                System.out.println("\n6 = Modifica una email");
                System.out.println("\n7 = Ordina alfabeticamente le email");
                System.out.println("\n8 = Ordina le email per dominio");
                System.out.println("\n0 = ESCI");
                System.out.println("\n\nInserisci l'opzione desiderata: ");

                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        d1.insertEmail();
                    break;
                    case 2:
                        System.out.println("\nInserisci l'email da scandire: ");
                        s=in.readLine();
                        scelta=Integer.parseInt(s);
                        d1.visualEmail(scelta);

                    break;
                    case 3:
                        System.out.println("Inserisci le/a iniziali/e: ");
                        s=in.readLine();
                        System.out.println(d1.cercaEmail(s));
                    break;
                    case 4:
                        System.out.println("Inserisci la parola: ");
                        s=in.readLine();
                        System.out.println(d1.cercaEmailStr(s));   
                    break;
                    case 5:
                        System.out.println("Inserisci il dominio: ");
                        s=in.readLine();
                        System.out.println(d1.cercaEmailDm(s));
                    break;
                    case 6:
                        System.out.println("\nInserisci quale email modificare: ");
                        s=in.readLine();
                        scelta=Integer.parseInt(s);
                        System.out.println("\nInserisci l'email modificata: ");
                        s=in.readLine();
                        risposta=d1.modificaEmail(scelta, s);
                        if(risposta==true){
                            System.out.println("l'operazione è andata a buon fine");
                        }else{
                            System.out.println("L'operazione non è andata a buon fine");
                        }
                    break;
                    case 7:
                        d1.ordinamentoAlfabetico();
                    break;
                    case 8:
                        d1.ordinamentoDominio();
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
        }
    }
}
