package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Converting to pounds..");
        double kilos = pounds * .454;
        System.out.println(pounds + " Pounds is equal to " + kilos + " kilograms." );
    }
}
