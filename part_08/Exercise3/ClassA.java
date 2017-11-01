package part_08.Exercise3;

public class ClassA {

    public static void main(String[] args) {

        // create Class B object to be able to call non static method in Class B:
        ClassB beClassy = new ClassB();

        // use a try statement because the method called throws an exception that it does not handle:
        try {
            beClassy.generateException();
            // catch the exception and print out text to show code worked as expected:
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The exception was caught in Class A!");
        }

        //  Originally thought this sout wouldn't print, but it does BECAUSE the catch statement works
        // properly and code keeps running:
        // System.out.println("No exception was generated here :(");
    }
}
