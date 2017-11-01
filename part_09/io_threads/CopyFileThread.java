package part_09.io_threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileThread implements Runnable {

    // create a Thread instance:
    Thread thrd;
    // String instance var for the file path we will copy from:
    String readFrom;
    // String instance var for the file path to copy to (creates file if doesn't exist):
    String writeTo;

    // Constructor that passes a name, and the file locations, and calls start so threads start
    // running immediately as they're created:
    CopyFileThread(String name, String readFrom, String writeTo) {
        thrd = new Thread(this, name);
        this.readFrom = readFrom;
        this.writeTo = writeTo;
        thrd.start();
    }

    // must include the run method because we are implementing Runnable
    // run calls copyFile()
    @Override
    public void run() {
        copyFile();
    }

    // method to copy the file:
    public void copyFile(){
        int i;

        // using try with resources to eliminate some code:
        // fin opens file, fout writes to a file
        try(FileInputStream fin = new FileInputStream(readFrom);
            FileOutputStream fout = new FileOutputStream(writeTo)) {

            // go through the file, reading & writing byte by byte,
            // until file returns -1 (end of file):
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);

        }
    }
}
