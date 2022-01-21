package pl.samouczekprogramisty.kursyjava.dziedziczenie;

public abstract class Animal {

    public Animal(){
        System.out.println("Rusza konstruktor Animal");
        toString();
    }

    public String toString(){
        System.out.println("Rusza metoda toString klasy Animal");
        return "Klasa abstrakcyjna Animal";
    }
}
