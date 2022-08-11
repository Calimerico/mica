package mica.mica.api;

import mica.mica.Adresa;
import mica.mica.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class API {

    @GetMapping(value = "/persons")
    public ResponseEntity<Person> get() {
        Person person = new Person();
        person.name = "Spasoje";

        Adresa adresa = new Adresa();

        adresa.postanskiBroj = 1120;
        adresa.kucniBroj = "3/19";
        adresa.imeUlice = "Velebitska";

        person.adresa = adresa;


        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }
    @PutMapping(value = "/persons/{id}")
    public ResponseEntity<Person> put(@RequestBody Person person, @PathVariable String id) {
        System.out.println("Cuvanje persona. Id persona: " + id);
        System.out.println("Person se zove: " + person.name);


        return new ResponseEntity<Person>(person, HttpStatus.OK);

    }
    @PostMapping(value = "/persons")
    public ResponseEntity<Person> post(@RequestBody Person person) {

        System.out.println("Person se zove: " + person.name);


        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }
    @PostMapping(value = "/test")
    public void test1 (@RequestParam String name, @RequestParam boolean vaccinated) {

        if (vaccinated==true) {
            System.out.println(name + " je vakcinisan");
        }
        else {
            System.out.println(name + " nije vakcinisan");
        }
        System.out.println("najvise na svetu " + name);
        name=name.toUpperCase();





    }
}
