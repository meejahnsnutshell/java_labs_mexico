package part_05.selfTest;

/*
public class Recursion {

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

}

*/


class Recursion {

    String s = "hello";

    // pass reverseS i, which is declared 4 in the main
    void reverseS(int i) {

        // the escape clause, when i gets down to zero it will exit the loop
        if (i == 0) {
            //print the char at the index of i in String s
            System.out.println(s.charAt(i));
            return;
        }
        //print the char at the index of i in String s
        System.out.println(s.charAt(i));
        // recursion! calls itself at one less than the current index
        reverseS(i - 1);
    }

    public static void main(String[] args) {
        // hello is length of 5, 4 is highest index, could do s.length
        int i = 4;

        // create object to call reverseS
        Recursion obj = new Recursion();

        // call reverseS on i
        obj.reverseS(i);

    }
}


