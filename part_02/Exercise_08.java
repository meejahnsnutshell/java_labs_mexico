package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        long number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number between 0 and 1,000,000,000: ");
        // can add data validation here
        number = input.nextInt();

        long guess = 500000000; //start guess at half of highest possible input

        if (guess == number) { //if that's right, immediately say so
            System.out.println("The number is " + guess + " !");
        }

        //if guess isn't right
        while (guess != number){

            // check if input is less than guess, then iterate down to zero until it's found
            if (number < guess) {
                for (guess = guess - 1; guess >= 0; guess--) {
                    if (guess == number) {
                        System.out.println("The number is " + guess + " !");
                        break;
                    }
                }
            }

            // if number is greater than guess go here & iterate up to highest possibility
            else {
                for (guess = guess + 1; guess <=1000000000; guess++) {
                    if (guess == number) {
                        System.out.println("The number is " + guess + " !");
                        break;
                    }
                }
            }
        }



        /*
        Failed attempts:

        else if (number < guess) {
            System.out.println("1");

            while (number != guess) {
                System.out.println("2");

                for (guess = guess - 1; guess >= 0; guess--) {
                    System.out.println("3");

                    if (guess == number) {
                        System.out.println("4");
                        System.out.println("The number is " + guess + " !");
                        }
                    }
            }
        }

        else {

            while (number != guess) {
                System.out.println("5");

                for (guess = guess + 1; guess <=5; guess++) {
                    System.out.println("6");

                    if (guess == number) {
                        guess = number;
                        System.out.println("The number is " + guess + " !");
                    }
                }
            }
        } */
    }
}