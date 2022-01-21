package pl.samouczekprogramisty.kursyjava.dziedziczenie;

public class Goldfish extends Fish{

    public Goldfish(){


        super();
        toString();
        System.out.println("Rusza konstruktor Goldfish");
    }
    public String toString(){
        return "Klasa Goldfish";
    }
}
