public class Plant {
    int producePerMonth;
    int mouth;
    int fourMonthCounter;

    public Plant(int producePerMonth) {
        this.producePerMonth = producePerMonth;
        mouth = 0;
        fourMonthCounter = 0;
    }

    public void setProducePerMonth(int producePerMonth) {
        this.producePerMonth = producePerMonth;
    }

    public int getProducePerMonth() {
        return producePerMonth;
    }

    public void incrementMonthByOne() {
        mouth++;
        fourMonthCounter++;
        producePerMonth += 4;
    }
}
