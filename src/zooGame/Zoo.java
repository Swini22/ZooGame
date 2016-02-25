package zooGame;

import java.util.ArrayList;

public class Zoo {
    //Instanzvariablen
    private ArrayList<Cage> cages = new ArrayList<Cage>();

    //Konstruktor
    public Zoo() {
        super();
        new User(this);
    }
    
    //Getter / Setter
    public ArrayList<Cage> getCages() {
        return cages;
    }

    public void setCages(ArrayList<Cage> cages) {
        this.cages = cages;
    }

    //Main Methode
    public static void main(String[] args) {
        new Zoo();
    }
}
