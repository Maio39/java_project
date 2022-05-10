/*
    Nome: Marco Maier
    data: 14/12/2020
    Oggetto: Testare lo stringtokenizer
*/

import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
class TestToken{
    public static void main(String[] args) {
        String s;
        StringTokenizer st;
        String campo1;
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);
            System.out.println("Inserisci una frase con i delimitatori");
            s=in.readLine();
            st= new StringTokenizer(s,";");
            while(st.hasMoreTokens()){
                campo1=st.nextToken();
                System.out.println(campo1);
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}