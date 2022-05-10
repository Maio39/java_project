import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class GestoreCronometro implements ActionListener{
    Cronometro cro;
    GestoreCronometro(Cronometro c){
        this.cro=c;
    }
    public void actionPerformed(ActionEvent e){
        String comando;
        comando = e.getActionCommand();
        if(comando.equals("Start")){
            cro.start=true;
        }
        if(comando.equals("Stop")){
            cro.start=false;
        }
        if(comando.equals("Reset")){
            cro.i=0;
            cro.j=0;
            cro.k=0;
        }
    }
}
