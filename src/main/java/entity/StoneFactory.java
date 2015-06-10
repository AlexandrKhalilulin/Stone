package entity;

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
            stones.add(makePreciousStone());
        }

        for (int j = 0; j < countSemiPrecious; j++) {
            stones.add(makeSemiPreciousStone());
        }
        return stones;
    }

    public static Stone makePreciousStone() {
        String name = "PreciousStone";
        double weight = (double) Math.random() * Max_Weight;
        double transparency = Math.random() * Max_Transparency;
        double hardness = Math.random() * Max_Hardness;
        double price = weight * transparency * hardness;
        Stone stone = new PreciousStone(name, weight, price, transparency, hardness);
        return stone;
    }

    public static Stone makeSemiPreciousStone() {
        String name = "SemiPreciousStone";
        double weight = (double) Math.random() * Max_Weight;
        double transparency = Math.random() * Max_Transparency;
        double tracery = Math.random() * Max_Tracery;
        double price = weight * transparency * tracery;
        Stone stone = new SemiPreciousStone(name, weight, price, transparency, tracery);
        return stone;
    }
}
