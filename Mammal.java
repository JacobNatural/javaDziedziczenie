package pl.samouczekprogramisty.kursyjava.dziedziczenie;

public abstract class Mammal extends Animal{

    public Mammal(){

        super();
        toString();
        System.out.println("Rusza konstruktor Mammal");
    }
    public String toString(){
        return "Klasa abstrakcyjna Mammal";
    }
}
