package logic;

import console.ConsoleLogic;
import entity.Necklace;
import entity.Stone;

import java.util.ArrayList;
import java.util.List;

public class NecklacesLogic {

    public static List<Stone> searchStonesByTransparency(Necklace necklace) {
        List<Stone> stonesByTransparency = new ArrayList<Stone>();
        double min = ConsoleLogic.inputMinValueTransparency();
        double max = ConsoleLogic.inputMaxValueTransparency();
        for (Stone list : necklace.getStones()) {
            if (list.getTransparency() >= min && list.getTransparency() <= max)
                stonesByTransparency.add(list);
        }

        return stonesByTransparency;
    }

}
