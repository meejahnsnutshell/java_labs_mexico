package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */


public class Exercise_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of miles to drive: ");
        double milesToDrive = input.nextDouble();

        System.out.print("Enter the MPG of the car: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter the price per gallon of fuel: ");
        double pricePerGallon = input.nextDouble();

        double gallonsUsed = milesToDrive / milesPerGallon;

        double costOfTrip = pricePerGallon * gallonsUsed;

        System.out.println("The trip costs $" + costOfTrip + ".");




    }
}
