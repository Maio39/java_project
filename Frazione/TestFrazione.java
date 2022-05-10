import java.io.*;
class TestFrazione {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        String s;
        int num;
        int den;
        Frazione f1,f2;
        Frazione ris;
        try{
            System.out.println("Inserisci il numeratore della frazione: ");
            s=in.readLine();
            num=Integer.parseInt(s);
            System.out.println("Inserisci il denominatore della frazione: ");
            s=in.readLine();
            den=Integer.parseInt(s);
            f1 = new Frazione(num, den);
            System.out.println("Inserisci il numeratore della frazione: ");
            s=in.readLine();
            num=Integer.parseInt(s);
            System.out.println("Inserisci il denominatore della frazione: ");
            s=in.readLine();
            den=Integer.parseInt(s);
            f2 = new Frazione(num, den);
            ris = f1.somma(f2);
            
            System.out.println(ris.toStringa());
        }
        catch(Exception e){
        }    
    }

}
