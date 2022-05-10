import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class GestoreOperatori implements ActionListener {
    Calcolatrice calc;
    GestoreOperatori(Calcolatrice calc){
        this.calc=calc;
    }

    public void actionPerformed(ActionEvent e) {
        double num1,num2;
        double ris;
        if(e.getActionCommand()=="+"){
            num1 = Double.parseDouble(calc.txt_num1.getText());
            num2 = Double.parseDouble(calc.txt_num2.getText());
            ris = num1+num2;
            calc.lbl_operatore.setText("+");
            calc.lbl_operazione.setText(" = "+ris);
            calc.txa_ris.append(num1+" + "+num2+" = "+ris+"\n\n");
        }
        if(e.getActionCommand()=="-"){
            num1 = Double.parseDouble(calc.txt_num1.getText());
            num2 = Double.parseDouble(calc.txt_num2.getText());
            ris = num1-num2;
            calc.lbl_operatore.setText("-");
            calc.lbl_operazione.setText(" = "+ris);
            calc.txa_ris.append(num1+" - "+num2+" = "+ris+"\n\n");
        }
        if(e.getActionCommand()=="*"){
            num1 = Double.parseDouble(calc.txt_num1.getText());
            num2 = Double.parseDouble(calc.txt_num2.getText());
            ris = num1*num2;
            calc.lbl_operatore.setText("*");
            calc.lbl_operazione.setText(" = "+ris);
            calc.txa_ris.append(num1+" * "+num2+" = "+ris+"\n\n");
        }
        if(e.getActionCommand()=="/"){
            num1 = Double.parseDouble(calc.txt_num1.getText());
            num2 = Double.parseDouble(calc.txt_num2.getText());
            if(num1!=0 && num2!=0){
                ris = num1/num2;
                calc.lbl_operatore.setText("/");
                calc.lbl_operazione.setText(" = "+ris);
                calc.txa_ris.append(num1+" / "+num2+" = "+ris+"\n\n");
            }else{
                calc.lbl_operatore.setText("/");
                calc.lbl_operazione.setText(" = "+"IMP");
                calc.txa_ris.append(num1+" / "+num2+" = "+"IMPOSSIBILE\n\n");
            }
        }
        if(e.getActionCommand()=="Salva"){
            String nomeFileTesto="Operazioni.txt";
            String s;
            boolean modScrittura=true;
            try{
                FileWriter fw = new FileWriter(nomeFileTesto,modScrittura);
                BufferedWriter bufferedWriter = new BufferedWriter(fw);
                s=calc.txa_ris.getText();
                bufferedWriter.write(calc.txa_ris.getText());
                JOptionPane.showMessageDialog(null,"Dati Salvati Correttamente","Salvataggio Dati",JOptionPane.INFORMATION_MESSAGE);
                bufferedWriter.close();
            }
            catch(IOException e2){
            }
        }
        if(e.getActionCommand()=="Reset"){
            calc.txt_num1.setText(" ");
            calc.txt_num2.setText(" ");
            calc.lbl_operatore.setText(" ");
            calc.lbl_operazione.setText(" = ");
            calc.txa_ris.setText(" ");
        }
        if(e.getActionCommand()=="++"){
            calc.sizeFont+=2;
            Font font = new Font("Arial",Font.ITALIC,calc.sizeFont);
            calc.btn_piu.setFont(font);
            calc.btn_meno.setFont(font);
            calc.btn_per.setFont(font);
            calc.btn_diviso.setFont(font);
            calc.btn_piu2.setFont(font);
            calc.btn_meno2.setFont(font);
            calc.btn_salva.setFont(font);
            calc.btn_reset.setFont(font);
            calc.txa_ris.setFont(font);
            calc.txt_num1.setFont(font);
            calc.txt_num2.setFont(font);
        }
        if(e.getActionCommand()=="--"){
            calc.sizeFont-=2;
            Font font = new Font("Arial",Font.ITALIC,calc.sizeFont);
            calc.btn_piu.setFont(font);
            calc.btn_meno.setFont(font);
            calc.btn_per.setFont(font);
            calc.btn_diviso.setFont(font);
            calc.btn_piu2.setFont(font);
            calc.btn_meno2.setFont(font);
            calc.btn_salva.setFont(font);
            calc.btn_reset.setFont(font);
            calc.txa_ris.setFont(font);
            calc.txt_num1.setFont(font);
            calc.txt_num2.setFont(font);
        }
        if(e.getActionCommand()=="Reset Font"){
            Font font = new Font("Arial",Font.ITALIC,20);
            calc.btn_piu.setFont(font);
            calc.btn_meno.setFont(font);
            calc.btn_per.setFont(font);
            calc.btn_diviso.setFont(font);
            calc.btn_piu2.setFont(font);
            calc.btn_meno2.setFont(font);
            calc.btn_salva.setFont(font);
            calc.btn_reset.setFont(font);
            calc.txa_ris.setFont(font);
            calc.txt_num1.setFont(font);
            calc.txt_num2.setFont(font);
        }
    }
}
