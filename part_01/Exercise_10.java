package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] strings) {

        double dist = 12;    // kilometers
        double time = 30.5;  // minutes

        //convert km to mi
        dist = dist/1.6;

        //convert min to hr
        time = time/60;

        double avg_speed = dist/time;
        System.out.println("The runner's average speed is " + avg_speed + " miles per hour.");

    }

}
