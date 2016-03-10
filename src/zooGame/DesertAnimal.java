package zooGame;

import javax.swing.ImageIcon;

public class DesertAnimal extends Animal {

    // Klassenvariabeln
    public static final int startFeedingCosts = 100;
    
    
    // Instanzvariabeln
    private String picturepath;

    // Konstruktor
    public DesertAnimal(String name) {
        super(name);
        calculateFeedingcosts();
    }

    // Methoden
    @Override
    public void chooseImage(Animal animal) {
        try {
            if (animal.getName().equals("Schlange")) {
                picturepath = "/images/schlange.png";
                animal.setImage(new ImageIcon(picturepath));
            } else {
                picturepath = "/images/lion.png";
                animal.setImage(new ImageIcon(picturepath));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateFeedingcosts() {
        setFeedingcosts(getFeedingcosts() + (startFeedingCosts * 2));
    }

}
