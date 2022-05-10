import javax.swing.*;
import java.awt.*;
public class EquazioneSecGrado{
	EquazioneSecGrado(){
		JFrame frame_principale = new JFrame("Equazione di secondo grado");
		frame_principale.setSize(600,500);
		frame_principale.setLocationRelativeTo(null);
		frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial",Font.ITALIC,15);

		JButton btn_risolvi = new JButton("Risolvi");

		JButton btn_piu = new JButton("+");
		JButton btn_meno = new JButton("-");
		
		JLabel lbl_a = new JLabel("a");
		//lbl_a.setBackground(Color.CYAN);
		//lbl_a.setOpaque(true);
		JLabel lbl_b = new JLabel("b");
		//lbl_b.setBackground(Color.CYAN);
		//lbl_b.setOpaque(true);
		JLabel lbl_c = new JLabel("c");
		//lbl_c.setBackground(Color.CYAN);
		//lbl_c.setOpaque(true);
		
		JTextField txt_a = new JTextField(2);
		JLabel lbl_x2 = new JLabel("X^2 +");
		//lbl_x2.setBackground(Color.WHITE);
		//lbl_x2.setOpaque(true);
		JTextField txt_b = new JTextField(2);
		JLabel lbl_x = new JLabel("X +");
		//lbl_x.setBackground(Color.WHITE);
		//lbl_x.setOpaque(true);
		JTextField txt_c = new JTextField(2);
		JLabel lbl_0 = new JLabel("= 0");
		//lbl_0.setBackground(Color.WHITE);
		//lbl_0.setOpaque(true);
		
		JPanel pnl_principale = new JPanel();
		pnl_principale.setBackground(Color.CYAN);
		JPanel pnl_equazione = new JPanel();
		pnl_equazione.setBackground(Color.CYAN);
		JPanel pnl_font = new JPanel();
		pnl_font.setBackground(Color.BLACK);
		
		JTextArea txa_ris = new JTextArea(25,25);
		txa_ris.setBackground(Color.GREEN);
		txa_ris.setEditable(false);
		JScrollPane scp=new JScrollPane(txa_ris);

		pnl_principale.setLayout(new BorderLayout());

		GridLayout gl = new GridLayout(2,6);
		pnl_equazione.setLayout(gl);
		pnl_equazione.add(lbl_a);
		pnl_equazione.add(new JLabel(""));
		pnl_equazione.add(lbl_b);
		pnl_equazione.add(new JLabel(""));
		pnl_equazione.add(lbl_c);
		pnl_equazione.add(new JLabel(""));
		pnl_equazione.add(txt_a);
		pnl_equazione.add(lbl_x2);
		pnl_equazione.add(txt_b);
		pnl_equazione.add(lbl_x);
		pnl_equazione.add(txt_c);
		pnl_equazione.add(lbl_0);

		GridLayout gl2 = new GridLayout(2,1);
		pnl_font.setLayout(gl2);
		pnl_font.add(btn_piu);
		pnl_font.add(btn_meno);

		pnl_principale.add(pnl_equazione,BorderLayout.NORTH);
		pnl_principale.add(scp,BorderLayout.CENTER);
		pnl_principale.add(btn_risolvi,BorderLayout.SOUTH);
		pnl_principale.add(pnl_font,BorderLayout.EAST);

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

		btn_piu.addActionListener(new GestorePulsantiFont(font,btn_risolvi,btn_piu,btn_meno,lbl_a,lbl_b,lbl_c,txt_a,lbl_x2,txt_b,lbl_x,txt_c,txa_ris,lbl_0));
		btn_meno.addActionListener(new GestorePulsantiFont(font,btn_risolvi,btn_piu,btn_meno,lbl_a,lbl_b,lbl_c,txt_a,lbl_x2,txt_b,lbl_x,txt_c,txa_ris,lbl_0));

		btn_risolvi.addActionListener(new GestorePulsanteRisolvi(btn_risolvi,txa_ris,txt_a,txt_b,txt_c));

		Container container = frame_principale.getContentPane();
		container.add(pnl_principale);
		frame_principale.setVisible(true);
		
	}

	public static void main(String[] args) {
		new EquazioneSecGrado();
	}
}