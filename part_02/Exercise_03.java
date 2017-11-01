package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Converting to meters..");
        double meters = feet * .305;
        System.out.println(feet + " Feet is equal to " + meters + " meters." );
    }
}
