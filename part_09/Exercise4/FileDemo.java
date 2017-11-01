package part_09.Exercise4;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File a = new File("/home/the-meej/CodingNomads/CopyFileTest/CopyFile5.csv");

        // A long value representing the time the file was last modified, measured in milliseconds since
        // the epoch (00:00:00 GMT, January 1, 1970), or 0L if the file DNE or an I/O error occurs
        long lastModified = a.lastModified();
        System.out.println(lastModified);

        // boolean canWrite() : Tests whether the application can modify the file denoted by this
        // abstract pathname.
        boolean canWrite = a.canWrite();
        System.out.println(canWrite);

        // sets the file to read only
        boolean setReadOnly = a.setReadOnly();

        // this should now return false:
        canWrite = a.canWrite();
        System.out.println(canWrite);


    }
}
