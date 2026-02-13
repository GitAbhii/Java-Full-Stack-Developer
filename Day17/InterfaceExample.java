interface Vehicle {

    void start();  // abstract by default
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
    }
}
