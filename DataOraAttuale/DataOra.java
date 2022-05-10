/*

Oggetto: Stampa il giorno e l'ora corrente

*/

//import java.util.GregorianCalendar;
//import java.util.Calendar;
import java.util.*;

class DataOra{
    public static void main(String[] args) {
        GregorianCalendar c;
        c=new GregorianCalendar();
        int a,m,g;
        int hh,mm,ss;
        a=c.get(Calendar.YEAR);
        System.out.println("Anno: "+a);
        m=c.get(Calendar.MONTH)+1;
        System.out.println("Mese: "+m);
        g=c.get(Calendar.DAY_OF_MONTH);
        hh=c.get(Calendar.HOUR_OF_DAY);
        mm=c.get(Calendar.MINUTE);
        ss=c.get(Calendar.SECOND); 
    }




}