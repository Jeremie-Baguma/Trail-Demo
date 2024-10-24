// TwoDoorBMW Class
public class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String model) {
        super("BMW", model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a stylish BMW " + model + " with power in every turn.");
    }

    @Override
    public void run() {

    }

    @Override
    public void repair() {

    }
}
