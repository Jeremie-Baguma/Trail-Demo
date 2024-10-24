// TwoDoorFord Class
public class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String model) {
        super("Ford", model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a two-door Ford " + model + " with classic reliability.");
    }

    @Override
    public void run() {

    }

    @Override
    public void repair() {

    }
}
