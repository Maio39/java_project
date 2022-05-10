import java.io.*;
class TestOrario {

    public static void main(String args[]){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        Orario o1;
        Orario o2;
        Orario o3;
        String s;
        int o,m,ss;
        int risp1,risp2,risp;
        int cont=0;
        boolean risp3;
        try{
            System.out.println("Inserisci il primo orario: ");
            System.out.print("\nInserisci l'ora: ");
            s=in.readLine();
            o=Integer.parseInt(s);

            System.out.print("\nInserisci i minuti: ");
            s=in.readLine();
            m=Integer.parseInt(s);

            System.out.print("\nInserisci i secondi: ");
            s=in.readLine();
            ss=Integer.parseInt(s);

            o1 = new Orario(o,m,ss);

            System.out.println("Inserisci il secondo orario: ");
            System.out.print("\nInserisci l'ora: ");
            s=in.readLine();
            o=Integer.parseInt(s);

            System.out.print("\nInserisci i minuti: ");
            s=in.readLine();
            m=Integer.parseInt(s);

            System.out.print("\nInserisci i secondi: ");
            s=in.readLine();
            ss=Integer.parseInt(s);

            o2 = new Orario(o,m,ss);
            o3 = new Orario();

            do{
                System.out.println("Quale orario vuoi cambiare;");
                System.out.println("1 = Cambia l'orario1\n"+"2 = Cambia l'orario 2\n"+"0 = Non cambiare nessun orario\n");
                s=in.readLine();
                risp=Integer.parseInt(s);
                if(risp==1){
                    System.out.println("Che cosa vuoi cambiare?");
                    System.out.println("1 = Ora\n"+"2 = Minuti\n"+"3 = Secondi\n");
                    s=in.readLine();
                    risp1=Integer.parseInt(s);
                    if(risp1==1){
                        do{
                            System.out.println("Reinserisci l'ora: ");
                            s=in.readLine();
                            o=Integer.parseInt(s);
                            risp3=o1.setHours(o);
                        }while(risp3!=true);
                    }
                    if(risp1==2){
                        do{
                            System.out.println("Reinserisci i minuti: ");
                            s=in.readLine();
                            m=Integer.parseInt(s);
                            risp3=o1.setMinutes(m);
                        }while(risp3!=true);
                    }
                    if(risp1==3){
                        do{
                            System.out.println("Reinserisci i secondi: ");
                            s=in.readLine();
                            ss=Integer.parseInt(s);
                            risp3=o1.setSeconds(ss);
                        }while(risp3!=true);
                    }
                }
                if(risp==2){
                    System.out.println("Che cosa vuoi cambiare?");
                    System.out.println("1 = Ora\n"+"2 = Minuti\n"+"3 = Secondi\n");
                    s=in.readLine();
                    risp1=Integer.parseInt(s);
                    if(risp1==1){
                        do{
                            System.out.println("Reinserisci l'ora: ");
                            s=in.readLine();
                            o=Integer.parseInt(s);
                            risp3=o2.setHours(o);
                        }while(risp3!=true);
                    }
                    if(risp1==2){
                        do{
                            System.out.println("Reinserisci i minuti: ");
                            s=in.readLine();
                            m=Integer.parseInt(s);
                            risp3=o2.setMinutes(m);
                        }while(risp3!=true);
                    }
                    if(risp1==3){
                        do{
                            System.out.println("Reinserisci i secondi: ");
                            s=in.readLine();
                            ss=Integer.parseInt(s);
                            risp3=o2.setSeconds(ss);
                        }while(risp3!=true);
                    }
                }
            }while(risp!=0);

            if(o1.getMinutes()>60||o1.getSeconds()>60){
                System.out.println("L'orario in secondi è: "+o1.toSeconds());
                o1.fromSeconds(o1.toSeconds());
                System.out.println(o1.toStringa());
            }else{
                System.out.println(o1.toStringa());
                System.out.println("L'orario in secondi è: "+o1.toSeconds()+"\n");
            }

            if(o2.getMinutes()>60||o2.getSeconds()>60){
                System.out.println("L'orario in secondi è: "+o2.toSeconds());
                o2.fromSeconds(o2.toSeconds());
                System.out.println(o2.toStringa());
            }else{
                System.out.println(o2.toStringa());
                System.out.println("L'orario in secondi è: "+o2.toSeconds()+"\n");
            }
            System.out.println(o3.toStringa());
            System.out.println("L'orario in secondi è: "+o3.toSeconds()+"\n");
            System.out.println("Quali orari vuoi confrontare? ");
            System.out.println("1 = Orario 1\n"+"2 = Orario 2\n"+"3 = Orario 3\n");
            System.out.println("Inserisci il primo orario da confrontare: ");
            s=in.readLine();
            risp1=Integer.parseInt(s);
            System.out.println("Inserisci il secondo orario da confrontare: ");
            s=in.readLine();
            risp2=Integer.parseInt(s);
            if(risp1 == 1 && risp2 == 2){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o1, o2));
                o1.confrontoOrari(o1, o2);
                cont++;
            }
            if(risp1 == 1 && risp2 == 3){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o1, o3));
                o1.confrontoOrari(o1, o3);
                cont++;
            }
            if(risp1 == 2 && risp2 == 1){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o2, o1));
                o1.confrontoOrari(o2, o1);
                cont++;
            }
            if(risp1 == 2 && risp2 == 3){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o2, o3));
                o1.confrontoOrari(o2, o3);
                cont++;
            }
            if(risp1 == 3 && risp2 == 1){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o3, o1));
                o1.confrontoOrari(o3, o1);
                cont++;
            }
            if(risp1 == 3 && risp2 == 2){
                System.out.println("La differenza tra l'orario più grande e quello più piccolo è: "+o1.differenzaOrari(o3, o2));
                o1.confrontoOrari(o3, o2);
                cont++;
            }
            if(cont == 0){
                System.out.println("Non è possibile confrontare perchè uno degli orari inseriti non esiste!");
            }
            

        }
        catch(Exception e){
        }

        



    }
}
