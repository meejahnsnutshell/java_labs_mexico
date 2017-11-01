package part_04;

import java.util.Scanner;

/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */


public class Exercise_01 {

    public static void main(String[] args) {


        //loading the scanner because we're going to have user input
        Scanner input = new Scanner(System.in);

        //ask for integers from the user 10 times, and store each one as a variable called ai
        System.out.println("Enter an integer: ");
        int a0 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a1 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a2 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a3 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a4 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a5 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a6 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a7 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a8 = input.nextInt();

        System.out.println("Enter an integer: ");
        int a9 = input.nextInt();

        //create array and assign it the inputs
        int[] inputArray = {a1, a2, a3, a4, a5, a6, a7, a8, a9};

        // run a for loop starting at 2 up to 10 printing every 2nd number
        for (int i = 2; i <= 10; i+=2){
            System.out.println(i);
        }

        // run a for loop starting at 9 down to 0 printing every 2nd number
        for (int i = 9; i > 0; i-=2){
            System.out.println(i);
        }

    }
}

// could've used a for loop to avoid 10 lines of sout & built the array simultaneously


