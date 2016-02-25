package zooGame;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Animal {
    
    //Instanzvariabeln
    private String name;
    private int level = 1;
    private int feedingcosts;
    private ImageIcon image;
    
    
    //Konstruktor
    public Animal(String name) {
        super();
        this.name = name;
    }
      
    
    //Getter / Setter
    public int getLevel() {
        return level;
    }
    
    public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFeedingcosts() {
        return feedingcosts;
    }

    public void setFeedingcosts(int feedingcosts) {
        this.feedingcosts = feedingcosts;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    //Methoden
    public abstract void chooseImage(Animal animal);
    
    public abstract void calculateFeedingcosts();
   
}
