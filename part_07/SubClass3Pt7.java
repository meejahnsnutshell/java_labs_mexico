package part_07;

public class SubClass3Pt7 extends SubClassPt7 {

    String subClass3name;
    int subClass3Int;
    double subClass3Double;

    public SubClass3Pt7() {

    }

    public SubClass3Pt7(String subClass3name, int subClass3Int, double subClass3Double) {
        this.subClass3name = subClass3name;
        this.subClass3Int = subClass3Int;
        this.subClass3Double = subClass3Double;
    }

    public SubClass3Pt7(int instvar1, double instvar2, String instvar3, String subClassInstVar1,
                        int subClassInstVar2, String subClass3name, int subClass3Int,
                        double subClass3Double) {
        super(instvar1, instvar2, instvar3, subClassInstVar1, subClassInstVar2);
        this.subClass3name = subClass3name;
        this.subClass3Int = subClass3Int;
        this.subClass3Double = subClass3Double;
    }

    public void subClass3Pt7method1(){
        // do something
    }

    public void subClass3Pt7method2(){
        // do something
    }

    public void subClass3Pt7method3(){
        // do something
    }


}
