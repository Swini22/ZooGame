package zooGame;

import java.util.ArrayList;

public class Zoo {
    //Instanzvariablen
    private ArrayList<Cage> cages = new ArrayList<Cage>();
    private int moneyPerMinute = 1;

    //Konstruktor
    public Zoo() {
        super();
        User user = new User(this);
    }
    
    //Getter / Setter
    public ArrayList<Cage> getCages() {
        return cages;
    }

    public void setCages(ArrayList<Cage> cages) {
        this.cages = cages;
    }
    

    public int getMoneyPerMinute() {
        return moneyPerMinute;
    }

    public void setMoneyPerMinute(int moneyPerMinute) {
        this.moneyPerMinute = moneyPerMinute;
    }

    //Main Methode
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
    }
}
