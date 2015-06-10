package entity;

public class NecklaceFactory {

    private static final int CountPreciousStoneInNecklace = 3;
    private static final int CountSemiPreciousStoneInNecklace = 3;

    public static Necklace createNecklace(String name) {
        Necklace necklace = new Necklace(name, StoneFactory.createStones(CountPreciousStoneInNecklace, CountSemiPreciousStoneInNecklace));
        return necklace;
    }

}
