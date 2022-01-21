package pl.samouczekprogramisty.kursyjava.dziedziczenie;

public abstract class Fish extends Animal {

    public Fish(){

        super();
        toString();
        System.out.println("Rusza konstruktor fish");
    }

    public String toString(){
        System.out.println("Klasa abstrakcyjna Fish");
        return "Klasa abstrakcyjna Fish";
    }
}
