import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Semaphore {
    JButton btn_start;
    JButton btn_stop;

    Car car;
    Car motorcycle;
    ImageIcon img_sem;
    ImageIcon img_car;
    ImageIcon img_motorcycle;
    JLabel lbl_sem;

    boolean green = false;  //color of semaphore (false = red)

    public Semaphore(){
        JFrame frame_principale = new JFrame("Simulation Semaphore");
        frame_principale.setSize(1900,1150);
        frame_principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_principale.setLocationRelativeTo(null);
        frame_principale.setResizable(false);

        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));		//crea la finestra di dialogo per la scelta del file a partire dalla directory di esecuzione del programma
        int opzioneScelta = chooser.showOpenDialog(null);			//visualizza la finestra di dialogo e restituisce l'opzione selezionata
        File mioFile;

        if(opzioneScelta == JFileChooser.APPROVE_OPTION){
            mioFile = chooser.getSelectedFile();				//ottengo un oggetto File relativo al file scelto

            img_car = new ImageIcon(mioFile.getPath());
        }

        /*
        ImageIcon img_wheels = new ImageIcon("../car2.png");

        ImageIcon img_wheels2 = new ImageIcon("../car2.png");
        */
        img_motorcycle = new ImageIcon("car.png");

        //ImageIcon img_car = new ImageIcon("../car1.png");

        


        btn_start = new JButton("Start");
        btn_start.setForeground(Color.GREEN);
        btn_start.setBackground(Color.GREEN);
        btn_start.setOpaque(true);
        btn_stop = new JButton("Stop");
        btn_stop.setForeground(Color.RED);
        btn_stop.setBackground(Color.RED);
        btn_stop.setOpaque(true);

        car = new Car(img_car,this,1,150);
        car.setLocationCar(0,150);

        motorcycle = new Car(img_motorcycle,this,2,350);
        motorcycle.setLocationCar(0,350);

        img_sem = new ImageIcon("semRed.png");
        lbl_sem = new JLabel();
        lbl_sem.setIcon(img_sem);
        lbl_sem.setBounds(1570,-350,1000,1000);

        final Image image = new ImageIcon("road2.png").getImage();
        JPanel pnl_p = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        };

        JPanel pnl_button = new JPanel();
        GridLayout gl = new GridLayout(1,2);
        pnl_button.setLayout(gl);
        pnl_button.add(btn_start);
        pnl_button.add(btn_stop);

        pnl_p.setLayout(null);
        pnl_p.add(motorcycle.lbl_car);
        pnl_p.add(car.lbl_car);
        pnl_p.add(lbl_sem);

        JPanel pnl_principale = new JPanel();
        pnl_principale.setLayout(new BorderLayout());
        pnl_principale.add(pnl_button,BorderLayout.NORTH);
        pnl_principale.add(pnl_p,BorderLayout.CENTER);

        btn_start.addActionListener(new SemaphoreManager(this));
        btn_stop.addActionListener(new SemaphoreManager(this));

        Container container = frame_principale.getContentPane();
        container.add(pnl_principale);
        frame_principale.setVisible(true);

    }

    public static void main(String[] args) {
        new Semaphore();
    }
}
