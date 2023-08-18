import java.util.Arrays;

public class ArraysLearn {
    public static void main(String[] args){
        // Arrays are a fixed length data structure containing elements that must all be the same data type. 

        // An arrays length must be defined before it can be written to or read from. There are two ways to define an 
        // array.

        // 1. declare it with initial values wrapped in curlies, the compiler infers the length of the array. 
        int[] intArr = {1, 2, 3};
        System.out.println(Arrays.toString(intArr));
        
        // 2. use the new keyword on the data type of the array, and indicate the length in the straight brackets
        int[] emptyArr = new int[2];

        // To assign or reassign the indexes of an array reference the specific index using bracket notation and the index
        // then use the assignment operator to assign the new value
        emptyArr[0] = 4;
        emptyArr[1] = 6;
        System.out.println(Arrays.toString(emptyArr));

        // Array elements are mutable, but you cannot reassign an entire array. 

        // Remember that the indexes of an array are determined at its declaration, and attempting to assign a value to
        // an index that isnt there will result in error. 

        // Arrays can be sorted using the sort method of the Arrays class. It mutates the original array.
        int[] unsorted = {3, 2, 7, 4, 1};
        Arrays.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));

        // Once you have an array sorted you can determine the arrays smallest value by accessing the 0 index
        int lowestVal = unsorted[0];

        // And its highest by accessing the index equivalent to the length of the array - 1
        int highestVal = unsorted[unsorted.length - 1];
        System.out.print(lowestVal);
        System.out.println("\t" + highestVal);

        // You can search through an array for a specific value using the Arrays.binarySearch method. It will return
        // the index of sought after element or -1 if it doesnt exist. The only caveat is the array must first be sorted 
        // for it to work properly
        int soughtVal = Arrays.binarySearch(unsorted, 1);
        System.out.println(Arrays.toString(unsorted));
        System.out.println(soughtVal);

        // All or part of an array can be copied using the Arrays.copyOf method. It takes two arguments, source array, and
        // length of copy. If the length of the copy is longer than the source than the left over indexes are filled with
        // 0, empty char, or empty string, depending on the type of the array. 
        int[] unsortedCopy = Arrays.copyOf(unsorted, 7);
        System.out.println(Arrays.toString(unsortedCopy));
        
       


    }
}
