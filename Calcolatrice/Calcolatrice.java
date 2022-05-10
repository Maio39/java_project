import java.awt.*;
import javax.swing.*;

public class Calcolatrice {
    Font font2;
    JButton btn_piu;
    JButton btn_meno;
    JButton btn_diviso;
    JButton btn_per;
    JButton btn_salva;
    JButton btn_piu2;
    JButton btn_meno2;
    JTextField txt_num1;
    JTextField txt_num2;
    JLabel lbl_operazione;
    JLabel lbl_operatore;
    JTextArea txa_ris;
    JButton btn_reset;
    JButton btn_reset2;
    int sizeFont=20;
    Calcolatrice(){
        JFrame frame_principale=new JFrame("Calcolatrice");
        frame_principale.setSize(600,500);
        frame_principale.setLocationRelativeTo(null);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_piu = new JButton("+");
        btn_meno = new JButton("-");
        btn_diviso = new JButton("/");
        btn_per = new JButton("*");
        btn_salva = new JButton("Salva");
        btn_reset = new JButton("Reset");
        btn_piu2 = new JButton("++");
        btn_meno2 = new JButton("--");
        btn_reset2 = new JButton("Reset Font");
        txt_num1 = new JTextField(2);
        txt_num2 = new JTextField(2);
        lbl_operazione = new JLabel(" =  ");
        lbl_operatore = new JLabel(" ");
        txa_ris = new JTextArea(25,25);
        txa_ris.setEditable(false);

        JScrollPane scr = new JScrollPane(txa_ris);

        Font font1 = new Font("Arial",Font.BOLD,25);
        font2 = new Font("Arial",Font.ITALIC,sizeFont);

        lbl_operatore.setFont(font1);
        lbl_operatore.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_operazione.setFont(font1);
        btn_piu.setFont(font2);
        btn_meno.setFont(font2);
        btn_per.setFont(font2);
        btn_diviso.setFont(font2);
        btn_piu2.setFont(font2);
        btn_meno2.setFont(font2);
        btn_salva.setFont(font2);
        btn_reset.setFont(font2);
        btn_reset2.setFont(font2);
        txa_ris.setFont(font2);
        txt_num1.setFont(font2);
        txt_num2.setFont(font2);

        JPanel pnl_principale = new JPanel();
        JPanel pnl_bottoni = new JPanel();
        JPanel pnl_operazione = new JPanel();
        JPanel pnl_font = new JPanel();

        pnl_bottoni.setBackground(Color.RED);
        pnl_operazione.setBackground(Color.RED);
        pnl_font.setBackground(Color.RED);

        txa_ris.setBackground(Color.YELLOW);

        pnl_principale.setLayout(new BorderLayout());
        GridLayout gl = new GridLayout(3,2);
        pnl_bottoni.setLayout(gl);
        GridLayout gl2 = new GridLayout(1,4);
        pnl_operazione.setLayout(gl2);
        GridLayout gl3 = new GridLayout(1,3);
        pnl_font.setLayout(gl3);

        pnl_bottoni.add(btn_piu);
        pnl_bottoni.add(btn_meno);
        pnl_bottoni.add(btn_per);
        pnl_bottoni.add(btn_diviso);
        pnl_bottoni.add(btn_salva);
        pnl_bottoni.add(btn_reset);

        pnl_operazione.add(txt_num1);
        pnl_operazione.add(lbl_operatore);
        pnl_operazione.add(txt_num2);
        pnl_operazione.add(lbl_operazione);

        pnl_font.add(btn_piu2);
        pnl_font.add(btn_meno2);
        pnl_font.add(btn_reset2);

        pnl_principale.add(pnl_operazione,BorderLayout.NORTH);
        pnl_principale.add(scr,BorderLayout.CENTER);
        pnl_principale.add(pnl_font,BorderLayout.SOUTH);
        pnl_principale.add(pnl_bottoni,BorderLayout.EAST);

        btn_piu.addActionListener(new GestoreOperatori(this));
        btn_meno.addActionListener(new GestoreOperatori(this));
        btn_per.addActionListener(new GestoreOperatori(this));
        btn_diviso.addActionListener(new GestoreOperatori(this));
        btn_salva.addActionListener(new GestoreOperatori(this));
        btn_reset.addActionListener(new GestoreOperatori(this));
        btn_piu2.addActionListener(new GestoreOperatori(this));
        btn_meno2.addActionListener(new GestoreOperatori(this));
        btn_reset2.addActionListener(new GestoreOperatori(this));

        Container container = frame_principale.getContentPane();
        container.add(pnl_principale);
        frame_principale.setVisible(true);
    }
    public static void main(String[] args) {
	    new Calcolatrice();
    }
}
