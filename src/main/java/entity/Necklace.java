package entity;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private static int ID = 0;
    private List<Stone> stones;
    private String name;
    private int id;

    public Necklace() {
    }

    public Necklace(String name, List<Stone> stones) {
        this.name = name;
        this.stones = stones;
        this.id = ID++;
    }

    public int getId() {
        return id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Necklace)) return false;

        Necklace necklace = (Necklace) o;

        if (id != necklace.id) return false;
        if (!stones.equals(necklace.stones)) return false;
        return name.equals(necklace.name);

    }

    @Override
    public int hashCode() {
        int result = stones.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stones=" + getStones() +
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
