package report;

import entity.Necklace;
import entity.Stone;
import logic.NecklaceLogic;
import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;

import java.util.List;

public class NecklaceReporter {
    //Logger logger = org.slf4j.LoggerFactory.getLogger(NecklaceReporter, class);
    public static void reportWeight(Necklace necklace) {

        System.out.println("Necklace weight is: " + necklace.necklaceWeight() + " carat");
    }

    public static void reportPrice(Necklace necklace) {
        System.out.println("Neclace price is " + necklace.necklacePrice());
    }

    public static void reportByTransparency(Necklace necklace, int min_Transparency, int max_Transparency) {
        List<Stone> stonesInRangeTransparency = NecklaceLogic.searchStonesByTransparency(necklace, min_Transparency, max_Transparency);
        System.out.println("Stone in range by transparency is:");
        for (Stone list : stonesInRangeTransparency)
            System.out.println(list);
        if (stonesInRangeTransparency.size() == 0) System.out.println("Nothing");
    }

    public static void reportNeclace(Necklace necklace) {
        System.out.println(necklace);
    }
}
