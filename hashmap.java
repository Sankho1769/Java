import java.util.HashMap;

public class hashmap {

    HashMap<String, Integer> map = new HashMap<>();

    public void createMap() {
        map.put("Alice", 20);
        map.put("Bob", 25);

        int age = map.get("Alice");
        System.out.println(age);
    }

    public static void main(String[] args) {
        hashmap obj = new hashmap();
        obj.createMap();
    }
}
