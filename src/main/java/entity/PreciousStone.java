package entity;

public class PreciousStone extends Stone {
    private double hardness;

    public PreciousStone(String name, double weight, double price, double transparency, double hardness) {
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
                "id='" + super.getId() + '\'' +
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
