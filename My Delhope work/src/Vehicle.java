public class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Trunk opened.");
    }
}

class Motorcycle extends Vehicle {
    void popWheelie() {
        System.out.println("Popped a wheelie!");
    }
}
