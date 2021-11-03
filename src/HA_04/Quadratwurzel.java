package HA_04;

public class Quadratwurzel implements Rechneroperation{


    public Quadratwurzel(){
    }

    @Override
    public double berechne(double x) {
        x = Math.sqrt(x);
        return x;
    }
}
