import javax.swing.*;

public class Car implements Runnable{
    int vel=0;
    int vx ;
    int y; // position
    JLabel lbl_car;
    Semaphore s;
    boolean stop;
    Car(ImageIcon img_car, Semaphore s, int vel, int y){
        this.y = y;
        this.vx = vel;
        this.s=s;
        lbl_car = new JLabel();
        lbl_car.setIcon(img_car);
        boolean stop = false;
    }
    Car(ImageIcon img_car, Semaphore s){
        this.s=s;
        lbl_car = new JLabel();
        lbl_car.setIcon(img_car);
        boolean stop = false;
    }

    void setLocationCar(int x, int y){
        lbl_car.setBounds(x,y,1000,1000);   // x= 0 y=200
    }

    @Override
    public void run() {
        ImageIcon img_semGreen = new ImageIcon("semGreen.jpg");
        while(true){
            if(s.green){
                vel += vx;
                if(stop){
                    this.stopCar();
                }
                if(vel >= 1720)
                    vel=-400;

                lbl_car.setBounds(vel,y,1000,1000);
                //lbl_car.setBounds(vel,350,1000,1000);
                try{
                    if(!s.green){
                        Thread.sleep(2000);
                        s.green=true;
                        s.lbl_sem.setIcon(img_semGreen);
                        stop=false;
                    }

                    Thread.sleep(5);
                }
                catch(InterruptedException e2){
                    e2.printStackTrace();
                }

            }
        }
    }
    public void stopCar(){
        s.green = false;
        s.lbl_sem.setIcon(s.img_sem);
    }

    public void startCar(){
        new Thread(this).start();
    }
}
