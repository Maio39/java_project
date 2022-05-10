/*
    nome:       Marco
    cognome:    Maier
    classe:     4E
    Data:       27/04/2021
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.*;
import java.awt.*;
public class GestoreCronometroPro implements ActionListener{
    CronometroPro cro;
    JLabel lblTime;
    JLabel lblGiro;
    GestoreCronometroPro(CronometroPro cro,JLabel lblTime,JLabel lblGiro){
        this.cro=cro;
        this.lblTime=lblTime;
        this.lblGiro=lblGiro;
    }

    public void actionPerformed(ActionEvent e){
        int num=0;
        int ris;
        int cont=0;
        if(e.getActionCommand().equals("Start")){
            cro.start=true;
        }
        if(e.getActionCommand().equals("Stop")){
            cro.start=false;
        }
        if(e.getActionCommand().equals("Giro")){
            cont++;
            if(cont==1){
                num=cro.i;
                lblGiro.setText("Giro Intermedio "+num+" Sec");
            }else{
                ris=(num+cro.i)/2;
                num=cro.i;
                lblGiro.setText("Giro Intermedio "+ris+" Sec");
            }
        }
        if(e.getActionCommand().equals("Reset")){
            cro.i=0;
            lblTime.setText("0 Sec");
        }
        if(e.getActionCommand().equals("Start Timer")){
            cro.start2=true;
        }
    }
}
