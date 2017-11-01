package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *      Area = pi*r^2
 *      Perimeter = 2*pi*r
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        double area = Math.PI*Math.pow(radius, 2);
        double perimeter = 2*Math.PI*radius;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
