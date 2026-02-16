import java.util.ArrayList;

public class ArrayListCRUDExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // CREATE
        list.add("Rahul");
        list.add("Aman");
        list.add("Neha");

        System.out.println("Initial List: " + list);

        // READ
        System.out.println("Element at index 1: " + list.get(1));

        // UPDATE
        list.set(1, "Rohit");
        System.out.println("After Update: " + list);

        // DELETE
        list.remove("Neha");
        System.out.println("After Delete: " + list);
    }
}
