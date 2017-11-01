package part_07;

public class part07Demo {

    public static void main(String[] args) {

        // an object of the SuperClass, called obj:
        SuperClassPt7 obj = new SuperClassPt7();

        // calling the add method on the SuperClass object, obj:
        int x = obj.add(2, 5);
        System.out.println("Addition = " + x);

        // an object of subClass, called bro:
        SubClassPt7 bro = new SubClassPt7(7, 4.0, "Hey",
                "I like to skateboard", 10);

        bro.backToThe90s(bro.subClassInstVar1);


    }
}
