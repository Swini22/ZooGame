package zooGame;

import javax.swing.ImageIcon;

public class ForestAnimal extends Animal {

    // Klassenvariabeln
    public static int startFeedingCosts = 20;
    private String picturepath;

    // Konstruktor
    public ForestAnimal(String name) {
        super(name);
        calculateFeedingcosts();
    }

    // Methoden
    @Override
    public void chooseImage(Animal animal) {
        if (animal.getName().equals("Hirsch")) {
            picturepath = "/images/hirsch.png";
            animal.setImage(new ImageIcon(picturepath));
        } else {
            picturepath = "/images/wildschwein.png";
            animal.setImage(new ImageIcon(picturepath));
        }
    }

    @Override
    public void calculateFeedingcosts() {
        setFeedingcosts(getFeedingcosts() + (startFeedingCosts * 1));
    }

}
