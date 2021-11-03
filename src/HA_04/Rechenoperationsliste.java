package HA_04;

import java.util.ArrayList;
import java.util.Arrays;

public class Rechenoperationsliste implements Rechneroperation {
    ArrayList<Rechneroperation> mylist;
    double[] ausgangsfeld = {1,3,5,6};
    public Rechenoperationsliste (){
    }
    // initialisiert die Liste von Rechenoperationen
    public void add(Rechneroperation operation){
        this.mylist.add(operation);
    }
    // fuegt zur Liste der Rechenoperationen die uebergebene Operation
    // hinzu
    public double[] transform(double[] feld){
        double[] temp =  new double[feld.length];
        for (int i = 0 ; i< feld.length; i++){
            for (Rechneroperation R : mylist){
                temp[i] = R.berechne(feld[i]);
            }
        }
        return temp;
    }

    @Override
    public double berechne(double x) {

        return x;
    }

    public static void main(String[] args){
        double[] ausgangsfeld = { 1, 3, 5, 6 };
        Rechenoperationsliste r = new Rechenoperationsliste();
// Berechnet die Funktion (x^2)+2
        r.add(new Quadrat());
        r.add(new Addition(2));
// Berechnung und Ausgabe
        double[] test1 = r.transform(ausgangsfeld);
// ergibt {3,11,27,38}
        System.out.println(Arrays.toString(test1));
// fuegt der Rechenoperationsliste eine weitere Rechenoperation hinzu
// und berechnet daher insgesamt Math.sqrt((x^2)+2)
        r.add(new Quadratwurzel());
// Berechnung und Ausgabe
        double[] test2 = r.transform(ausgangsfeld);
// ergibt { 1.7320508075688772,
//         3.3166247903554,
//   5.196152422706632,
//   6.164414002968976}
        System.out.println(Arrays.toString(test2));
    }
// wendet alle Rechenoperationen der Reihe nach auf jedes Element
// des uebergebenen Feldes an (siehe auch Testfall)
}
