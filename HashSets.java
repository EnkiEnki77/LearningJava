import java.util.Collections;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args){
        // There are collections called HashSets. They are similar to ArrayLists but must have all unique values. 
        // Duplicate values do not get added in.
        HashSet<Integer> set = new HashSet<>();

        // You can use the add method to add items to the set.
        set.add(47);
        set.add(24);
        set.add(82);
        set.add(96);
        System.out.println(set.toString());
        
        // HashSet's cannot be sorted, and they do not have a get method

        // You can determine the size of a hashset  using the size method 
        System.out.println(set.size());

        // You can determine whether a hashset has a value or not using the contains method, it returns a boolean
        System.out.println(set.contains(96));
        System.out.println(set.contains(9));

    }
}
