import java.time.LocalDate;

public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int madeYear = getYear();
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int age = currentYear - madeYear;
        System.out.println("t");

        double currentValue;
        if (age <= 3) {
            double depreciation = (age * .03) * originalCost;
            currentValue = originalCost - depreciation;
        } else if (age >= 3 && age <= 6) {
            double l = (age * .06) * originalCost;
            currentValue = originalCost - l;
        } else if (age >= 7 && age <= 10) {
            double moo = (age * .08) * originalCost;
            currentValue = originalCost - moo;
        } else currentValue = 0.25 * 1000;

        return currentValue;
    }
}

