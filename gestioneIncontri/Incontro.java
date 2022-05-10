/*
    Nome:           Marco 
    Cognome:        Maier
    Classe:         4E
    Data:           11/03/2021
    Oggetto:        Classe Incontro
*/
public class Incontro {
    String squadra1;
    String squadra2;
    int punteggioSquadra1;
    int punteggioSquadra2;
    int giornata;
    Data dataIncontro;


    Incontro(String squadra1, String squadra2, int punteggioSquadra1, int punteggioSquadra2,int giornata, Data dataIncontro){
        this.squadra1=squadra1;
        this.squadra2=squadra2;
        this.punteggioSquadra1=punteggioSquadra1;
        this.punteggioSquadra2=punteggioSquadra2;
        this.giornata=giornata;
        this.dataIncontro=dataIncontro;
    }

    String toStringa(){
        String s;
        s=squadra1+";"+squadra2+";"+punteggioSquadra1+":"+punteggioSquadra2+";"+giornata+";"+dataIncontro.toStringa();
        return s;
    }
}
