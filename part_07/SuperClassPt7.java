package part_07;

public class SuperClassPt7 implements InterfaceExample {

    // 3 private instance variables
    private int instvar1;
    private double instvar2;
    private String instvar3;

    // default constructor:
    public SuperClassPt7(){

    }

    // constructor:
    public SuperClassPt7(int instvar1, double instvar2, String instvar3) {
        this.instvar1 = instvar1;
        this.instvar2 = instvar2;
        this.instvar3 = instvar3;
    }

    // getters:
    public int getInstvar1() {

        return instvar1;
    }

    public double getInstvar2() {

        return instvar2;
    }

    public String getInstvar3() {
        return instvar3;
    }

    // setters:
    public void setInstvar1(int instvar1) {
        this.instvar1 = instvar1;
    }

    public void setInstvar3(String instvar3) {
        this.instvar3 = instvar3;
    }

    // 3 public methods in the superclass:
    public void superMethod1(){
        // do something
    }

    public void superMethod2(){
        // do something
    }

    public void superMethod3(){
        // do something
    }

    @Override
    public int add(int a, int b) {
        int y = a + b;
        return y;
    }

    @Override
    public int subtract(int a, int b) {
        int y = a - b;
        return y;
    }

    @Override
    public void printOut(String s) {
        System.out.println(s);
    }

}
