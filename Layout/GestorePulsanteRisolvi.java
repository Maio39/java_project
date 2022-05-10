import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsanteRisolvi implements ActionListener {
    JButton btn_risolvi;
    JTextArea txa_ris;
    JTextField txt_a;
    JTextField txt_b;
    JTextField txt_c;
    GestorePulsanteRisolvi(JButton btn_risolvi,JTextArea txa_ris,JTextField txt_a,JTextField txt_b, JTextField txt_c){
        this.btn_risolvi=btn_risolvi;
        this.txa_ris=txa_ris;
        this.txt_a=txt_a;
        this.txt_b=txt_b;
        this.txt_c=txt_c;
    }

    public void actionPerformed(ActionEvent e){
        double a,b,c;
        double d;
        double s1, s2;
        if(e.getActionCommand()=="Risolvi"){
            a=Double.parseDouble(txt_a.getText());
            b=Double.parseDouble(txt_b.getText());
            c=Double.parseDouble(txt_c.getText());
            if(a!=0 && b!=0){
                d=b*b-4*a*c;
                if(d==0){
                    s1 = -b / (2 * a);
                    s2 = s1;
                    txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    txa_ris.append("x1 = "+s1+"  x2 = "+s2+"\n\n");
                }
                if(d>0){
                    s1 = (-b + Math.sqrt(b*b -4*a*c))/(2*a);
                    s2 = (-b - Math.sqrt(b*b -4*a*c))/(2*a);
                    txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    txa_ris.append("x1 = "+s1+"  x2 = "+s2+"\n\n");
                }
                if(d<0){
                    txa_ris.append("a = "+a+"   b = "+b+"   c = "+c+"\n\n");
                    txa_ris.append("Le soluzioni sono complesse coniugate! \n\n");
                }
            }
        }
    }
}
