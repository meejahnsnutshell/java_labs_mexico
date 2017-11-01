package part_07;

public class SubClassPt7 extends SuperClassPt7 {

    // subclass instance variables:
    String subClassInstVar1;
    int subClassInstVar2;

    // default constructor:
    public SubClassPt7() {

    }

    // constructor that utilizes super to set instance variables from the superclass plus it's own using this:
    public SubClassPt7(int instvar1, double instvar2, String instvar3, String subClassInstVar1,
                       int subClassInstVar2) {
        super(instvar1, instvar2, instvar3);
        this.subClassInstVar1 = subClassInstVar1;
        this.subClassInstVar2 = subClassInstVar2;

    }

    // 3 methods in each subClass:
    // method to manipulate private var in SuperClassPt7:
    public void manipulateSuperClassPrivateVars(int y){
        setInstvar1(y);
    }

    // method that adds "yo" to the end of every String.
    public void backToThe90s(String instvar3){
         String msg = instvar3 + ", yo.";
        System.out.println(msg);

    }


    public void subClassPt7method3(){
        // do something
    }
}


