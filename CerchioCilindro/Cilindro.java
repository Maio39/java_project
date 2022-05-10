class Cilindro extends Cerchio{
    private double altezza;

    Cilindro(double raggio,double altezza){
        super(raggio);
        this.altezza=altezza;
    }
    Cilindro(double altezza){
        super();
        this.altezza=altezza;
    }

    public double getAltezza(){
        return altezza;
    }

    public void setAltezza(double altezza){
        this.altezza=altezza;
    }

    public double volume(){
        double vol;
        vol = area() * altezza;
        return vol;
    }
}
