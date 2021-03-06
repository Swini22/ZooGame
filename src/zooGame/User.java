package zooGame;

import java.util.ArrayList;

import view.StartScreen;

public class User {
    private int money = 0;
    private Zoo zoo;
    

    //Konstruktor
    public User(Zoo zoo) {
        super();
        this.zoo = zoo;
        StartScreen startScreen = new StartScreen(this);     
    }
  
    //Getter / Setter
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }


    //Methoden
    public void feed(Animal animal){
        if (money >= animal.getFeedingcosts()){
            money =  money - animal.getFeedingcosts();
            animal.setLevel(animal.getLevel() +1);
        }else{
            //TODO  change with controller and view
            System.out.println("not enough money");
        }
    }
    
    public void buyAnimal(String name, String type){
        ArrayList<Cage> emptyCages = new ArrayList<Cage>();
        for (Cage c: zoo.getCages()){
            if (c.cageContent().equals(name)){
                switch(type){
                case "water":
                    c.addAnimal(new WaterAnimal(name));
                    break;
                case "forest":
                    c.addAnimal(new ForestAnimal(name));
                    break;
                case "deset":
                    c.addAnimal(new DesertAnimal(name));
                    break;
                }            
            }
            else if(c.cageContent().equals("empty")){
                emptyCages.add(c);
            }
        }
    }
    
    public void sellAnimal(Animal animal){
        //TODO
    }
    
    public void buyCage(){
        //TODO
    }
    
    public void sellCage(Cage cage){
        //TODO
    }



}
