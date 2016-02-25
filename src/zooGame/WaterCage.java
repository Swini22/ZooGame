package zooGame;

import java.util.ArrayList;

public class WaterCage extends Cage {

    //Instanzvariabeln
    private ArrayList<WaterAnimal> waterAnimals = new ArrayList<WaterAnimal>();
    
    //Methoden
    @Override
    public void addAnimal(Animal animal) {
        // TODO add animal to waterAnimals list after checking is allowed   
    }

    @Override
    public void removeAnimal(Animal animal) {
        // TODO remove animal to waterAnimals list after checking if its in the list
    }

    @Override
    public boolean IsAllowdToJoin(Animal animal) {
        // TODO return true if its a WaterAnimal (class)
        return false;
    }
    
    @Override
    public String cageContent() {
        if(waterAnimals.isEmpty()) {
            return "empty";
        }else{
            return waterAnimals.get(0).getName();
        }
    }

}
