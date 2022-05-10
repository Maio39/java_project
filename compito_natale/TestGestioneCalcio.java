/*
    Nome:       Marco Maier
    Data:       feste
    Classe:     4E
    Oggetto:    Test classe GestioneSquadra
*/
import java.io.*;
public class TestGestioneCalcio {
    public static void main(String[] args) {
        GestioneCalcio fgc;
        String nomeFile = "ListaSquadre.CSV";
        String s;
        int opt;
        String squadra;
        String nomeFileBackup;
        String nome,camp;
        int anno,valore,vC,vCi,vCe;
        String nuovaSquadra;
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            fgc = new GestioneCalcio(nomeFile);
            do{
                System.out.println("Inserisci l'opzione desiderata: ");
                System.out.println("1 = Visualizza tutti i campi ben distanziati");
                System.out.println("2 = Visualizza I dati di una certa squadra");
                System.out.println("3 = Fai il backup del file");
                System.out.println("4 = Inserisci una nuova squadra");
                System.out.println("5 = Ricerca in base alle vittorie in campionato");
                System.out.println("6 = Ricerca in base al valore del club");
                System.out.println("7 = Ricerca in base al campionato di appartenenza");
                System.out.println("8 = Ordina in base al valore del club");
                System.out.println("9 = Ordina in base al campionato di appartenenza");
                System.out.println("0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        fgc.letturaCampiDistanziati();
                    break;
                    case 2:
                        System.out.println("Inserisci la squadra da cercare: ");
                        squadra=in.readLine();
                        fgc.datiSquadra(squadra);
                    break;
                    case 3:
                        System.out.println("Inserisci il nome del file dove viene salvato il backup");
                        nomeFileBackup=in.readLine();
                        fgc.backup(nomeFileBackup);
                    break;
                    case 4:
                        System.out.println("Nome: ");
                        nome = in.readLine();
                        System.out.println("Anno: ");
                        s = in.readLine();
                        anno = Integer.parseInt(s);
                        System.out.println("valore: ");
                        s = in.readLine();
                        valore = Integer.parseInt(s);
                        System.out.println("Campionato: ");
                        camp = in.readLine();
                        System.out.println("Vittorie Campionato: ");
                        s = in.readLine();
                        vC = Integer.parseInt(s);
                        System.out.println("vittorie Coppa Italiana: ");
                        s = in.readLine();
                        vCi = Integer.parseInt(s);
                        System.out.println("Vittoria Coppe Europee: ");
                        s = in.readLine();
                        vCe = Integer.parseInt(s);
                        nuovaSquadra=nome+";"+anno+";"+valore+";"+camp+";"+vC+";"+vCi+";"+vCe;
                        fgc.InserimentoSquadra(nuovaSquadra);
                    break;
                    case 5:
                        System.out.println("Inserisci il numero di vittorie da cercare: ");
                        s=in.readLine();
                        vC=Integer.parseInt(s);
                        fgc.ricercaVittorieCampionato(vC);
                    break;
                    case 6:
                        System.out.println("Inserisci il valore da cercare: ");
                        s=in.readLine();
                        valore=Integer.parseInt(s);
                        fgc.ricercaValore(valore);
                    break;
                    case 7:
                        System.out.println("Inserisci il campionato di appartenenza da cercare: ");
                        System.out.println("ESEMPIO: a , b , c ");
                        s=in.readLine();
                        fgc.ricercaCampionato(s);
                    break;
                    case 8:
                        fgc.ordinamentoValore();
                    break;
                    case 9:
                        fgc.ordinamentoCampionato();
                    break;
                }


            }while(opt!=0);
        }
        catch(Exception e){
        }
    }
}
