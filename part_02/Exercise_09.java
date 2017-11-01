package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {
        char ch = 'z';
        // starting at z, print out each letter incrementing down by one
        do {
            System.out.println(ch);
            ch--;
        }
        //stop when ch = a (the lowest number)
        while( ch>='a' );
    }

}
