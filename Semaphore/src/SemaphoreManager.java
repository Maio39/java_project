import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemaphoreManager implements ActionListener, Runnable{
    Semaphore s;
    int cont;

    SemaphoreManager(Semaphore s){
        this.s=s;
        this.cont=0;
    }


    public void actionPerformed(ActionEvent e){

        if(e.getActionCommand()=="Start"){
            ImageIcon img_semGreen = new ImageIcon("semGreen.jpg");
            s.green = true;
            s.car.startCar();
            timeGreenStart();
            s.motorcycle.startCar();
            s.lbl_sem.setIcon(img_semGreen);
            s.btn_start.setText("Running");
        }
        if(e.getActionCommand()=="Stop"){
            s.green = false;
            s.btn_start.setText("Start");
        }
    }
    public int getCont(){
        return cont;
    }

    public void run() {
        try{
            while(true){
                if(cont==0){
                    Thread.sleep(3000);
                    s.car.stop=true;
                    s.motorcycle.stop=true;
                    cont++;
                }
                else{
                    Thread.sleep(5000);
                    s.car.stop=true;
                    s.motorcycle.stop=true;
                }
                
            }
        }
        catch(InterruptedException e3){
            e3.printStackTrace();
        }
    }

    public void timeGreenStart(){
        new Thread(this).start();
    }
}
