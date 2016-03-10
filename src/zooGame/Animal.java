package zooGame;

import javax.swing.ImageIcon;

public abstract class Animal {
    
    //Instanzvariabeln
    private String name;
    private int level = 1;
    private int feedingcosts =0;
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
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (feedingcosts != other.feedingcosts)
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        } else if (!image.equals(other.image))
            return false;
        if (level != other.level)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
   
}
