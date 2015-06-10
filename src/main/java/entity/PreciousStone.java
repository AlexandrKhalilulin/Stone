package entity;

import org.joda.money.Money;

import java.util.UUID;

public class PreciousStone extends Stone {
    private double hardness;

    public PreciousStone(String name, double weight, Money price, double transparency, double hardness) {
        super(name, weight, price, transparency);
        this.hardness = hardness;
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "PreciousStone{" +
                "UUID='" + getUUID().getMostSignificantBits() + '\'' +
                ", name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", transparency=" + getTransparency() +
                ", hardness=" + hardness +
                ", polish=" + makePolish() +
                '}';
    }

    @Override
    public String makePolish() {
        return "Caboshon";
    }
}
