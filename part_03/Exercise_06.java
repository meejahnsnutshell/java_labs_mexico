package part_03;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds % 60;
        System.out.println(currentSecond);

        // Get total minutes
        long totalMinutes = totalSeconds / 60;

        // Get the current minute in the hour
        long currentMinute = totalMinutes % 60;
        System.out.println(currentMinute);

        // Get the total hours
        long totalHours = totalMinutes / 60;

        // Get the current hour
        long currentHour = totalHours % 24;
        System.out.println("currentHour: " + currentHour);

        // Display results using a 12 hour clock, include AM or PM

            long hour12hr = (currentHour + timeZoneChange) % 24;
            System.out.println("hour12hr: " + hour12hr);


        if (hour12hr >= 12) {

            System.out.println((hour12hr - 12) + ":" + currentMinute + ":" + currentSecond + " PM");

        } else {

            System.out.println(hour12hr + ":" + currentMinute + ":" + currentSecond + " AM");
        }
    }
}
