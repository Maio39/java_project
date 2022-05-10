import java.io.*;
public class TestCilindro {
    public static void main(String[] args) {
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            int opt;
            String s;
            double raggio,altezza;
            System.out.println("\nCreazione cilindro: ");
            System.out.println("\nInserisci il raggio: ");
            s=in.readLine();
            raggio=Double.parseDouble(s);
            System.out.println("\nInserisci l'altezza: ");
            s=in.readLine();
            altezza=Double.parseDouble(s);
            Cilindro cil = new Cilindro(raggio, altezza);
            do{
                System.out.println("\nInserisci l'opzione desiderata: ");
                System.out.println("\n1 = Calcola l'area di base del cilindro");
                System.out.println("\n2 = Calcola il volume del cilindro");
                System.out.println("\n3 = Modifica il raggio");
                System.out.println("\n4 = Modifica l'altezza");
                System.out.println("\n0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("\nArea di base = "+cil.area());
                    break;
                    case 2:
                        System.out.println("\nvolume = "+cil.volume());
                    break;
                    case 3:
                        System.out.println("\nInserire la nuova misura del raggio: ");
                        s=in.readLine();
                        raggio=Double.parseDouble(s);
                        cil.setRaggio(raggio);
                    break;
                    case 4:
                        System.out.println("\nInserire la nuova misura dell'altezza: ");
                        s=in.readLine();
                        altezza=Double.parseDouble(s);
                        cil.setAltezza(altezza);
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
