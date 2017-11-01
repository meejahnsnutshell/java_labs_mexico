package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you must manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within
 * method_02 modify the instance variables of Class_02 once again. Use System.out.println at various points to
 * demonstrate the flow of execution and the varying state of each private variable. You can name these classes
 * whatever you want.
 */

class FirstClass {

    public static void main(String[] args) {

        // Create an instance of firstClass in order to use method1
        FirstClass firstClassObject = new FirstClass();

        // create an instance of SecondClass
        SecondClass secondClassObject = new SecondClass();

        // use secondClassObject to set instance variables in Class 2
        secondClassObject.setX(3);

        secondClassObject.setY(4);

        secondClassObject.setZ(5);

        System.out.println(secondClassObject.toString());

        int x = secondClassObject.getX();

        int y = secondClassObject.getY();

        secondClassObject.getZ();

        firstClassObject.method_01(secondClassObject);

        System.out.println(secondClassObject.toString());
    }


    //create a method that accepts an object as parameter and manipulates SecondClass instance variables
    public void method_01(SecondClass obj) {

        obj.setX(9);
        obj.setY(8);
        obj.setZ(7);

        // pass the instance of Class_02 to method_02 from within method 1
        method_02(obj);


    }


    public void method_02(SecondClass obj) {
        obj.setX(900);
        obj.setY(800);
        obj.setZ(700);

    }


}


class SecondClass {
    private int x;
    private int y;
    private int z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    // allows you to use this method to quickly print out all three variables throughout your code
    @Override
    public String toString() {
        return "SecondClass{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


}
