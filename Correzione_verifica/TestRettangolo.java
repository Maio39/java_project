import java.io.*;
public class TestRettangolo {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
        Rettangolo r1;
        Rettangolo r2;
        double x,y;
        String s;
        int opt;
        int nPunto;
        try{
            System.out.println("primo rettangolo");
            System.out.println("Inserisci la coordinata x del primo punto: ");
            s=in.readLine();
            x=Double.parseDouble(s);
            System.out.println("Inserisci la coordinata y del primo punto: ");
            s=in.readLine();
            y=Double.parseDouble(s);
            Point p1=new Point(x,y);
            System.out.println("Inserisci la coordinata x del secondo punto: ");
            s=in.readLine();
            x=Double.parseDouble(s);
            System.out.println("Inserisci la coordinata y del secondo punto: ");
            s=in.readLine();
            y=Double.parseDouble(s);
            Point p2=new Point(x,y);
            r1=new Rettangolo(p1,p2,"Puffo");
            System.out.println("secondo rettangolo");
            System.out.println("Inserisci la coordinata x del primo punto: ");
            s=in.readLine();
            x=Double.parseDouble(s);
            System.out.println("Inserisci la coordinata y del primo punto: ");
            s=in.readLine();
            y=Double.parseDouble(s);
            p1=new Point(x,y);
            System.out.println("Inserisci la coordinata x del secondo punto: ");
            s=in.readLine();
            x=Double.parseDouble(s);
            System.out.println("Inserisci la coordinata y del secondo punto: ");
            s=in.readLine();
            y=Double.parseDouble(s);
            p2=new Point(x,y);
            r2=new Rettangolo(p1,p2,"Nino");
    
            do{
                System.out.println("Inserire l'opzione desiderata: ");
                System.out.println("1 = Visualizza i rettangoli con le rispettive aree");
                System.out.println("2 = Visualizza se i due rettangoli sono uguali o no");
                System.out.println("3 = Cambia le coordinte di u punto");
                System.out.println("0 = ESCI");
                s=in.readLine();
                opt=Integer.parseInt(s);
                switch(opt){
                    case 1:
                        System.out.println("Il primo rettangolo :"+r1.tostringa()+"area: "+r1.area());
                        System.out.println("Il secondo rettangolo :"+r2.tostringa()+"area: "+r2.area());
                    break;
                    case 2:
                        if(r1.equals(r2)){
                            System.out.println("I rettangoli sono uguali");
                        }else{
                            System.out.println("I rettangoli non sono uguali");
                        }
                    break;
                    case 3:
                        //input valori
                        System.out.println("Inserisci se modificare il punto 1 o il punto 2");
                        s=in.readLine();
                        nPunto=Integer.parseInt(s);
                        System.out.println("Inserisci la coordinata x del punto scelto");
                        s=in.readLine();
                        x=Double.parseDouble(s);
                        System.out.println("Inserisci la coordinata y del punto scelto");
                        s=in.readLine();
                        y=Double.parseDouble(s);
                        r1.setPunto(nPunto, x, y);
                    break;
                }
            }while(opt!=0);
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
