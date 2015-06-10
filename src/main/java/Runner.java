import entity.Necklace;
import entity.NecklaceFactory;
import entity.Stone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import report.NecklaceReporter;

import java.util.Collections;
import java.util.Comparator;

public class Runner {
    private static final int Min_Transparency = 1;
    private static final int Max_Transparency = 100;

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Runner.class);
        logger.error("error");

        Necklace necklace = NecklaceFactory.createNecklace("Necklace1");
        NecklaceReporter.reportWeight(necklace);
        NecklaceReporter.reportPrice(necklace);
        Collections.sort(necklace.getStones(), Stone.Name_Order);
        Collections.sort(necklace.getStones(), Comparator.comparing(Stone::getPrice));
        NecklaceReporter.reportByTransparency(necklace, Min_Transparency, Max_Transparency);
    }
}
