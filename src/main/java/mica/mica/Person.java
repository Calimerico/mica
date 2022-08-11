package mica.mica;

public class Person {
    public String name;
    public Adresa adresa;
    public boolean vaccinated;
    Gender gender;
    String nationality;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adresa=" + adresa +
                ", vaccinated=" + vaccinated +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
