package HA_04;

public class Quadrat implements Rechneroperation{


    public Quadrat(){

    }

    @Override
    public double berechne(double x) {
        x = x*x;
        return x;
    }

}
