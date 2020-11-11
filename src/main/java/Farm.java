import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Farm {
    private int allProduceNumber;
    List<Plant> plants = new ArrayList<Plant>();

    public Farm() {
        allProduceNumber = 0;

        List<Plant> plantList = Arrays.asList(
                new Almond(),
                new Spruce(),
                new Juniper()
        );

        for (int i = 0; i < 3; i++) {
            for (int piece = 0; piece < getRandom(); piece++) {
                plants.add(plantList.get(i));
            }
        }
    }

    private int getRandom() {
        return new Random().nextInt(10) + 2;
    }

    public int getProduceBy(int month) {
        for (int i = 0; i < month; i++) {
            for (int j = 0; j < plants.size(); j++) {
                Plant plant = plants.get(j);
                plant.incrementMonthByOne();
                allProduceNumber += plant.getProducePerMonth();
            }
        }
        return allProduceNumber;
    }
}
