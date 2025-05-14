public class Hovercraft extends Vehicle {
    protected boolean worksOnWater;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean worksOnWater) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.worksOnWater = isWorksOnWater();
    }

    public boolean isWorksOnWater() {
        return worksOnWater;
    }

    public void setWorksOnWater(boolean worksOnWater) {
        this.worksOnWater = worksOnWater;
    }


}
