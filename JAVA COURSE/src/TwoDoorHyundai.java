// TwoDoorHyundai Class
public class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String model) {
        super("Hyundai", model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a compact and efficient Hyundai " + model + " with two doors.");
    }

    @Override
    public void run() {

    }

    @Override
    public void repair() {

    }
    
}
