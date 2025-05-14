public class SemiTruck extends Vehicle {
    protected int numberOfTrailers;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,int numberOfTrailers) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfTrailers = getNumberOfTrailers();
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }


}
