package part_05.selfTest;


public class StackExample {

    private char[] stk;
    private int pushloc; // the put = push and get = pop indices

    StackExample(int size) {

        stk = new char[size]; // allocate memory for queue
        pushloc = 0;
    }

    // push a character into the stack
    void push(char ch) throws StackFullException {

        if (pushloc == stk.length) {
            throw new StackFullException(stk.length);
            //System.out.println(" – Stack is full.");
            // return;
        }
        else
            stk[pushloc++] = ch;

    }

    // pop a character from the stack
    char pop() throws StackEmptyException {

        if (pushloc == 0) {
            //System.out.println(" – Stack is empty.");
            throw new StackEmptyException();
        } //return (char) 0;
        else {
            //System.out.println(stk[pushloc]);
            return stk[--pushloc];
        }

    }

}

// Demonstrate the Stack class.
class StackDemo {

    public static void main(String args[]) {
        StackExample stackOne = new StackExample(4);

        char ch = 'a';

        for (int i = 0; i < 5; i++) {
            //char stacking;

            try {
                stackOne.push(ch);
                // removed use of stacking var, gave a type error (expected void got char)

            } catch (StackFullException e) {
                //stacking = '0';
                System.out.println(e.toString());
            }

            ch++;
            //System.out.println(stacking);
        }


//        stackOne.push('h');
//        stackOne.push('e');
//        stackOne.push('l');
//        stackOne.push('l');
//        stackOne.push('o');

        for (int i = 0; i < 5; i++) {
            char popping;

            try {
                popping = stackOne.pop();
            } catch (StackEmptyException e) {
                popping=0;
                System.out.println(e.toString());
            }

            System.out.println(popping);
        }


//        // Demonstrate custom exceptions for Stack full and Stack empty
//
//        StackExample stackTwo = new StackExample(5);
//        stackTwo.push('h');
//        stackTwo.push('e');
//        stackTwo.push('l');
//        stackTwo.push('l');
//        stackTwo.push('o');
//        stackTwo.push('!');
//
//        for (int i = 0; i < 6; i++) {
//            char stacking = stackTwo.pop();
//            System.out.println(stacking);
//        }
    }
}
