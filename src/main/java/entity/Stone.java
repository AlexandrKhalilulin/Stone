package entity;

import java.util.Comparator;

public abstract class Stone implements Polish {
    private static int ID = 0;
    private double weight;
    private double price;
    private double transparency;
    private String name;
    public static Comparator<Stone> Name_Order = new Comparator<Stone>() {
        public int compare(Stone s1, Stone s2) {
            return s1.name.compareTo(s2.name);
        }
    };
    private int id;

    public Stone() {
    }

    public Stone(String name, double weight, double price, double transparency) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.id = ID++;
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

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stone)) return false;

        Stone stone = (Stone) o;

        if (Double.compare(stone.weight, weight) != 0) return false;
        if (Double.compare(stone.price, price) != 0) return false;
        if (Double.compare(stone.transparency, transparency) != 0) return false;
        if (id != stone.id) return false;
        return name.equals(stone.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(transparency);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }
}
