package entity;

public class NecklaceFactory {

    public static Necklace createNecklace(String name, int countPrecious, int countSemiPrecious) {
        Necklace necklace = new Necklace(name, StoneFactory.createStones(countPrecious, countSemiPrecious));
        return necklace;
    }

}
