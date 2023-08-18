import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        // Collections are data structures similar to Arrays, but instead of having a fixed length their length can change.

        // Java collections are generic classes that take type parameters in angle brackets, to indicate what kind of data
        // they contain. Primitive types require a wrapper type when being used with collections.

        // A collection needs to be created before data can be added to it. 

        // The first kind of collection is an ArrayList, it is exactly like an array, but with an unfixed length.

        // To create one you must first import the class from the java.util library. Imports go outside the class of the
        // file.

        // Next, create a variable of the type ArrayList<whatever variable you want>, and use the new keyword calling
        // it as a constructor method.
        // Newer versions of java allow you to leave the type out of the right side of the = 
        ArrayList<Integer> list = new ArrayList<>();

        // To add eleemnts to the ArrayList use the add method.
        list.add(42);
        list.add(53);
        list.add(68);
        list.add(37);

        // To access elements in an ArrayList use the get method. It takes the index of the element as an argument
        System.out.println(list.get(0));

        // To get the last item of an array you would use array.length - 1. There is no length property with ArrayLists
        // use the size method instead
        System.out.println(list.get(list.size() - 1));

        // To print out an ArrayList there is a toString method. It is not apart of the Collections class like most of the
        // other methods used in ArrayLists.
        System.out.println(list.toString());

        // If youd like to sort the Array list the collections class has a method of sort that you pass the list to 
        Collections.sort(list);
        System.out.println(list.toString());

    }
}
