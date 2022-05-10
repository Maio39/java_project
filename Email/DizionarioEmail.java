/*
    Nome:       Maco Maier
    Classe:     4E
    Data:       20/11/2020
    Oggetto:    Costruire una classe che gestisce un dizionario di N email con N stabilito dall'utilizzatore della classe.
                La classe permetterà le seguenti funzionalità.
                    - inserire le email
                    - visualizzare la email i-sima scandita con ogni lettera
                    - cercare una email con una iniziale
                    - modifica di un email
                    - ordinare alfabeticamente  
*/

import java.io.*;
class DizionarioEmail{
	String email[];
    int numEmail=0;
	DizionarioEmail(int n){
        email = new String[n];
	}
	
	void insertEmail(){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        try{
            int cont=0;
            int cont2=0;
            int l=0;
            do{
                if(cont==0){
                    System.out.println("Inserisci l'email: ");
                    email[numEmail]=in.readLine();
                    l=email[numEmail].length();
                    for(int i=0;i<l;i++){
                        if(email[numEmail].charAt(i)=='@'){
                            cont2++;
                        }
                    }
                }
                if(cont==1){
                    System.out.println("Non hai inserito la @ !!\n");
                    System.out.println("reinserisci l'email: ");
                    email[numEmail]=in.readLine();
                    for(int i=0;i<l;i++){
                        if(email[numEmail].charAt(i)=='@'){
                            cont2++;
                        }
                    }
                }
                if(cont2==1){
                    cont=0;
                }else{
                    cont=1;
                }
               
            }while(cont!=0);
            numEmail++;
        }
        catch(Exception e){
        }
	}
	
	void visualEmail(int scelta){
		int l;
		l=email[scelta].length();
		for(int i=0;i<l;i++){
			System.out.println(email[scelta].charAt(i));
		}
    }
    
    String cercaEmailStr(String str){
        String res;
        for(int i=0;i<numEmail;i++){
            if(email[i].indexOf(str)!=-1){
                return email[i];
            }
        }
        res="Non è stata trovata alcuna email con questa iniziali.";
        return res;
    }

    String cercaEmail(String iniziali){
        String res;
        for(int i=0;i<numEmail;i++){
            if(email[i].startsWith(iniziali)){
                return email[i];
            }
        }
        res="Non è stata trovata alcuna email con questa iniziali.";
        return res;
    }

    String cercaEmailDm(String dominio){
        String res;
        char punto='.';
        int index;
        for(int i=0;i<numEmail;i++){
            index=email[i].lastIndexOf(punto);
            if(email[i].indexOf(dominio, index)!=-1){
                return email[i];
            }
        }
        res="Non è stata trovata alcuna email con questo dominio.";
        return res;
    }


    boolean modificaEmail(int scelta, String strMod){
        if(scelta<numEmail){
            email[scelta].replaceAll(email[scelta], strMod);
            return true;
        }else{
            return false;
        }
    }

    void ordinamentoAlfabetico(){
        String tmp;
        for(int i=0;i<numEmail-1;i++){
            for(int j=i+1;j<numEmail;j++){
                if(email[i].compareToIgnoreCase(email[j])==1){
                    tmp=email[i];
                    email[i]=email[j];
                    email[j]=tmp;
                }
            }
        }
        for(int i=0;i<numEmail;i++){
            System.out.println(email[i]);
        }
    }
    void ordinamentoDominio(){
        String tmp;
        int index,index2;
        char punto='.';
        char dom[];
        String dominio1,dominio2;
        dom = new char[3];
        for(int i=0;i<numEmail-1;i++){
            for(int j=i+1;j<numEmail;j++){
                index=email[i].lastIndexOf(punto);
                index2=email[j].lastIndexOf(punto);
                for(int k=index+1;k<email[i].length();k++){
                    for(int h=0;h<3;h++){
                        dom[h]=email[i].charAt(k);
                    }
                }
                dominio1=copyValueOf(dom);
                for(int k=index2+1;k<email[j].length();k++){
                    for(int h=0;h<3;h++){
                        dom[h]=email[j].charAt(k);
                    }
                }
                dominio2=copyValueOf(dom);
                if(dominio1.compareToIgnoreCase(dominio2)==1){
                    tmp=email[i];
                    email[i]=email[j];
                    email[j]=tmp;
                }
            }
        }
    }
}