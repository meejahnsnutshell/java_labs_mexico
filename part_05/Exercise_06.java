package part_05;

/**
 * Study this functional example of using recursion to print the fibonacci sequence until you can comfortably
 * explain how it works and why to a stranger.
 */

// Fibonacci sequence is a series of numbers in which each number ( Fibonacci number ) is the sum of the two
// preceding numbers

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("How many numbers do you want to print? ");
        // sets user input equal to iter
        int iter = stdIn.nextInt();

        // for every i up to iter, print out the result of fibonacci method
        for (int i = 0; i < iter; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        stdIn.close();
    }

    // static method that returns a long and takes a long
    public static long fibonacci(long n) {
        // if the number input is negative, return & give error message. Need to read more about throw.
        if (n < 0)
            throw new IllegalArgumentException("Can't accept negative arguments");
        return

                (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
                // this tests is n < 2, if true you get n, if false the method calls itself on n-1 and n-2
    }
}