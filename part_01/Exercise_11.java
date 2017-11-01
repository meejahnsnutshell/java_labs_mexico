package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int pop = 380123456; //initial population
        int year = 2017;    // current year, might not need this



        for (int i = 2017; i <=2020; i++) {
            //1 year = 31536000 seconds
            for (int s = 0; s <= 31536000; s++){
                if (s % 6 == 0)
                    pop = pop + 1;
                if (s % 12 == 0)
                    pop = pop - 1;
                if (s % 40 == 0)
                    pop = pop + 1;

            }
            System.out.println("The US population in " + i + " is " + pop);
            }

    }
}
