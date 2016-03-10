package zooGame;

import javax.swing.ImageIcon;

public class WaterAnimal extends Animal {

    // Klassenvariabeln
    public static int startFeedingCosts = 10;
    private String picturepath;

    // Konstruktor
    public WaterAnimal(String name) {
        super(name);
        calculateFeedingcosts();
        chooseImage(this);
    }

    // Methoden
    @Override
    public void chooseImage(Animal animal) {
        if (animal.getName().equals("Hai")) {
            picturepath = "/images/hai.png";
            animal.setImage(new ImageIcon(picturepath));
        } else {
            picturepath = "/images/fisch.png";
            animal.setImage(new ImageIcon(picturepath));
        }
    }

    @Override
    public void calculateFeedingcosts() {
        setFeedingcosts(getFeedingcosts() + (startFeedingCosts * 5));
    }

}
