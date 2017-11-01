package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */

// took me a long time to understand how this works out to the correct math.

public class Exercise_10 {

    public static void main(String[] args) {

        int i, j;

        // loop through every number from 2 to 100, can skip 1 since it's obvious
        for (i = 2; i <= 100; i++) {

            boolean isPrime = true;

            /*
                For every number in the outer loop, check if it divides evenly by every number
                between two and itself - 1, if yes, isPrime becomes false and won't print in the if below
                You're not including the number itself, that's why this works.
            */

            for (j = 2; j < i; j++) { // or for(j=count/2; d>=2; d++) to optimize

                if (i % j == 0) {

                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}


    /*

    public static void main(String[] args) {
        int i, j, isPrime, n;
        System.out.println("All Prime Numbers Between 1 to 100");

        // For every number between 2 to 100, check
        //  whether it is prime number or not
        for (i = 2; i <= 100; i++) {
            isPrime = 0;
            // Check whether i is prime or not
            for (j = 2; j <= i / 2; j++) {
                // If any number between 2 to i/2 divides i
                // completely then i cannot be prime number
                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }

            if (isPrime == 0)
                System.out.print(i + " ");
        }

    }

    */





        /*

        int i, j;
        System.out.println("All Prime Numbers Between 1 to 100");

        for (i = 2; i <= 100; i++) {

            for (j = 2; j <= (i / 2); j++) {

                if (i % j == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

        */
