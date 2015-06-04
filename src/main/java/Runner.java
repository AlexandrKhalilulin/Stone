import entity.Necklace;
import entity.NecklaceFactory;
import report.NecklaceReporter;

import java.util.Collections;

/**
 * Created by Alexandr on 22.05.2015.
 */
public class Runner {
    public static void main(String[] args) {
        Necklace necklace = NecklaceFactory.createNecklace("Necklace1");
        NecklaceReporter.reportWeight(necklace);
        NecklaceReporter.reportPrice(necklace);
        Collections.sort(necklace.getStones());
        NecklaceReporter.reportByTransparency(necklace);
    }
}
