import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsanteRisolvi implements ActionListener {
    EquazioneSecGrado eq;
    GestorePulsanteRisolvi(EquazioneSecGrado eq){
        this.eq=eq;
    }

    public void actionPerformed(ActionEvent e){
        double a,b,c;
        double d;
        double s1, s2;
        if(e.getActionCommand()=="Risolvi"){
            a=Double.parseDouble(eq.txt_a.getText());
            b=Double.parseDouble(eq.txt_b.getText());
            c=Double.parseDouble(eq.txt_c.getText());
            if(a!=0 && b!=0){
                d=b*b-4*a*c;
                if(d==0){
                    s1 = -b / (2 * a);
                    s2 = s1;
                    eq.txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    eq.txa_ris.append("x1 = "+s1+"  x2 = "+s2+"\n\n");
                }
                if(d>0){
                    s1 = (-b + Math.sqrt(b*b -4*a*c))/(2*a);
                    s2 = (-b - Math.sqrt(b*b -4*a*c))/(2*a);
                    eq.txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    eq.txa_ris.append("x1 = "+s1+"  x2 = "+s2+"\n\n");
                }
                if(d<0){
                    eq.txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    eq.txa_ris.append("Le soluzioni sono complesse coniugate! \n\n");
                }
            }
        }
    }
}
