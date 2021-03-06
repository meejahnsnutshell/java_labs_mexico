package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 *      RectArea = h * w
 *      RectPerimeter = (w*2) + (h*2)
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double w = 2.4;
        double h = 6.4;
        double RectArea = h * w;
        double RectPerimeter = 2 * (w + h);

        System.out.println(RectArea);
        System.out.println(RectPerimeter);
    }
}
