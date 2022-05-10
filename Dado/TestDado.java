import java.io.*;
class TestDado {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        String s;
        int risp;
        int n1,n2;
        Dado d1,d2;
        d1 = new Dado();
        d2 = new Dado();
        try{
            do{
                System.out.println("Vuoi lanciare i dadi?");
                System.out.println("1 = SI");
                System.out.println("0 = NO");
                s = in.readLine();
                risp = Integer.parseInt(s);
                if(risp == 1){
                    n1 = d1.lancioDado();
                    n2 = d2.lancioDado();
                    System.out.println("Nel primo dado è uscito il numero: "+n1);
                    System.out.println("Nel secondo dado è uscito il numero: "+n2);
                    if(d1.confronto(n1,n2)==1){
                        System.out.println("I due numeri usciti dai dadi sono uguali!!");
                    }
                    if(d1.confronto(n1, n2)==2){
                        System.out.println("Il numero uscito dal primo dado è maggiore del numero uscito dal secondo");
                    }
                    if(d1.confronto(n1, n2)==3){
                        System.out.println("Il numero uscito dal secondo dado è maggiore del numero uscito dal primo");
                    }
                    System.out.println("La somma dei numeri usciti dai dadi è: "+d1.sommaDadi(n1, n2));
                }
            }while(risp != 0);
            

        }
        catch(Exception e){
        }

    }
}
