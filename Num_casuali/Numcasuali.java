class Numcasuali{
    public static void main(String[] args) {
        int x[];
        x = new int[100];

        for(int i=0;i<100;i++){
            x[i]=(int)(Math.random()*(100-15+1));
            System.out.println(x[i]);
        }
    }
}