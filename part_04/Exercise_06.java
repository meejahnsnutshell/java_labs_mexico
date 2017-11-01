package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {
    private int exampleSixQ[];              // this array holds the queue
    private int putloc, getloc;             // the put and get indices

    Queue(int size) {                       // a constructor, never has a return type
        exampleSixQ = new int[size];        // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(int x) {
        if(putloc==exampleSixQ.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        exampleSixQ[putloc++] = x;
    }

    // get a character from the queue
    public int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return 0;
        }

        return exampleSixQ[getloc++];
    }
}

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        Queue myQ = new Queue(101);
        int count;
        int i;

        // Store numbers 0 through 100 in myQ.
        for(i=0; i <= 100; i++)                     // should do array length rather than specific #
            myQ.put(i);

        // retrieve and display elements from myQ
        System.out.print("Contents of myQ: ");
        for(i=0; i <= 100; i++) {
            count = myQ.get();

            if((count == 0) || (count % 2 ==0)) System.out.print(count+ ",");
        }

        System.out.println("\n");


    }
}