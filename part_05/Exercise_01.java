package part_05;

/**
 * Write three classes. The Class_01 should contain the main method.
 * The main method should create an instance of Class_02.
 * Class_02 must have several private instance variables.
 * Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables.
 * Use Class_02 to set the private variables within Class_03.
 *
 * Please note, do not use the constructor of any of these classes to set the private instance variables.
 * Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

// 1st class
class Class_01{

    // put the main method in Class_01:
    public static void main(String[] args) {

        // creating an instance of Class_02 in main method:
        Class_02 classTwoObject = new Class_02();

        classTwoObject.setX(2);
        int x = classTwoObject.getX();
        System.out.println(x);

        classTwoObject.setY(3);
        int y = classTwoObject.getY();
        System.out.println(y);

        classTwoObject.setZ(4);
        int z = classTwoObject.getZ();
        System.out.println(z);

        // call the method created to get & set Class_03's instance vars.
        Class_02.getAndSetVarsinClass_03();



    }

}

// 2nd class
class Class_02{
    // several private instance variables in Class_02
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static void getAndSetVarsinClass_03() {

        // create instance of Class_03 within Class_02:
        Class_03 classThreeObject = new Class_03();

        classThreeObject.setA(5);
        double a3 = classThreeObject.getA();
        System.out.println(a3);

        classThreeObject.setB(6);
        double b3 = classThreeObject.getB();
        System.out.println(b3);

        classThreeObject.setC(7);
        double c3 = classThreeObject.getC();
        System.out.println(c3);

    }


}

// 3rd class
class Class_03{

    // Class_03 has several private instance variables
    private double a;
    private double b;
    private double c;

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }



}