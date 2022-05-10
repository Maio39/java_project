import java.io.*;
public class TestNote {
    public static void main(String[] args) {
        String s;
        String testo;
        String categoria;
        int priorita;
        int opt;
        GestioneNote gn = new GestioneNote();
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            do{
                System.out.println("\nInserire l'opzione desiderata: ");
                System.out.println("\n1 = Inserire una nuova nota in una posizione scelta");
                System.out.println("\n2 = Rimuovere una nota in una posizione scelta");
                System.out.println("\n3 = Visualizza tutte le note");
                System.out.println("\n4 = ricercare le note che contengono una frase o una parola");
                System.out.println("\n5 = Ordinamento in ordine alfabetico");
                System.out.println("\n0 = ESCI");
                s=in.readLine();
                opt = Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("\nInserisci il testo della nota: ");
                        testo=in.readLine();
                        System.out.println("\nInserisci la categoria della nota: ");
                        categoria=in.readLine();
                        System.out.println("\nInserisci la priorità (da 1 a 3): ");
                        s=in.readLine();
                        priorita=Integer.parseInt(s);
                        Nota n = new Nota(testo, categoria, priorita);
                        System.out.println("\nInserisci la posizione in cui inserire la nota: ");
                        s=in.readLine();
                        int index= Integer.parseInt(s);
                        gn.insertNotaPosition(index, n);
                    break;
                    case 2:
                        Nota n1;
                        System.out.println("\nInserisci la posizione in cui rimuovere la nota: ");
                        s=in.readLine();
                        int index2= Integer.parseInt(s);
                        n1=gn.removeNote(index2);
                        System.out.println("\nNota rimossa: ");
                        System.out.println(n1.toStringa());
                    break;
                    case 3:
                        gn.visualNote();
                    break;
                    case 4:
                        System.out.println("\nInserisci la parola o una frase da cercare: ");
                        String parola=in.readLine();
                        gn.cercaParola(parola);
                    break;
                    case 5:
                        gn.orderByFrequency();
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
