package logic;

import entity.Necklace;
import entity.Stone;

import java.util.ArrayList;
import java.util.List;

public class NecklaceLogic {

    public static List<Stone> searchStonesByTransparency(Necklace necklace, int min_Transparency, int max_Transparency) {
        List<Stone> stonesByTransparency = new ArrayList<Stone>();
        for (Stone list : necklace.getStones()) {
            if (list.getTransparency() >= min_Transparency && list.getTransparency() <= max_Transparency)
                stonesByTransparency.add(list);
        }
        return stonesByTransparency;
    }
}
