package logic;

import entity.Necklace;
import entity.Stone;

import java.util.ArrayList;
import java.util.List;

public class NecklaceLogic {
    private static final int Min_Transparency = 80;
    private static final int Max_Transparency = 100;

    public static List<Stone> searchStonesByTransparency(Necklace necklace) {
        List<Stone> stonesByTransparency = new ArrayList<Stone>();
        for (Stone list : necklace.getStones()) {
            if (list.getTransparency() >= Min_Transparency && list.getTransparency() <= Max_Transparency)
                stonesByTransparency.add(list);
        }
        return stonesByTransparency;
    }
}
