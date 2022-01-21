package pl.samouczekprogramisty.kursyjava.dziedziczenie;

public class Human extends Mammal{

    public Human(){

        super();
        toString();
        System.out.println("Rusza konstruktor human");
    }

    public String toString(){
        return "Klasa Human";
    }
}
