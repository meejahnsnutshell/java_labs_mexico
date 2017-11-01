package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // takes input
        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        // if input is less than nine, corresponding if statement is activated
        if (number <= 9) {

            if (number == 1) {
                System.out.println("ONE");
            }
            if (number == 2) {
                System.out.println("TWO");
            }
            if (number == 3) {
                System.out.println("THREE");
            }
            if (number == 4) {
                System.out.println("FOUR");
            }
            if (number == 5) {
                System.out.println("FIVE");
            }
            if (number == 6) {
                System.out.println("SIX");
            }
            if (number == 7) {
                System.out.println("SEVEN");
            }
            if (number == 8) {
                System.out.println("EIGHT");
            }
            if (number == 9) {
                System.out.println("NINE");
            }
        }

        // anything other than 9 goes here
        else System.out.println("OTHER");

    }
}