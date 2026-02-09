class Car {
    String brand;
    String model;

    void displayCar() {
        System.out.println(brand + " " + model);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Fortuner";
        c1.displayCar();
    }
}
