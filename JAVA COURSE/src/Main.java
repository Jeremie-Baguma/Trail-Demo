//Today's Goal:
//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>

public class Main {
    public static void main(String[] args) {

        FourDoorCar car1 = new CarTest("dawaXM","dawa1",10000000,200,50);
        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.stop();


    }
}


interface CarInterface {
    public void start();

    public void stop();

    public void accelerate();

    public void brake();

}

abstract class FourDoorCar implements CarIterface {
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}

public abstract class TwoDoorCar implements CarIterface {
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    public TwoDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }

    public TwoDoorCar(String ford, String model) {
    }

    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }

    public abstract void drive();
}

class CarTest extends  FourDoorCar {
    public CarTest(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void run() {

    }

    @Override
    public void repair() {

    }


    public abstract static class FourDoorCar implements Car {
        protected String brand;
        protected String model;

        public FourDoorCar(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public void openDoors() {
            System.out.println("All four doors are open.");
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model;
        }
    }


    public static class FourDoorToyota extends FourDoorCar {
        public FourDoorToyota(String model) {
            super("Toyota", model);
        }

        @Override
        public void startEngine() {

        }

        @Override
        public void stopEngine() {

        }

        @Override
        public void drive() {
            System.out.println("Driving a Toyota " + model + " smoothly.");
        }

        @Override
        public int getNumberOfDoors() {
            return 0;
        }

        @Override
        public double sell() {
            return 0;
        }
    }


    public static class FourDoorBMW extends FourDoorCar {
        public FourDoorBMW(String model) {
            super("BMW", model);
        }

        @Override
        public void startEngine() {

        }

        @Override
        public void stopEngine() {

        }

        @Override
        public void drive() {
            System.out.println("Driving a BMW " + model + " with sport mode.");
        }

        @Override
        public int getNumberOfDoors() {
            return 0;
        }

        @Override
        public double sell() {
            return 0;
        }
    }


    public static class FourDoorFord extends FourDoorCar {
        public FourDoorFord(String model) {
            super("Ford", model);
        }

        @Override
        public void startEngine() {

        }

        @Override
        public void stopEngine() {

        }

        @Override
        public void drive() {
            System.out.println("Driving a Ford " + model + " with power and reliability.");
        }

        @Override
        public int getNumberOfDoors() {
            return 0;
        }

        @Override
        public double sell() {
            return 0;
        }
    }


    public static class FourDoorHyundai extends FourDoorCar {
        public FourDoorHyundai(String model) {
            super("Hyundai", model);
        }

        @Override
        public void startEngine() {

        }

        @Override
        public void stopEngine() {

        }

        @Override
        public void drive() {
            System.out.println("Driving a Hyundai " + model + " efficiently.");
        }

        @Override
        public int getNumberOfDoors() {
            return 0;
        }

        @Override
        public double sell() {
            return 0;
        }
    }
}
public abstract class TwoDoorCar implements Car {
    protected String brand;
    protected String model;

    public TwoDoorCar (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void openDoors() {
        System.out.println("Both doors are open.");
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model;
    }
}




}








