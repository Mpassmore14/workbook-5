public class Main {
    public static void main(String[] args) {
        Moped bike = new Moped("light tan",2,1,50,true);

        System.out.println("The color of this vehicle is " + bike.getColor() + " with space that can hold up to "+ bike.numberOfPassengers +" passengers" + ", cargo cap of " + bike.cargoCapacity + " and a fuel cap of "+ bike.fuelCapacity + ". I know what you are thinking.." + ". Does is have handle bars? The answer is " +bike.hasHandleBars);

        Car nissan = new Car("black",4, 4,100,4);

        System.out.println(nissan);

        SemiTruck wheeler = new SemiTruck("indigo",20,40,200,2);
        System.out.println(wheeler);

        Hovercraft hybrid = new Hovercraft("red",3,3,80, true);
        System.out.println(hybrid);




    }
}
