/*
    Nome:       Marco
    Cognome:    Maier
    Classe:     4E
*/
import javax.swing.*;
import java.awt.*;

class Conversione{
    JLabel lbl_numDec;
    JLabel lbl_risultato;
    JLabel lbl_numBin;
    JTextField txt_numDec;
    JTextArea txa_conv;
    JButton btn_converti;
    JButton btn_salva;
    JButton btn_ultima;
    Conversione(){
        JFrame frame_principale = new JFrame("Conversione Decimale Binario");
        frame_principale.setSize(600,500);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl_numDec = new JLabel("Numero decimale");
        lbl_risultato = new JLabel(" = 0");
        lbl_numBin = new JLabel("Numero binario");

        txt_numDec = new JTextField(2);

        txa_conv = new JTextArea(25,25);
        txa_conv.setEditable(false);

        JScrollPane scr = new JScrollPane(txa_conv);

        btn_converti = new JButton("Converti");
        btn_salva = new JButton("Salva");
        btn_ultima = new JButton("Ultima operazione");

        JPanel pnl_principale = new JPanel();
        JPanel pnl_operazione = new JPanel();
        JPanel pnl_bottoni = new JPanel();

        GridLayout gl = new GridLayout(2,2);
        pnl_operazione.setLayout(gl);
        pnl_operazione.add(lbl_numDec);
        pnl_operazione.add(lbl_numBin);
        pnl_operazione.add(txt_numDec);
        pnl_operazione.add(lbl_risultato);

        GridLayout gl2 = new GridLayout(3,1);
        pnl_bottoni.setLayout(gl2);
        pnl_bottoni.add(btn_converti);
        pnl_bottoni.add(btn_salva);
        pnl_bottoni.add(btn_ultima);

        pnl_principale.setLayout(new BorderLayout());
        pnl_principale.add(pnl_operazione,BorderLayout.NORTH);
        pnl_principale.add(scr,BorderLayout.CENTER);
        pnl_principale.add(pnl_bottoni,BorderLayout.EAST);

        btn_converti.addActionListener(new GestioneBottoni(this));
        btn_salva.addActionListener(new GestioneBottoni(this));
        btn_ultima.addActionListener(new GestioneBottoni(this));

        Container container = frame_principale.getContentPane();
        container.add(pnl_principale);
        frame_principale.setVisible(true);

    }
    public static void main(String[] args) {
        new Conversione();
    }
}