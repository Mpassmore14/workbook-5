public class House extends Asset {
    String address;
    String condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address,String condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double ratePerSquareFoot;

        switch (condition.toLowerCase()) {
            case "excellent":
                ratePerSquareFoot = 180;
                break;
            case "good":
                ratePerSquareFoot = 130;
                break;
            case "fair":
                ratePerSquareFoot = 90;
                break;
            case "poor":
                ratePerSquareFoot = 80;
                break;
            default:
                ratePerSquareFoot = 100;
        }
        return (ratePerSquareFoot * squareFoot) + (0.25 * lotSize);

    }
}