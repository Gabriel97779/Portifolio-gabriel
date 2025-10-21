package academy.devdojo.maratonajava.javacore.projectsJava.reservaCinema.Test;

import academy.devdojo.maratonajava.javacore.projectsJava.reservaCinema.dominio.Cinema;
import academy.devdojo.maratonajava.javacore.projectsJava.reservaCinema.dominio.Comprador;

public class CinemaTest01 {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Carros 4", 23.99, 87);
        Comprador comprador1 = new Comprador("Gabriel", 19);
        Comprador comprador2 = new Comprador("Samara", 18);

        cinema1.reservar(comprador1);
        cinema1.reservar(comprador2, 5);
        cinema1.imprimirInfo();


        Cinema cinema2 = new Cinema("Interestelar");
        Comprador comprador3 = new Comprador("Lucas", 7);
        Comprador comprador4 = new Comprador("Samuel", 14);

        cinema2.reservar(comprador3,3);
        cinema2.reservar(comprador4,2);
        cinema2.imprimirInfo();



    }
}
