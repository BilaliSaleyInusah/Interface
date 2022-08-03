import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int hitPoint;
    private int strength;
    private String weapeon;

    public Player (String name,int hitPoin,int strength){
        this.name = name;
        this.hitPoint = hitPoin;
        this.strength = strength;
        this.weapeon = "Sword";
    }
    
    public String getName() {
        return name;
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public int getStrength() {
        return strength;
    }
    public String getWeapeon() {
        return weapeon;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setWeapeon(String weapeon) {
        this.weapeon = weapeon;
    }

    @Override
    public String toString() {
        return "Player{" + 
                "name = " + name + "\'" +
                ", hitPoint = " + hitPoint + 
                ", Strength = " + strength +
                ", Weapon = " + weapeon + "\'" +
                "}";
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapeon = savedValues.get(3);
        } 
        
    }
    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1,"" + this.hitPoint);
        list.add(2, "" + this.strength);
        list.add(3, this.weapeon);
        return list;
    }

}
