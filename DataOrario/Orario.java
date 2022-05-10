import java.util.*;
class Orario{
    private int ora;
    private int minuti;
    private int secondi;

    Orario(int ora, int minuti, int secondi){
        this.ora=ora;
        this.minuti=minuti;
        this.secondi=secondi;
    }

    Orario(){
        GregorianCalendar c;
        c=new GregorianCalendar();
        this.ora=c.get(Calendar.HOUR_OF_DAY);
        this.minuti=c.get(Calendar.MINUTE);
        this.secondi=c.get(Calendar.SECOND);
    }
    public int getHours(){
        return this.ora;
    }
    public int getMinutes(){
        return this.minuti;
    }
    public int getSeconds(){
        return this.secondi;
    }
    public boolean setHours(int hours){
        if(hours<0 || hours>=24){
            return false;
        }else{
            this.ora=hours;
            return true;
        }
    }
    public boolean setMinutes(int minutes){
        if(minutes<0 || minutes>=60){
            return false;
        }else{
            this.minuti=minutes;
            return true;
        }
    }
    public boolean setSeconds(int seconds){
        if(seconds<0 || seconds>=60){
            return false;
        }else{
            this.secondi=seconds;
            return true;
        }
    }
        

    String toStringa(){
        String res;
        res = "\nOra = "+ora+ "\nMinuti = "+minuti+ "\nSecondi = "+secondi;
        return res;
    }

    int toSeconds(){
        int s;
        s=ora*3600+minuti*60;
        return s;
    }

    void fromSeconds(int seconds){
        if(seconds>3599){
            ora=seconds/3600;
        }
        while(seconds>3600){
            seconds -= 3600;
        }
        minuti = seconds/60;
        while(seconds>60){
            seconds -= 60;
        }
        secondi = seconds;
    }

    void confrontoOrari(Orario o1, Orario o2){
        if(o1.ora>o2.ora){
            System.out.println("\nIl primo orario inserito è maggiore del secondo");
        }
        if(o1.ora<o2.ora){
            System.out.println("\nIl secondo orario inserito è maggiore del primo");
        }
        if(o1.ora==o2.ora){
            if(o1.minuti>o2.minuti){
                System.out.println("\nIl primo orario inserito è maggiore del secondo");
            }
            if(o1.minuti<o2.minuti){
                System.out.println("\nIl secondo orario inserito è maggiore del primo");
            }
            if(o1.minuti==o2.minuti){
                if(o1.secondi>o2.secondi){
                    System.out.println("\nIl primo orario inserito è maggiore del secondo");
                }
                if(o1.secondi<o2.secondi){
                    System.out.println("\nIl secondo orario inserito è maggiore del primo");
                }
                if(o1.secondi==o2.secondi){
                    System.out.println("\nI due orari sono uguali");
                }
            }
        }
    }

    int differenzaOrari(Orario o1, Orario o2){
        int ss;
        if(o1.ora>o2.ora){
            ss=o1.toSeconds()-o2.toSeconds();
            return ss;
        }
        if(o1.ora<o2.ora){
            ss=o2.toSeconds()-o1.toSeconds();
            return ss;
        }
        if(o1.ora==o2.ora){
            if(o1.minuti>o2.minuti){
                ss=o1.toSeconds()-o2.toSeconds();
                return ss;
            }
            if(o1.minuti<o2.minuti){
                ss=o2.toSeconds()-o1.toSeconds();
                return ss;
            }
            if(o1.minuti==o2.minuti){
                if(o1.secondi>o2.secondi){
                    ss=o1.toSeconds()-o2.toSeconds();
                    return ss;
                }
                if(o1.secondi<o2.secondi){
                    ss=o2.toSeconds()-o1.toSeconds();
                    return ss;
                }
                if(o1.secondi==o2.secondi){
                   ss=o1.toSeconds()-o2.toSeconds();
                   return ss;
                }
            }
        }
        return 0;
    }

    
}