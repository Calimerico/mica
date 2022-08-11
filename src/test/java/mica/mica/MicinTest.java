package mica.mica;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class MicinTest {
    @Test
    void micinTest () {
        KursnaListaKalkulator kurs = new KursnaListaKalkulator();
        kurs.kursEvra = 117.2;

        double eurToRsd=kurs.eurToRsd(100.0);
        Assertions.assertThat(eurToRsd).isEqualTo(11720.0);
    }

    @Test
    void micinTest2() {
        KonvertorTemperature t = new KonvertorTemperature();
         double F=t.cToF(30.0);
        Assertions.assertThat(F).isEqualTo(86.0);

        }
    @Test
    void micinTest3() {
        PovrsinaTrougla povrsina = new PovrsinaTrougla();
        double P = povrsina.povrsinaT(6, 8, 10);

        Assertions.assertThat(P).isEqualTo(24.0);
    }

    @Test
    void micinTest4() {
//        for  (int i=0; i<=50; i=i+2) {
//            System.out.println(i);
//        }
        LinkedList objekat = new LinkedList();
        objekat.add("Milica");
        objekat.add(1);
        objekat.add("Spale");
        objekat.add("Sanja");
        objekat.add("Marko");
        System.out.println(objekat);

        LinkedList<Person> persons = new LinkedList<Person>();


        Person petar= new Person();
         petar.name="Petar";
//         petar.adresa= "Velebitska";
         petar.vaccinated= true;

         Person spale= new Person();
         spale.name="Spasoje";
//         spale.adresa= "Petrijevska";
         spale.vaccinated= false;
         persons.add(petar);
         persons.add(spale);
        System.out.println(persons);
         for (int i=0; i<persons.size(); i++) {
             if (persons.get(i).vaccinated==true) {
                 System.out.println(persons.get(i));
             }
         }
    }

    @Test
    void test18() {

        Person mica=new Person();
        mica.name= "Milica";
        mica.gender=Gender.FEMALE;
        mica.nationality="srpska";

        Person spale=new Person();
        spale.name="Spasoje";
        spale.gender=Gender.MALE;
        spale.nationality="srpska";

        Person george=new Person();
        george.name="George";
        george.gender=Gender.MALE;
        george.nationality="us";

        LinkedList<Person> sviPersoni= new LinkedList<>();
        sviPersoni.add(mica);
        sviPersoni.add(spale);
        sviPersoni.add(george);

        for (int i=0; i<sviPersoni.size(); i++) {

            if (sviPersoni.get(i).gender.equals(Gender.MALE) &&
                sviPersoni.get(i).nationality.equals("srpska")) {
                System.out.println(sviPersoni.get(i));
            }
        }
    }
     @Test
    void test12 (){
        LinkedList <Integer> brojevi=new LinkedList<>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
         int suma=0;
        for (int i=0; i<brojevi.size(); i++) {

            suma=suma+brojevi.get(i);
        }
         double prosek= suma/brojevi.size();
         System.out.println(prosek);
     }
     @Test
    void test16(){
        LinkedList<Double> brojevi= new LinkedList<Double>();
        brojevi.add(117.2);
        brojevi.add(116.2);
        brojevi.add(117.2);
        brojevi.add(117.2);
        brojevi.add(117.2);
        brojevi.add(117.2);
        brojevi.add(117.2);


    }



    }
