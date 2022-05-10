import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class GestoreFinestra2 implements ActionListener{
    JLabel lbl;
	public GestoreFinestra2(JLabel lbl){
		this.lbl=lbl;
	}
	public void actionPerformed(ActionEvent e){
		String comando;
		String num = lbl.getText();
		int n = Integer.parseInt(num);
		comando=e.getActionCommand();
		if(comando.equals("+5")){
			n+=5;
		}
		if(comando.equals("-5")){
			n-=5;
		}
		if(comando.equals("reset")){
			n = 0;
		}
		num = n+"";
		if(n<0){
			lbl.setForeground(Color.BLACK);
			lbl.setOpaque(true);
			lbl.setFont(new Font("TimesRoman",Font.ITALIC,20));
		}
		if(n>=0 && n<=15){
			lbl.setForeground(Color.RED);
			lbl.setOpaque(true);
			lbl.setFont(new Font("TimesRoman",Font.ITALIC,30));
		}
		if(n>15){
			lbl.setForeground(Color.ORANGE);
			lbl.setOpaque(true);
			lbl.setFont(new Font("TimesRoman",Font.ITALIC,40));
		}
		lbl.setText(num);
	}
}
