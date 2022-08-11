package mica.mica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicaApplication {

	public static void main(String[] args) {

		Adresa a = new Adresa();

		a.imeUlice = "Velebitska";
		a.kucniBroj = "3/19";
		a.postanskiBroj = 11120;


		Person p = new Person();

		p.name = "Spale";
		p.adresa = a;






		KursnaListaKalkulator kalkulator = new KursnaListaKalkulator();
		kalkulator.kursEvra= 117.2;
		double resenje = kalkulator.eurToRsd(100.0);
		System.out.println(resenje);

		SpringApplication.run(MicaApplication.class, args);
	}

}
