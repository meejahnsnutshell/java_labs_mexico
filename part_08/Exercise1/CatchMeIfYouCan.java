package part_08.Exercise1;

// make a method in a class that divides two numbers
// catch arithmetic error

public class CatchMeIfYouCan {

    public static void divide(int a, int b) {
        double result;
        try {
            result = a / b;
        } catch (ArithmeticException leo){
            System.out.println(leo.getMessage());
        }
    }

    public static void main(String[] args) {
        divide(3 , 0);
    }

}
