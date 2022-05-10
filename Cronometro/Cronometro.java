import javax.swing.*;
import java.awt.*;
public class Cronometro {
    boolean start=false;
    int i,j,k;
    Cronometro(String name){
        JFrame frame_principale = new JFrame(name);
        JPanel panel = new JPanel();
        JLabel lbl_secondi = new JLabel("00");
        JLabel lbl_minuti = new JLabel("00 :");
        JLabel lbl_ore = new JLabel("00 :");
        JButton btn_start = new JButton("Start");
        JButton btn_stop = new JButton("Stop");
        JButton btn_reset = new JButton("Reset");
        Container c = frame_principale.getContentPane();
        panel.add(lbl_ore);
        panel.add(lbl_minuti);
        panel.add(lbl_secondi);
        panel.add(btn_start);
        panel.add(btn_stop);
        panel.add(btn_reset);
        c.add(panel);
        frame_principale.setSize(400,500);
        frame_principale.setLocationRelativeTo(null);
        btn_start.addActionListener(new GestoreCronometro(this));
        btn_stop.addActionListener(new GestoreCronometro(this));
        btn_reset.addActionListener(new GestoreCronometro(this));
        frame_principale.setVisible(true);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int i=0;
        int j=0;
        int k=0;
        while(true){
            if(start){
                if(i==59){
                    j++;
                    lbl_minuti.setText(""+j+":");
                    i=0;
                }
                if(j==60){
                    k++;
                    lbl_ore.setText(""+k+":");
                    j=0;
                }
                lbl_secondi.setText(""+i);
                i++;
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
    public static void main(String[] args) {
        new Cronometro("cronometro");
    }
}
