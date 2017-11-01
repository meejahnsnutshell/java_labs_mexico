package part_09.Exercise2;

import java.io.*;

/*
Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all
connections

Buffered input stream is a byte stream
*/

public class BufferedInputStreamDemo {

    public static void main(String[] args) {

        int i;

        // First make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        // try with resources, will automatically close when done, so don't need finally
        try(FileInputStream fis = new FileInputStream(args[0]);
            BufferedInputStream bis = new BufferedInputStream(fis)) {

            do {
                int val = bis.read();

                System.out.print(val);

            }while(bis.read()!=-1);


        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");

        } catch(IOException exc){
            System.out.println("IO Exception");

        }
    }
}
