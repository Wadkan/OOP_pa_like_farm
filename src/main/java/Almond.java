public class Almond extends Plant {
    public Almond() {
        super(50);
    }

    @Override
    public void incrementMonthByOne() {
        super.incrementMonthByOne();
        if (getProducePerMonth() < 40) {
            setProducePerMonth(getProducePerMonth() * 2);
        }
    }


}
