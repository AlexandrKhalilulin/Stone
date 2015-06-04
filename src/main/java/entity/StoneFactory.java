package entity;

import java.util.ArrayList;
import java.util.List;

public class StoneFactory {
    public static List<Stone> createStones(int countPrecious, int countSemiPrecious) {
        List<Stone> stones = new ArrayList<Stone>();
        for (int i = 0; i < countPrecious; i++) {
            stones.add(new PreciousStone("PreciousStone" + i, (i + 1) * 10 / 9, (2 - i) * 340 / 15, (i + 4) * 34 / 12, (i + 4) * 34 / 12));
        }

        for (int j = 0; j < countSemiPrecious; j++) {
            stones.add(new SemiPreciousStone("SemiPreciousStone" + j, (j + 1) * 8 / 7, (3 - j) * 60 / 17, (j + 3) * 33 / 11, (j + 3) * 38 / 11));
        }
        return stones;
    }
}
