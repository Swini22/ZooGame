package zooGame;

public class WaterAnimal extends Animal {
    
    //Klassenvariabeln
    public static int startFeedingCosts = 10;

    //Konstruktor
    public WaterAnimal(String name) {
        super(name);
        calculateFeedingcosts();
        chooseImage(this);
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
