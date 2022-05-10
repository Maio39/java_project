import java.io.*;
class TestTriangolo {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        Triangolo t1;
        Triangolo t2;
        String s;
        String n;
        double b,s2,s3;

        try{
            System.out.print("\nInserisci la base: ");
            s=in.readLine();
            b=Double.parseDouble(s);

            System.out.print("\nInserisci il secondo lato: ");
            s=in.readLine();
            s2=Double.parseDouble(s);

            System.out.print("\nInserisci il terzo lato: ");
            s=in.readLine();
            s3=Double.parseDouble(s);

            System.out.print("\nInserisci il nome: ");
            n=in.readLine();

            t1=new Triangolo(b,s2,s3,n);
            t2=new Triangolo(10,15,15,"abc");
            System.out.println(t1.toStringa());
            System.out.println("\nIl perimetro è: "+t1.perimetro());
            System.out.println("L'area con la formula di Erone è: "+t1.areaErone());
            System.out.println("L'altezza è: "+t1.altezza());
            System.out.println("L'area calcolata con l'altezza è: "+t1.area());
            if(t1.equal(t2)==true){
                System.out.println("I triangoli hanno i lati uguali");
            }
            if(t1.equal(t2)==false){
                System.out.println("I triangoli hanno i lati diversi");
            }
            if(t1.compareTo(t2)==0){
                System.out.println("Le aree dei due triangoli sono uguali");
            }
            if(t1.compareTo(t2)==1){
                System.out.println("L'area del primo triangolo è maggiore dell'area del secondo");
            }
            if(t1.compareTo(t2)==-1){
                System.out.println("L'area del secondo triangolo è maggiore dell'area del primo");
            }
            if(t1.compareTo(t2)==2){
                System.out.println("ERRORE");
            }
        }
        catch(Exception e){
        }
    }
}
