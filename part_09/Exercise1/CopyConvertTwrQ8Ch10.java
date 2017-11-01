package part_09.Exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyConvertTwrQ8Ch10 {

    public static void main(String args[]) throws IOException {
        int i;

        // First, confirm that both files has been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Open and manage two files via the try statement
        // aka try with resources
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if(i != -1) {
                    // add an if here to check if i = ' '
                    if (i == ' '){
                        // if a space is found, change it to hyphen:
                        i = '-';
                        fout.write(i);
                    } else {
                        fout.write(i);
                    }

                }
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

