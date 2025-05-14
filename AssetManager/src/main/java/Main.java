import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        Vehicle car = new Vehicle("bentley","may 2020",500000,"idk",2017,6000);
        car.getValue();
        System.out.println("this is" + car.getDescription() + " i bought it in " + car.getDateAcquired() + " the original cost is " + car.getOriginalCost() + " the make and model is "+ car.getMakeModel() + " it is a " + car.getYear() + " with "+ car.getOdometer() +" "+ car.getValue());



    }
}
