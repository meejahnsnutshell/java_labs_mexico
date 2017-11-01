package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Received the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        long investmentAmt = input.nextLong();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRatePct = input.nextDouble();
        double interestRateDecimal = interestRatePct / 100;

        System.out.print("Enter number of years: ");
        double yearsToInvest = input.nextDouble();

        /*
        Formula if interest is compounded yearly:
        FV   =   P *((1 + r) ^ Y)
        FV = future value, P = invest amt, r = interest rate, Y = # years
         */

        double futureValue = investmentAmt * Math.pow((1 + interestRateDecimal), yearsToInvest);
        // Math is a class because it's capitalized
        // and we know it's static because we don't need to create an object to use it
        System.out.println(futureValue);
    }


}


