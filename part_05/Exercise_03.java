package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02.
 * In Class_02, demonstrate method overloading. You must overload a method a least 3 times.
 * Each method should have a return type that is not void.
 *
 * Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


class Class_One{

    public static void main(String[] args) {

        Class_Two objOfClassTwo = new Class_Two();


        Class_Two.method1("Howdy.");

        Class_Two.method1(5);

        Class_Two.method1(123.456);



    }

}

class Class_Two{

    public static String method1(String str){

        System.out.println("The string overloaded version of method1: " + str);

        return str;

    }

    public static double method1(double d){

        System.out.println("The double overloaded version of method1: " + d);

        return d;

    }

    public static int method1(int i){

        System.out.println("The int overloaded version of method1: " + i);

        return i;

    }


}