import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        // Each element in a hashmap contains two values, the first is a key value that represents a unique element, 
        // the second is the value associated with the key. Since each element has two values, the data types of both
        // need to be specified when createing the hashmap. Hashmaps cannot contain duplicate keys.
        HashMap<String, Integer> map = new HashMap<>();

        // You add a key and its value to a hash map using the put method
        map.put("1st", 1);
        map.put("2nd", 2);
        map.put("3rd", 3);

        // To get an individual element from a hash map use the get method, and pass the elements key as an argument.
        System.out.println(map.get("1st"));

        // To see if a hash map contains an element use the containsKey method passing the key as argument.
        System.out.println(map.containsKey("1st"));

        // There's also a containsValue method
        System.out.println(map.containsValue(1));
    }
}
