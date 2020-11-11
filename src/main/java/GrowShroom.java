import java.util.Random;

public class GrowShroom extends Plant {
//    boolean getChanceForShroomGrowing();
//    void ifShroomIncreaseProduction(); // almond 10%, spruce 15%
//    boolean ifRot();    // if true no production at all

    int chanceForShroom;
    int ifShroomGrowPercent;
    int chanceForRot;

    public GrowShroom(int producePerMonth, int chamceForShroom, int ifShroomGrowPercent, int chanceForRot) {
        super(producePerMonth);
        this.chanceForShroom = chamceForShroom;
        this.ifShroomGrowPercent = ifShroomGrowPercent;
        this.chanceForRot = chanceForRot;
    }

    @Override
    public void incrementMonthByOne() {
        if (ifNotRot()) {
            ifShroomIncreaseProduction();
            super.incrementMonthByOne();
        }
    }

    private boolean getChance(int chance) {
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        return randNum < chance;
    }

    public void ifShroomIncreaseProduction() {
        if (getChance(chanceForShroom)) {
            setProducePerMonth((int) (getProducePerMonth() * (1 + ifShroomGrowPercent / 100)));
        }

    }

    public boolean ifNotRot() {
        return (getChance(chanceForRot));
    }
}
