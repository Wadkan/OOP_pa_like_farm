public class Spruce extends GrowShroom implements Evergreen {
    int everGreenMonth;

    public Spruce() {
        super(26, 5, 15, 4);
        this.everGreenMonth = 0;
    }

    @Override
    public void incrementMonthByOne() {
        if (checkProducePerMonth()) {
            super.incrementMonthByOne();
            if (increaseGreenMonthByOn()) {
                everGreenMonth = 0;
                setProducePerMonth(getProducePerMonth() + 8);
            }
        }
    }

    public boolean increaseGreenMonthByOn() {
        everGreenMonth++;
        return (everGreenMonth == 5);
    }

    public boolean checkProducePerMonth() {
        if (70 <= getProducePerMonth()) {
            System.out.println("Spruce at full production!");
            return false;
        }
        return true;

    }
}
