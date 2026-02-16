import java.util.HashMap;

public class HashMapCRUDExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // CREATE
        map.put(1, "Rahul");
        map.put(2, "Aman");
        map.put(3, "Neha");

        System.out.println("Initial Map: " + map);

        // READ
        System.out.println("Value for key 2: " + map.get(2));

        // UPDATE
        map.put(2, "Rohit");
        System.out.println("After Update: " + map);

        // DELETE
        map.remove(3);
        System.out.println("After Delete: " + map);
    }
}
