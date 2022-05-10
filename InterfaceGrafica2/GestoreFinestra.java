import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class GestoreFinestra implements ActionListener{
	JLabel lbl;
	int n=0;
	String num;
	public GestoreFinestra(JLabel lbl){
		this.lbl=lbl;
	}
	public void actionPerformed(ActionEvent e){
		String comando;
		comando=e.getActionCommand();
		if(comando.equals("+5")){
			n=n+5;
			num = String.valueOf(n);
			lbl.setText(num);
		}
		if(comando.equals("-5")){
			n=n-5;
			num = String.valueOf(n);
			lbl.setText(num);
		}
		if(n<0){
			lbl.setBackground(Color.RED);
		}
		if(n>15){
			lbl.setBackground(Color.BLACK);
		}
	}
	
	public int getN(){
		return n;
	}
}
