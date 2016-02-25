package zooGame;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Cage {
    //instanzvariablen
    private ImageIcon image;

    //Konstruktor
    public Cage() {
        super();
    }
  
    //abstract Methoden (ohne body)
    public abstract void addAnimal(Animal animal);
    
    public abstract void removeAnimal(Animal animal);
    
    public abstract boolean IsAllowdToJoin(Animal animal);
    
    public abstract String cageContent();
    
}
