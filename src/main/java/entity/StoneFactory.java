package entity;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class StoneFactory {
    private static final int Max_Weight = 10;
    private static final int Max_Hardness = 10;
    private static final int Max_Transparency = 100;
    private static final int Max_Tracery = 30;

    public static List<Stone> createStones(int countPrecious, int countSemiPrecious) {
        List<Stone> stones = new ArrayList<Stone>();
        for (int i = 0; i < countPrecious; i++) {
            stones.add(createPreciousStone("PreciousStone" + i));
        }

        for (int j = 0; j < countSemiPrecious; j++) {
            stones.add(createSemiPreciousStone("SemiPreciousStone" + j));
        }
        return stones;
    }

    public static Stone createPreciousStone(String name) {
        double weight = (double) Math.random() * Max_Weight;
        double transparency = Math.random() * Max_Transparency;
        double hardness = Math.random() * Max_Hardness;
        Money price = Money.of(CurrencyUnit.EUR, weight * transparency * hardness, RoundingMode.UP);
        Stone stone = new PreciousStone(name, weight, price, transparency, hardness);
        return stone;
    }

    public static Stone createSemiPreciousStone(String name) {
        double weight = (double) Math.random() * Max_Weight;
        double transparency = Math.random() * Max_Transparency;
        double tracery = Math.random() * Max_Tracery;
        Money price = Money.of(CurrencyUnit.EUR, weight * transparency * tracery, RoundingMode.UP);
        Stone stone = new SemiPreciousStone(name, weight, price, transparency, tracery);
        return stone;
    }
}
