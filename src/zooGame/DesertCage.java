package zooGame;

import java.util.ArrayList;

public class DesertCage extends Cage {
    
    //Instanzvariabeln
    private ArrayList<DesertAnimal> desertAnimals = new ArrayList<DesertAnimal>();
    
    //Methoden
    @Override
    public void addAnimal(Animal animal) {
        // TODO add animal to desertAnimals list after checking is allowed   
    }

    @Override
    public void removeAnimal(Animal animal) {
        // TODO remove animal to desertAnimals list after checking if its in the list
    }

    @Override
    public boolean IsAllowdToJoin(Animal animal) {
        // TODO return true if its a DesertAnimal (class)
        return false;
    }

    @Override
    public String cageContent() {
        if(desertAnimals.isEmpty()) {
            return "empty";
        }else{
            return desertAnimals.get(0).getName();
        }
    }

}
