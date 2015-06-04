package entity;

public class NecklaceFactory {
    private static int countNecklaces;

    public static Necklace createNecklace(String name) {
        Necklace necklace = new Necklace(name, StoneFactory.createStones(3, 3));
        countNecklaces++;
        return necklace;
    }

    public static int getCountNecklaces() {
        return countNecklaces;
    }

}
