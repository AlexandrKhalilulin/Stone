import entity.Necklace;
import entity.NecklaceFactory;
import entity.Stone;
import logic.NecklaceLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Runner.class);
        Necklace necklace = NecklaceFactory.createNecklace("Necklace1");
        logger.info("Neclace price is: {}", String.valueOf(necklace.necklacePrice()));
        logger.info("Necklace weight is: {}", String.valueOf(necklace.necklaceWeight()));
        Collections.sort(necklace.getStones(), Comparator.comparing(Stone::getUUID));
        logger.info("Stone in range by transparency is: {}", String.valueOf(NecklaceLogic.searchStonesByTransparency(necklace)));
        for (Stone list : necklace.getStones()) {
            System.out.println(list);

        }
    }
}
