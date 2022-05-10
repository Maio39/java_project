/*
    Nome:       Marco Maier
    Data:       16/12/2020
    Classe:     4E
    Oggetto:    Test classe comuni
*/
import java.io.*;
public class TestComuni {
    public static void main(String[] args) {
        FileComuni fc;
        String nomeFile = "listacomuni.CSV";
        String s;
        int opt;
        String provincia;
        String nomeFileBackup;
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            fc = new FileComuni(nomeFile);
            do{
                System.out.println("Inserisci l'opzione desiderata: ");
                System.out.println("1 = Visualizza tutti i campi ben distanziati");
                System.out.println("2 = Visualizza I dati di una certa provincia");
                System.out.println("3 = Fai il backup del file");
                System.out.println("0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        fc.letturaCampiDistanziati();
                    break;
                    case 2:
                        System.out.println("Inserisci la provincia da cercare: ");
                        provincia=in.readLine();
                        fc.DatiProvincia(provincia);
                    break;
                    case 3:
                        System.out.println("Inserisci il nome del file dove viene salvato il backup");
                        nomeFileBackup=in.readLine();
                        fc.backup(nomeFileBackup);
                    break;
                }


            }while(opt!=0);
            //fc.letturaCampiDistanziati();
            System.out.println("Inserisci la provincia da cercare: ");
            s=in.readLine();
            fc.DatiProvincia(s);
        }
        catch(Exception e){
        }
    }
}
