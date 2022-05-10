import javax.swing.*;
import java.awt.*;
public class Finestrella{
	public static void main(String args[]){
		JFrame frame = new JFrame("Finestra generica");
		JPanel panel = new JPanel();
		
		JLabel lbl_name = new JLabel("Sono io");
		JButton btn_saluto = new JButton("cliccami");
		
		Container container = frame.getContentPane();
		btn_saluto.addActionListener(new GestoreFinestra(lbl_name));
	
		panel.add(lbl_name);
		panel.add(btn_saluto);
		container.add(panel);
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
