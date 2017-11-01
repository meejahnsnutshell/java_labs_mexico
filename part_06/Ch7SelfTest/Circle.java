package part_06.Ch7SelfTest;

public class Circle extends TwoDShapeFromBook {

    private double radius = (super.getWidth()) / 2;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double width, double radius) {
        super(width);
        this.radius = radius;
    }

    public double area() {
        double area = Math.PI * (super.getWidth()/ 2) * (super.getWidth() / 2);
        return area;
    }


}
