package zooGame;

public class DesertAnimal extends Animal {
    
    //Klassenvariabeln
    public static int startFeedingCosts = 100;

    //Konstruktor
    public DesertAnimal(String name) {
        super(name);
        calculateFeedingcosts();
    }

    //Methoden
    @Override
    public void chooseImage(Animal animal) {
        // TODO choose right image see name of animal
    }

    @Override
    public void calculateFeedingcosts() {
        // TODO see level see startFeedingCosts calculate and set feedingcosts new
    }

}
