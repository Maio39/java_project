/*
    nome:       Marco
    cognome:    Maier
    classe:     4E
    Data:       27/04/2021
*/
import javax.swing.*;
import java.awt.*;
public class CronometroPro{
    int i;
    boolean start=false;
    boolean start2=false;
    CronometroPro(String name){
        JFrame frame_principale = new JFrame(name);
        JPanel panel = new JPanel();
        JLabel lblTime = new JLabel("0 Sec");
        JLabel lblGiro = new JLabel("Giro Intermedio 0 Sec");
        JButton btn_start = new JButton("Start");
        JButton btn_stop = new JButton("Stop");
        JButton btn_reset = new JButton("Reset");
        JButton btn_timer = new JButton("Start Timer");
        JButton btn_giro = new JButton("Giro");
        Container c = frame_principale.getContentPane();
        panel.add(lblTime);
        panel.add(btn_start);
        panel.add(lblGiro);
        panel.add(btn_stop);
        panel.add(btn_giro);
        panel.add(btn_reset);
        panel.add(btn_timer);
        c.add(panel);
        frame_principale.setSize(200,200);
        frame_principale.setLocationRelativeTo(null);
        frame_principale.setVisible(true);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn_start.addActionListener(new GestoreCronometroPro(this,lblTime,lblGiro));
        btn_stop.addActionListener(new GestoreCronometroPro(this,lblTime,lblGiro));
        btn_reset.addActionListener(new GestoreCronometroPro(this,lblTime,lblGiro));
        btn_timer.addActionListener(new GestoreCronometroPro(this, lblTime,lblGiro));
        btn_giro.addActionListener(new GestoreCronometroPro(this, lblTime, lblGiro));

        i=0;
        while(true){
            if(start){
                lblTime.setText(i+" Sec");
                i++;
            }
            if(start2){
                while(i!=0){
                    i--;
                    lblTime.setText(i+" Sec");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args) {
        new CronometroPro("Cronometro Pro");
    }
}