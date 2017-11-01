package part_09.Exercise3;

import java.io.*;

/*
Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
be sure to close all connections
*/

public class BRDemo {

    public static void main(String args[]){

        // coding the file in rather than entering file as command line arg:
        String file = "/home/the-meej/CodingNomads/Apoapse_Parameters-8.csv";

        // using try with resources, so files automatically close.
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String readLine;

            System.out.println("Reading the file using readLine(): ");
            while ((readLine = br.readLine()) != null) {
                System.out.println(readLine);
            }

        } catch (IOException exc){
            System.out.println("Something went wrong");
        }
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");

        try(BufferedReader br2 = new BufferedReader(new FileReader(file))){
            int justRead;

            System.out.println("Reading the file using read(): ");

            while ((justRead = br2.read()) != -1) {
                System.out.print((char) justRead);
            }

        } catch (IOException exc){
            System.out.println("Something went wrong");
        }
    }
}
