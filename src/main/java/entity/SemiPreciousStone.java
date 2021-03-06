package entity;

import org.joda.money.Money;

public class SemiPreciousStone extends Stone {
    private double tracery;

    public SemiPreciousStone(String name, double weight, Money price, double transparency, double tracery) {
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
                "UUID='" + getUUID().getMostSignificantBits() + '\'' +
                ", name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", transparency=" + getTransparency() +
                ", tracery=" + tracery +
                ", polish=" + makePolish() +
                '}';
    }

    @Override
    public String makePolish() {
        return "Rose";
    }
}

