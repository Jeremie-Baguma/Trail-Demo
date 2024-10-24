// TwoDoorToyota Class
public class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota(String model) {
        super("Toyota", model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a sporty Toyota " + model + " with two doors.");
    }

    @Override
    public void run() {

    }

    @Override
    public void repair() {

    }
}
