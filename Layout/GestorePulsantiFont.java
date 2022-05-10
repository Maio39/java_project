import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
public class GestorePulsantiFont implements ActionListener {
    Font font;
    JButton btn_risolvi;
    JButton btn_piu;
    JButton btn_meno;
    JLabel lbl_a;
    JLabel lbl_b;
    JLabel lbl_c;
    JTextField txt_a;
    JLabel lbl_x2;
    JTextField txt_b;
    JLabel lbl_x;
    JTextField txt_c;
    JTextArea txa_ris;
    JLabel lbl_0;
    GestorePulsantiFont(Font font,JButton btn_risolvi, JButton btn_piu, JButton btn_meno, JLabel lbl_a, JLabel lbl_b, JLabel lbl_c, JTextField txt_a, JLabel lbl_x2, JTextField txt_b, JLabel lbl_x, JTextField txt_c, JTextArea txa_ris, JLabel lbl_0){
        this.font=font;
        this.lbl_0=lbl_0;
        this.btn_meno=btn_meno;
        this.btn_piu=btn_piu;
        this.btn_risolvi=btn_risolvi;
        this.lbl_a=lbl_a;
        this.lbl_b=lbl_b;
        this.lbl_c=lbl_c;
        this.lbl_x=lbl_x;
        this.lbl_x2=lbl_x2;
        this.txa_ris=txa_ris;
        this.txt_a=txt_a;
        this.txt_b=txt_b;
        this.txt_c=txt_c;
    }
    public void actionPerformed(ActionEvent e){
        float sizeFont=font.getSize();
        if(e.getActionCommand()=="+"){
            font = font.deriveFont(sizeFont+1);
            lbl_0.setFont(font);
            lbl_a.setFont(font);
            lbl_b.setFont(font);
            lbl_c.setFont(font);
            lbl_x.setFont(font);
            lbl_x2.setFont(font);

            btn_meno.setFont(font);
            btn_piu.setFont(font);
            btn_risolvi.setFont(font);

            txt_a.setFont(font);
            txt_b.setFont(font);
            txt_c.setFont(font);

            txa_ris.setFont(font);
            sizeFont=font.getSize();
        }
        if(e.getActionCommand()=="-"){
            font = font.deriveFont(sizeFont-1);
            lbl_0.setFont(font);
            lbl_a.setFont(font);
            lbl_b.setFont(font);
            lbl_c.setFont(font);
            lbl_x.setFont(font);
            lbl_x2.setFont(font);

            btn_meno.setFont(font);
            btn_piu.setFont(font);
            btn_risolvi.setFont(font);

            txt_a.setFont(font);
            txt_b.setFont(font);
            txt_c.setFont(font);

            txa_ris.setFont(font);
            sizeFont=font.getSize();
        }
    }
}
