package report;

import entity.Necklace;
import entity.Stone;
import logic.NecklacesLogic;

import java.util.List;

public class NecklaceReporter {
    public static void reportWeight(Necklace necklace) {
        System.out.println("Necklace weight is: " + necklace.necklaceWeight() + " carat");
    }

    public static void reportPrice(Necklace necklace) {
        System.out.println("Neclace price is " + necklace.necklacePrice() + " y.e.");
    }

    public static void reportByTransparency(Necklace necklace) {
        List<Stone> stonesInRangeTransparency = NecklacesLogic.searchStonesByTransparency(necklace);
        System.out.println("Stone in range by transparency is:");
        for (Stone list : stonesInRangeTransparency)
            System.out.println(list);
        if (stonesInRangeTransparency.size() == 0) System.out.println("Nothing");
    }

    public static void reportNeclace(Necklace necklace) {
        System.out.println(necklace);
    }
}
