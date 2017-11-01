package part_09.Exercise1; // ~/CodingNomads/Notes/Arrays.txt

import java.io.*;

// Write copy a file, and convert all spaces into hyphens

public class CopyAndConvertQ7Ch10 {

    public static void main(String args[]) throws IOException
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

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

            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) {
                    fin.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) {
                    fout.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
