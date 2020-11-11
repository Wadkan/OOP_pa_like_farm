public class Almond extends GrowShroom {
    public Almond() {
        super(50, 8, 10, 13);
    }

    @Override
    public void incrementMonthByOne() {
        super.incrementMonthByOne();
        if (getProducePerMonth() < 40) {
            setProducePerMonth(getProducePerMonth() * 2);
        }
    }
}
