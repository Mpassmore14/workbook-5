public class Moped extends Vehicle {
    protected boolean hasHandleBars;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasHandleBars) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasHandleBars = hasHandleBars;
    }

    public Moped() {
    }

    public boolean isHasHandleBars() {
        return hasHandleBars;
    }

    public void setHasHandleBars(boolean hasHandleBars) {
        this.hasHandleBars = hasHandleBars;
    }




    }

