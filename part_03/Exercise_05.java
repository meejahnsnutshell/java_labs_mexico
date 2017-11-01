package part_03;

import java.util.Scanner;
/**
 *
 */


public class Exercise_05 {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        // read an integer from the user >=1 and <= 999,999,999

        System.out.print("Enter an integer >=1 and <= 999,999,999: ");
        int userNumber = input.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7
        if ((userNumber % 4 == 0) && (userNumber % 7 == 0)) {
            System.out.println(userNumber + " is divisible by both 4 and 7.");
            } else {
            System.out.println(userNumber + " is not divisible by both 4 and 7.");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7

        if ((userNumber % 4 == 0) || (userNumber % 7 == 0)) {
            System.out.println(userNumber + " is divisible by 4 or 7, but not necessarily both.");
        } else {
            System.out.println(userNumber + " is not divisible by 7 or 4.");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if ((userNumber % 4 == 0) ^ (userNumber % 7 == 0)) {
            System.out.println(userNumber + " is divisible by either 4 or 7 but not both");
        } else {
            System.out.println(userNumber + " is not divisible by 4 or 7 exclusively.");
        }


        // print out the results
    }
}
