import javax.swing.*;
import java.awt.*;
public class EsLayout {
	public static void main(String args[]){
		JFrame frame = new JFrame("Finestra generica");
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);

		Font font = new Font("name",Font.ITALIC,15);
		
		JTextArea txa_output = new JTextArea(4,25);
		txa_output.setEditable(false);
		txa_output.setText("ciaoo belli");
		txa_output.append(" Mondo");
		JScrollPane scp=new JScrollPane(txa_output);
		JButton btn_saluto = new JButton("cliccami");
		
		frame.setSize(600,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(new BorderLayout());
		JTextField txt = new JTextField(2);
		JLabel lbl_name = new JLabel(".....Sto pensando");
		JLabel lbl_color1= new JLabel(" ");
		JLabel lbl_color2 = new JLabel(" ");
		
		panel.add(txt,BorderLayout.NORTH);
		panel.add(lbl_color1,BorderLayout.EAST);
		panel.add(scp,BorderLayout.CENTER);
		panel.add(lbl_color2,BorderLayout.WEST);
		panel.add(lbl_name,BorderLayout.SOUTH);

		panel.setFont(font);
		Container container = frame.getContentPane();
		container.add(panel);
		frame.setVisible(true);
		
		JDialog dialog = new JDialog(frame, "Ci sono problemi",true);
	}
}
