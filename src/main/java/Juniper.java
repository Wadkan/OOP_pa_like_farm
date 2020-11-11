public class Juniper extends Plant implements Evergreen {
    int everGreenMonth;

    public Juniper() {
        super(14);
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
            System.out.println("Juniper at full production!");
            return false;
        }
        return true;

    }
}
