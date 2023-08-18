import java.util.Arrays;

public class Generics {
     // On occasion you may want code that can work with multiple different data types without having to rewrite the
    // code for each data type. This is where generics come into play.

    // Generics can be used with java classes and methods.

    // Generic methods can be given any kind of data type as an arg. The data type of the return is inferred after
    // the compiler knows the type of the argument.

    // A method is designated as generic by declaring it with <> and passing it a variable <T>, this is the generic, and
    // it acts as the place holder for the data type of the methods return value, and parameters. The return value and
    // argument can now be any data type.
    public static <BaT> BaT getMidPointItem(BaT[] array){
        return array[array.length / 2];
    }

    public static void main(String[] args){
        String[] names = {"Bat", "Enki", "Magnus", "Janja"};
        String midPointName = getMidPointItem(names);
        System.out.print("The middle name of the array " + Arrays.toString(names));
        System.out.println(" is " + midPointName);

        // Generics only work with Objects such as String, not primitive types such as int, char, double, etc. For this
        // reason there are Object wrapper types for these primitives, such as Double, Character, etc. 
        // In this case the array passed into the generic method must be declared with a wrapper type.
        Character[] characters = {'E', 'B', 'C', 'D'};
        char midPointChar = getMidPointItem(characters);
        System.out.print("The middle name of the array " + Arrays.toString(characters));
        System.out.println(" is " + midPointChar);

    }
}
