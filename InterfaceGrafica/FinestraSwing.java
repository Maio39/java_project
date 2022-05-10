/*
    Nome:           Marco
    Cognome:        Maier
    Data:           08/04/2021
*/
import javax.swing.*;
import java.awt.*;
class FinestraSwing{
    public static void main(String[] args) {
        JFrame frm_principale = new JFrame();               //contenitore principale
        // Aspetto frame
        frm_principale.setTitle("Bella finestra");
        frm_principale.setSize(300,200);                   
        frm_principale.setLocation(1500, 800);

        int dimFont = 30;
        Font font = new Font("Arial", Font.PLAIN, dimFont);

        //operazioni sul frame
        frm_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnl_p = new JPanel();                        //contenitore intermedio
        pnl_p.setBackground(Color.BLUE);

        JLabel lbl_saluto = new JLabel("Etichettina");      //contenitore atomico
        lbl_saluto.setBackground(Color.GREEN);
        lbl_saluto.setOpaque(true);
        lbl_saluto.setFont(font);

        JButton btn_inutile = new JButton("Bottone");  
        btn_inutile.setBackground(Color.RED);
        btn_inutile.setForeground(Color.YELLOW);

        pnl_p.add(lbl_saluto);
        pnl_p.add(btn_inutile);
        Container c = frm_principale.getContentPane();
        c.add(pnl_p);
        frm_principale.setVisible(true);
        //frm_principale.setLocationRelativeTo(null);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //int x=(screenSize.width - frm_principale.getWidth())/2;
        //int y=(screenSize.height - frm_principale.getHeight())/2;
        //frm_principale.setLocation(x, y);
        try{
            int x = 0;
            int y = 0;
            int cont=0;
            while(true){
                if(x<1800){
                    if(cont==5){
                        frm_principale.setLocation(x,y-80);
                        frm_principale.setVisible(true);
                        Thread.sleep(500);
                    }else{
                        frm_principale.setLocation(x,y);
                        frm_principale.setVisible(true);
                        Thread.sleep(500);
                    }
                    x = x+300;
                }
                if(x==1800){
                    y=y+200;
                    x=0;
                    cont++;
                }
                if(cont==1){
                    pnl_p.setBackground(Color.orange);
                    lbl_saluto.setBackground(Color.BLUE);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.MAGENTA);
                    btn_inutile.setForeground(Color.BLACK);
                }
                if(cont==2){
                    pnl_p.setBackground(Color.BLACK);
                    lbl_saluto.setBackground(Color.PINK);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.WHITE);
                    btn_inutile.setForeground(Color.red);
                }
                if(cont==3){
                    pnl_p.setBackground(Color.PINK);
                    lbl_saluto.setBackground(Color.BLUE);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.BLACK);
                    btn_inutile.setForeground(Color.GREEN);
                }
                if(cont==4){
                    pnl_p.setBackground(Color.DARK_GRAY);
                    lbl_saluto.setBackground(Color.BLUE);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.BLACK);
                    btn_inutile.setForeground(Color.ORANGE);
                }
                if(cont==5){
                    pnl_p.setBackground(Color.CYAN);
                    lbl_saluto.setBackground(Color.RED);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.YELLOW);
                    btn_inutile.setForeground(Color.ORANGE);
                }
                if(cont==6){
                    pnl_p.setBackground(Color.GREEN);
                    lbl_saluto.setBackground(Color.RED);
                    lbl_saluto.setOpaque(true);
                    lbl_saluto.setFont(font);
                    btn_inutile.setBackground(Color.YELLOW);
                    btn_inutile.setForeground(Color.BLACK);
                    x=0;
                    y=0;
                    cont=0;
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

    }
}