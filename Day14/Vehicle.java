class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving...");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();   // inherited method
        c1.drive();
    }
}
