import javax.swing.*;
import java.awt.*;
public class FinestraContatore {
    public static void main(String[] args){
		JFrame frame = new JFrame("Finestra Numeri");
		JPanel panel = new JPanel();
		JLabel lbl_name = new JLabel("0");
		JButton btn_incrementa = new JButton("+5");
		JButton btn_decrementa = new JButton("-5");
		JButton btn_reset = new JButton("reset");
		Container container = frame.getContentPane();
		btn_incrementa.addActionListener(new GestoreFinestra2(lbl_name));
		btn_decrementa.addActionListener(new GestoreFinestra2(lbl_name));
		btn_reset.addActionListener(new GestoreFinestra2(lbl_name));
		panel.add(lbl_name);
		panel.add(btn_incrementa);
		panel.add(btn_decrementa);
		panel.add(btn_reset);
		container.add(panel);
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
