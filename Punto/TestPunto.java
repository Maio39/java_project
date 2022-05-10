import java.io.*;
class TestPunto {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
    
        Punto p1,p2;
        String s;
        double x,y;
        try{
            System.out.println("Inserisci la coordinata x del punto 1");
            s=in.readLine();
            x=Integer.parseInt(s);

            System.out.println("Inserisci la coordinata y del punto 1");
            s=in.readLine();
            y=Integer.parseInt(s);

            p1 = new Punto(x,y);

            System.out.println("Inserisci la coordinata x del punto 2");
            s=in.readLine();
            x=Integer.parseInt(s);

            System.out.println("Inserisci la coordinata y del punto 2");
            s=in.readLine();
            y=Integer.parseInt(s);

            p2 = new Punto(x,y);

            System.out.println("La distanza dall'origine del primo punto è "+p1.distanzaOrigine());
            System.out.println("La distanza dall'origine del secondo punto è "+p2.distanzaOrigine());
            System.out.println("La distanza tra i due punti è "+p1.distanzaDuePunti(p2));
            System.out.println(p1.confrontoPunti(p1, p2));

        }
        catch(Exception e){
        }
    }
}
