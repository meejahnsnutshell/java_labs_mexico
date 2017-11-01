package part_06.Ch7SelfTest;

public class TwoDShapeFromBook {
    private double width;
    private double height;
    private String name;

    // A default constructor.
    TwoDShapeFromBook() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShapeFromBook(double width) {
        this.width = width;
    }

    // Accessor methods for width and height.
    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }


}
