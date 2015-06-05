package entity;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private List<Stone> stones;
    private String name;

    public Necklace() {
    }

    public Necklace(String name, List<Stone> stones) {
        this.name = name;
        this.stones = stones;
    }

    public List<Stone> getStones() {
        return new ArrayList<Stone>(stones);
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                ", name='" + name + '\'' +
                "stones=" + getStones() +
                '}';
    }

    public double necklaceWeight() {
        double weight = 0;
        for (Stone list : getStones()) {
            weight += list.getWeight();
        }
        return weight;
    }

    public double necklacePrice() {
        double price = 0;
        for (Stone list : getStones()) {
            price += list.getPrice();
        }
        return price;
    }

}
