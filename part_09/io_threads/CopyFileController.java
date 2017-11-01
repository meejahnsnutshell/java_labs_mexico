package part_09.io_threads;

public class CopyFileController {

    public static void main(String[] args) {

        String fileToCopy = "/home/the-meej/CodingNomads/CopyFileTest/Apoapse_Parameters-8.csv";
        String filePath = "/home/the-meej/CodingNomads/CopyFileTest/";

        // create 5 threads that will read the same file, and copy it to 5 different files
        CopyFileThread thread1 = new CopyFileThread("thread1", fileToCopy,
                filePath + "CopyFile1.csv");
        CopyFileThread thread2 = new CopyFileThread("thread2", fileToCopy,
                filePath + "CopyFile2.csv");
        CopyFileThread thread3 = new CopyFileThread("thread3", fileToCopy,
                filePath + "CopyFile3.csv");
        CopyFileThread thread4 = new CopyFileThread("thread4", fileToCopy,
                filePath + "CopyFile4.csv");
        CopyFileThread thread5 = new CopyFileThread("thread5", fileToCopy,
                filePath + "CopyFile5.csv");
    }
}
