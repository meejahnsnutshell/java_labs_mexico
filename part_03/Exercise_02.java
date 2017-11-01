package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class TheThreeMethodClass {

    int a = 8;
    int b = 4;


    public static void main(String[] args) {
        TheThreeMethodClass oneObject = new TheThreeMethodClass();

        int x = oneObject.Addition();
        System.out.println(x);

        int y = oneObject.Subtraction();
        System.out.println(y);


    }

    int Addition() {
        return a + b;

    }

    int Subtraction() {
        return a - b;

    }



}