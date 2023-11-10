package seminar7.factory_source;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random= ThreadLocalRandom.current();
        List<IItemGenerator> iItemGenerators=new ArrayList<>();
        iItemGenerators.add(new GolfGenerator());
        iItemGenerators.add(new GemGenerator());
        for (int i = 0; i < 10; i++) {
            int indexFabric=Math.abs(random.nextInt()%2==0?0:1);
            IItemGenerator item = iItemGenerators.get(indexFabric);
            item.openRerward();
        }
}
}
