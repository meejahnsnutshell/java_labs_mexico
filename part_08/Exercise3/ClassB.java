package part_08.Exercise3;

public class ClassB {

    public void generateException() throws ArrayIndexOutOfBoundsException{

        System.out.println("Throwing an exception in generateException...");

        throw new ArrayIndexOutOfBoundsException();

    }
}
