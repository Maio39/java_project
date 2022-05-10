import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import java.io.*;
import java.awt.event.ActionEvent;
public class GestioneBottoni implements ActionListener{
    Conversione c;
    GestioneBottoni(Conversione c){
        this.c=c;
    }
    public void actionPerformed(ActionEvent e){
        int num;
        String r="";
        switch(e.getActionCommand()){
            case("Converti"):
                num = Integer.parseInt(c.txt_numDec.getText());
                if(num>255 || num<0){
                    JOptionPane.showMessageDialog(null, "Errore numero non inserito correttamente", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }else{
                    int ris=num;
                    int resto;
                    while(ris>0){
                        resto=ris%2;
                        c.txa_conv.append(""+ris);
                        ris=ris/2;
                        r=resto+r;
                        c.txa_conv.append(" / 2 = "+ris);
                        c.txa_conv.append("  Resto = "+resto+"\n");
                    }
                    c.txa_conv.append("Risultato = "+r+"\n");
                    c.lbl_risultato.setText(" = "+r);
                }
            break;
            case("Salva"):
                String s;
                String nomeFile="Conversione.txt";
                boolean modScrittura = true;
                try{
                    FileWriter fw = new FileWriter(nomeFile,modScrittura);
                    BufferedWriter bf = new BufferedWriter(fw);
                    s=c.txa_conv.getText();
                    bf.write(s);
                    bf.close();

                }
                catch(IOException e1){
                }

                
            break;
            case("Ultima operazione"):
            String nomeFile2 = "Conversione.txt";
            boolean modScrittura2 = true;
            String s2;
            try{
                FileReader fr = new FileReader(nomeFile2);
                BufferedReader br = new BufferedReader(fr);

            }
            catch(IOException e1){
            }
            break;
        }
    }
}
