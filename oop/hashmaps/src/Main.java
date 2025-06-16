import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /*
        Hashmap = A data structure that stores key-value pairs.
                  Keys are unique, but Values can be duplicated.
                  Does not maintain any order, but is memory efficient.
                  Hashmap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("Caneca", 299.99);
        map.put("Prato", 599.99);
        map.put("Garfos", 399.99);
        map.put("Casaco", 1299.99);
//        map.put("Caneca", 1_000_000.00);

        System.out.println(map);

//        map.remove("Guardanapo");
//        System.out.println(map);
//        System.out.println(map.get("Prato"));
//        System.out.println(map.containsKey("Garfos"));
//        System.out.println(map.containsValue("Garfos"));

        System.out.println(map.size());

        for (String key: map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }

    }

}
