class Book {
    String title;

    Book(String t) {
        title = t;
    }

    void show() {
        System.out.println(title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Spring Boot");

        b1.show();
        b2.show();
    }
}
