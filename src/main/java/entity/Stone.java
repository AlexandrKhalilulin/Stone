package entity;

import java.util.Comparator;
import java.util.UUID;

public abstract class Stone implements Polish {

    private UUID UUID;
    private double weight;
    private double price;
    private double transparency;
    private String name;
    public static Comparator<Stone> Name_Order = new Comparator<Stone>() {
        public int compare(Stone s1, Stone s2) {
            return s1.name.compareTo(s2.name);
        }
    };

    public Stone() {
    }

    public Stone(String name, double weight, double price, double transparency) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.UUID = UUID.randomUUID();

    }

    public java.util.UUID getUUID() {
        return UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

}
