class Mobile {
    String brand;
    int price;

    void showMobile() {
        System.out.println(brand + " Price: " + price);
    }
}

public class MobileMain {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;
        m1.showMobile();
    }
}
