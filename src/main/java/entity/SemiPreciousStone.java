package entity;

public class SemiPreciousStone extends Stone {
    private double tracery;

    public SemiPreciousStone(String name, double weight, double price, double transparency, double tracery) {
        super(name, weight, price, transparency);
        this.tracery = tracery;
    }

    public SemiPreciousStone() {
    }

    public double getTracery() {
        return tracery;
    }

    @Override
    public String toString() {
        return "SemiPreciousStone{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", transparency=" + getTransparency() +
                ", tracery=" + tracery +
                '}';
    }

    public int compare(Stone o1, Stone o2) {
        return 0;
    }
}

