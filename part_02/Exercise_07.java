package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double minutes; // what data type is best here? long?
        double days;
        double years;

        System.out.print("Enter a number no greater than 1 billion : ");
        minutes = input.nextDouble(); //input is why java knows this is the user input, what is nextInt()?


        if (minutes > 1000000000.00) {
            System.out.println("This number is too big.");
        }
        else {
            days = minutes / 1440; //converts minutes to days
            years = days / 365; // converts days to years
            System.out.println(minutes + " minutes is equal to " + days + " days and " + years + "years.");
        }

    }
}
