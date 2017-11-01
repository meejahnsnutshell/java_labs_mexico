package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    // a method that takes an array of unknown type
    public static <T> void exchangeArray( T[] inputArray ) {

        // check that we have at least two elements in inputArray
        if (inputArray.length >= 2){
            // switch the first two elements:
            T temp = inputArray[0];
            inputArray[0] = inputArray[1];
            inputArray[1] = temp;
        } else {
            System.out.println("There are not enough elements.");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        exchangeArray(intArray);

        for (Integer x: intArray) {
            System.out.print(x + " ");
        }
    }
}
