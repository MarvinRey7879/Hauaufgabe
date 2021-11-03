package HA_04;

public class Addition implements Rechneroperation{
    double wert;

    public Addition(double wert){
        this.wert = wert;
    }

    @Override
    public double berechne(double x) {
        this.wert *= x;
        return x;
    }
}
