class Car {
    String brand;
    String model;

    Car(String b, String m) {
        brand = b;
        model = m;
    }

    void display() {
        System.out.println(brand + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Fortuner");
        c1.display();
    }
}
