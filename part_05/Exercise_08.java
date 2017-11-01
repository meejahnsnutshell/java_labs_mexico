package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance
 * variables of the outer class. Also, within the inner class, call at least two methods that have a return type
 * of int. Add these two ints together and set a final instance variable in the outer with this value.
 *
 * All you need to do is use the inner class to access the instance variables of the outer class. You can also
 * use the inner to access any of the methods in the outer class, even if they're private.
 so instead of "set variables in outer class" it's "access variables in outer class"
 */


class Robot {

    private int id;

    class Brain {

        public void think() {

            System.out.println("Robot " + id + " is thinking.");
        }

    }

    public Robot(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot : " + id);
        Brain brain = new Brain();
        brain.think();

    }
}


class RobotDemo {

    public static void main(String[] args) {

        Robot robot = new Robot(45678);
        robot.start();

    }

}

/* // An internet example:

class OuterClass {
    private String instanceVbl;


    private void myOuterMethod() {
        InnerClass ic = new InnerClass(this);
        ic.someInnerMethod();
    }

    class InnerClass {

        OuterClass outer;

        public InnerClass (OuterClass outer) {
            this.outer = outer;
        }

        public void someInnerMethod() {
            String s = outer.instanceVbl;
            System.out.println(s);

        }
    }
}
*/




//Started fresh for my second attempt
/*
class Out {
    private String name;
    private int age;
    private String hairColor;

    public Out(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public static void main(String[] args) {

        Out outObj = new Out("Jerry", 65, "silver");

        outObj.printName();

    }


    class In {

        void printName(){
            System.out.println(name);
        }

    }

}
*/

//My first attempt
/*

class Outer {

    private int outerA = 1;
    private int outerB = 2;
    private int outerC = 3;
    int sum;

    private int addingOuterInstanceVars(int outerA, int outerB, int outerC){
        return outerA + outerB + outerC;
    }

    private void displayOuterA(){
        System.out.println(outerA);
    }


    public static void main(String[] args) {

    }

    class Inner {



        int sum = addingOuterInstanceVars(outerA, outerB, outerC);


    }


}
*/




