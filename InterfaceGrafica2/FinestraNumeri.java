import javax.swing.*;
import java.awt.*;
public class FinestraNumeri{
	public static void main(String args[]){
		JFrame frame = new JFrame("Finestra Numeri");
		JPanel panel = new JPanel();
		JLabel lbl_name = new JLabel("0");
		JButton btn_incrementa = new JButton("+5");
		JButton btn_decrementa = new JButton("-5");
		
		Container container = frame.getContentPane();
		btn_incrementa.addActionListener(new GestoreFinestra(lbl_name));
		btn_decrementa.addActionListener(new GestoreFinestra(lbl_name));
		panel.add(lbl_name);
		panel.add(btn_incrementa);
		panel.add(btn_decrementa);
		container.add(panel);
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}