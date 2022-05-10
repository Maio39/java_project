import java.io.*;
public class TestFile {
    public static void main(String[] args) {
        String s;
        int opt;
        String nomeFile,frase;
        FrasiFile f1;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        try{
            System.out.println("Inserisci il nome del file: ");
            nomeFile=in.readLine();
            f1 = new FrasiFile(nomeFile);
            do{
                System.out.println("Inserisci l'opzione desiderata: ");
                System.out.println("1 = Scrivi Frase");
                System.out.println("2 = Leggi file");
                System.out.println("0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("Inserisci la una frase famosa: ");
                        frase=in.readLine();
                        f1.scriviFile(frase);
                    break;
                    case 2:
                        f1.letturaFile();
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
        }
    }
}
