class Book {
    String title;
    String author;

    void showBook() {
        System.out.println(title + " by " + author);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James";
        b1.showBook();
    }
}
