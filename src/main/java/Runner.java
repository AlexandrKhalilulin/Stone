import entity.Necklace;
import entity.NecklaceFactory;
import entity.Stone;
import report.NecklaceReporter;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Alexandr on 22.05.2015.
 */
public class Runner {
    public static void main(String[] args) {
        Necklace necklace = NecklaceFactory.createNecklace("Necklace1");
        NecklaceReporter.reportWeight(necklace);
        NecklaceReporter.reportPrice(necklace);
        Collections.sort(necklace.getStones(), Stone.Name_Order);
        Collections.sort(necklace.getStones(), Comparator.comparing(Stone::getPrice));
        NecklaceReporter.reportByTransparency(necklace);
        NecklaceReporter.reportNeclace(necklace);
    }
}
