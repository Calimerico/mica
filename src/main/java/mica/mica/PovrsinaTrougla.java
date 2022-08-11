package mica.mica;

public class PovrsinaTrougla {

     double povrsinaT( double stranicaA, double stranicaB, double stranicaC) {
         double s=(stranicaA+stranicaB+stranicaC)/2;
        double p= Math.sqrt(s*(s-stranicaA)* (s-stranicaB)*(s-stranicaC));
        return p;
     }

}
