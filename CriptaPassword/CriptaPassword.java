/*
        Nome:
        Cognome:
        Classe:
        Data:
        Oggetto:
*/
import java.awt.*;
import javax.swing.*;
public class CriptaPassword{
    JLabel lbl_insPsw;
    JLabel lbl_insPswCrip;
    JLabel lbl_key;
    JLabel lbl_file;
    JLabel lbl_pswCrip;
    JLabel lbl_pswDecrip;

    JTextField txt_insPsw;
    JTextField txt_insPswCrip;
    JTextField txt_key;
    JTextField txt_file;

    JTextArea txa_criptate;
    JTextArea txa_decriptate;

    JButton btn_crip;
    JButton btn_decrip;
    JButton btn_saveCrip;
    JButton btn_saveDecrip;
    JButton btn_resetCrip;
    JButton btn_resetDecrip;
    JButton btn_cripFile;
    JButton btn_decripFile;
    JButton btn_reset;
    JButton btn_ingr;
    JButton btn_rimp;

    int sizeFont = 15;
    public CriptaPassword(){
        JFrame frame_principale = new JFrame("Cripta & Decripta Password");
        frame_principale.setSize(1000,600);
        frame_principale.setLocationRelativeTo(null);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl_insPsw = new JLabel("Inserire Password");
        lbl_insPswCrip = new JLabel("Inserire Password Criptata");
        lbl_key = new JLabel("Inserire la Chiave");
        lbl_file = new JLabel("Inserisci nome file");
        lbl_pswCrip = new JLabel("Password Criptate:");
        lbl_pswDecrip = new JLabel("Password Decriptate:");

        txt_insPsw = new JTextField(2);
        txt_insPswCrip = new JTextField(2);
        txt_key = new JTextField(2);
        txt_file = new JTextField(2);

        txa_criptate = new JTextArea(25,25);
        txa_decriptate = new JTextArea(25,25);

        btn_crip = new JButton("Cripta Password");
        btn_decrip = new JButton("Decripta Password");
        btn_saveCrip = new JButton("Salva Password Criptate");
        btn_saveDecrip = new JButton("Salva Password Decriptate");
        btn_resetCrip = new JButton("Reset Password Criptate");
        btn_resetDecrip = new JButton("Reset Password Decriptate");
        btn_cripFile = new JButton("Cripta Password da File");
        btn_decripFile = new JButton("Decripta password da File");
        btn_reset = new JButton("Reset");
        btn_ingr = new JButton("Ingrandisci");
        btn_rimp = new JButton("Rimpicciolisci");

        lbl_pswCrip.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_pswDecrip.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial",Font.ITALIC,sizeFont);
        lbl_insPsw.setFont(font);
        lbl_insPswCrip.setFont(font);
        lbl_key.setFont(font);
        lbl_file.setFont(font);
        lbl_pswCrip.setFont(font);
        lbl_pswDecrip.setFont(font);

        txt_insPsw.setFont(font);
        txt_insPswCrip.setFont(font);
        txt_key.setFont(font);
        txt_file.setFont(font);

        txa_criptate.setFont(font);
        txa_decriptate.setFont(font);

        btn_crip.setFont(font);
        btn_cripFile.setFont(font);
        btn_decrip.setFont(font);
        btn_decripFile.setFont(font);
        btn_ingr.setFont(font);
        btn_reset.setFont(font);
        btn_resetCrip.setFont(font);
        btn_resetDecrip.setFont(font);
        btn_rimp.setFont(font);
        btn_saveCrip.setFont(font);
        btn_saveDecrip.setFont(font);

        txa_criptate.setEditable(false);
        txa_decriptate.setEditable(false);

        JScrollPane scr = new JScrollPane(txa_criptate);
        JScrollPane scr2 = new JScrollPane(txa_decriptate);

        JPanel pnl_principale = new JPanel();
        JPanel pnl_textArea = new JPanel();
        JPanel pnl_inserimento = new JPanel();
        JPanel pnl_center = new JPanel();
        JPanel pnl_font = new JPanel();

        GridLayout gl = new GridLayout(2,4);
        pnl_inserimento.setLayout(gl);
        pnl_inserimento.add(lbl_insPsw);
        pnl_inserimento.add(lbl_insPswCrip);
        pnl_inserimento.add(lbl_key);
        pnl_inserimento.add(lbl_file);
        pnl_inserimento.add(txt_insPsw);
        pnl_inserimento.add(txt_insPswCrip);
        pnl_inserimento.add(txt_key);
        pnl_inserimento.add(txt_file);

        GridLayout gl2 = new GridLayout(4,1);
        pnl_textArea.setLayout(gl2);
        pnl_textArea.add(lbl_pswCrip);
        pnl_textArea.add(scr);
        pnl_textArea.add(lbl_pswDecrip);
        pnl_textArea.add(scr2);

        GridLayout gl3 = new GridLayout(4,2);
        pnl_center.setLayout(gl3);
        pnl_center.add(btn_crip);
        pnl_center.add(btn_decrip);
        pnl_center.add(btn_saveCrip);
        pnl_center.add(btn_saveDecrip);
        pnl_center.add(btn_resetCrip);
        pnl_center.add(btn_resetDecrip);
        pnl_center.add(btn_cripFile);
        pnl_center.add(btn_decripFile);

        GridLayout gl4 = new GridLayout(1,3);
        pnl_font.setLayout(gl4);
        pnl_font.add(btn_reset);
        pnl_font.add(btn_ingr);
        pnl_font.add(btn_rimp);

        pnl_principale.setLayout(new BorderLayout());
        pnl_principale.add(pnl_inserimento,BorderLayout.NORTH);
        pnl_principale.add(pnl_textArea,BorderLayout.CENTER);
        pnl_principale.add(pnl_center,BorderLayout.EAST);
        pnl_principale.add(pnl_font,BorderLayout.SOUTH);

        Container container = frame_principale.getContentPane();
        container.add(pnl_principale);
        frame_principale.setVisible(true);

    }
    public static void main(String[] args) {
        new CriptaPassword();
    }
}