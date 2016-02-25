package zooGame;

import java.util.ArrayList;

public class ForestCage extends Cage {

    // Instanzvariabeln
    private ArrayList<ForestAnimal> forestAnimals = new ArrayList<ForestAnimal>();

    
    // Methoden
    @Override
    public void addAnimal(Animal animal) {
        // TODO add animal to forestAnimals list after checking is allowed
    }

    @Override
    public void removeAnimal(Animal animal) {
        // TODO remove animal to forestAnimals list after checking if its in the
        // list
    }

    @Override
    public boolean IsAllowdToJoin(Animal animal) {
        // TODO return true if its a ForestAnimal (class)
        return false;
    }
    
    @Override
    public String cageContent() {
        if(forestAnimals.isEmpty()) {
            return "empty";
        }else{
            return forestAnimals.get(0).getName();
        }
    }

}
