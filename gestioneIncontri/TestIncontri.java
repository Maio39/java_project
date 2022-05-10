/*
    Nome:           Marco 
    Cognome:        Maier
    Classe:         4E
    Data:           11/03/2021
    Oggetto:        Classe test per la gestione degli incontri
*/
import java.io.*;
public class TestIncontri {
    public static void main(String[] args) {
        String squad1;
        String squad2;
        String s;
        String squadra;
        Data dataIncontro;
        int punteggioSquadra1;
        int punteggioSquadra2;
        int giornata;
        int opt;
        int g,m,a;
        ListaIncontri lista = new ListaIncontri();
        Incontro partita;
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            do{
                System.out.println("\n1 = Inserire un incontro");
                System.out.println("\n2 = visualizzare tutti gli incontri inseriti");
                System.out.println("\n3 = visualizzare gli incontri fatti da una certa squadra");
                System.out.println("\n0 = ESCI");
                System.out.println("\nScegli l'opzione desiderata: ");
                s=in.readLine();
                opt = Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("\nInserisci il nome della squadra di casa: ");
                        squad1=in.readLine();
                        System.out.println("\nInserisci il nome della squadra ospite: ");
                        squad2=in.readLine();
                        System.out.println("\nInserisci il punteggio della squadra di casa: ");
                        s=in.readLine();
                        punteggioSquadra1=Integer.parseInt(s);
                        System.out.println("\nInserisci il punteggio della squadra ospite: ");
                        s=in.readLine();
                        punteggioSquadra2=Integer.parseInt(s);
                        System.out.println("\nInserire la giornata della partita: ");
                        s=in.readLine();
                        giornata=Integer.parseInt(s);
                        System.out.println("\nInserire la data: ");
                        System.out.println("\nInserire il giorno: ");
                        s=in.readLine();
                        g=Integer.parseInt(s);
                        System.out.println("\nInserire il mese: ");
                        s=in.readLine();
                        m=Integer.parseInt(s);
                        System.out.println("\nInserire l'anno: ");
                        s=in.readLine();
                        a=Integer.parseInt(s);
                        dataIncontro = new Data(g, m, a);
                        partita = new Incontro(squad1, squad2, punteggioSquadra1, punteggioSquadra2, giornata, dataIncontro);
                        lista.insertCoda(partita);
                    break;
                    case 2:
                        lista.leggere();
                    break;
                    case 3:
                        System.out.println("\nInserisci la squadra di cui visualizzare gli incontri: ");
                        squadra=in.readLine();
                        lista.visualIncontriSquadra(squadra);
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
