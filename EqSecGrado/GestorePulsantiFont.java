import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
public class GestorePulsantiFont implements ActionListener {
    EquazioneSecGrado eq;
    GestorePulsantiFont(EquazioneSecGrado eq){
        this.eq=eq;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="+"){
            eq.sizeFont+=5;
            Font font = new Font("Arial",Font.ITALIC,eq.sizeFont);
            eq.font = eq.font.deriveFont(eq.sizeFont);
            eq.lbl_0.setFont(font);
            eq.lbl_a.setFont(font);
            eq.lbl_b.setFont(font);
            eq.lbl_c.setFont(font);
            eq.lbl_x.setFont(font);
            eq.lbl_x2.setFont(font);

            eq.btn_meno.setFont(font);
            eq.btn_piu.setFont(font);
            eq.btn_risolvi.setFont(font);

            eq.txt_a.setFont(font);
            eq.txt_b.setFont(font);
            eq.txt_c.setFont(font);

            eq.txa_ris.setFont(font);
        }
        if(e.getActionCommand()=="-"){
            eq.sizeFont-=5;
            Font font = new Font("Arial",Font.ITALIC,eq.sizeFont);
            eq.lbl_0.setFont(font);
            eq.lbl_a.setFont(font);
            eq.lbl_b.setFont(font);
            eq.lbl_c.setFont(font);
            eq.lbl_x.setFont(font);
            eq.lbl_x2.setFont(font);

            eq.btn_meno.setFont(font);
            eq.btn_piu.setFont(font);
            eq.btn_risolvi.setFont(font);

            eq.txt_a.setFont(font);
            eq.txt_b.setFont(font);
            eq.txt_c.setFont(font);

            eq.txa_ris.setFont(font);
        }
    }
}
